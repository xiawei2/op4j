package com.Op4j;

import cn.hutool.core.io.resource.ClassPathResource;
import com.sun.jna.Library;
import com.sun.jna.Native;

import javax.annotation.PostConstruct;
import java.io.*;
import java.net.JarURLConnection;
import java.net.URL;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

class RegOp {
    static boolean reg = false;
    static String tool;
    static String opPath;
    static String path = getDllPath("dllDir", "op_x64.dll");
    static {
        tool = path+ "tools_64.dll";
        opPath = path + "op_x64.dll";
    }

    public static void main(String[] args) {

        if (Load.freeCom.setupA(opPath) == 1) {

            System.out.println("op插件注册成功");
        }
    }

    public static boolean RegOps() {
        if (Load.freeCom.setupA(opPath) == 1) {
            reg = true;
            System.out.println("op插件注册成功");
            return true;
        }
        return false;
    }

    public String getPath(String path) {
        return getClass().getClassLoader().getResource(path).getPath().substring(1).replace('/', '\\');
    }

    public interface Load extends Library {
        Load freeCom = (Load) Native.load(tool, Load.class);

        int setupA(String path);
    }



    @PostConstruct
    private static String getDllPath(String dllDir, String dllName) {
        try {
            String dllPath = new ClassPathResource("/" + dllDir + "/").getAbsolutePath() + dllName;
            if (dllPath.indexOf(".jar") > 0) {
                dllPath = dllPath.substring(0, dllPath.lastIndexOf(".jar"));
                dllPath = dllPath.substring(0, dllPath.lastIndexOf("/"));
                dllPath = dllPath + "/data";
                copyDir(dllPath, dllDir);
                System.out.println("dll加载路径：" + dllPath);
                return dllPath + "/";
            } else {
                return new ClassPathResource("/" + dllDir + "/").getAbsolutePath();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * 复制文件夹下所有文件
     *
     * @author tarzan LIU
     * @date 2020/10/22
     */
    private static void copyDir(String javaUrl, String dllDir) throws IOException {
        URL url = new ClassPathResource(dllDir + "/").getUrl();
        String jarPath = url.toString().substring(0, url.toString().indexOf("!/") + 2);
        URL jarURL = new URL(jarPath);
        JarURLConnection jarCon = (JarURLConnection) jarURL.openConnection();
        JarFile jarFile = jarCon.getJarFile();
        Enumeration<JarEntry> jarEntrys = jarFile.entries();
        while (jarEntrys.hasMoreElements()) {
            JarEntry entry = jarEntrys.nextElement();
            String name = entry.getName();
            if (name.contains(dllDir) && !entry.isDirectory()) {
                String[] strs = name.split("/");
                copyFile(strs[strs.length - 1], javaUrl, dllDir);
                System.out.println("file name is ：" + strs[strs.length - 1] + " finish copy!!");
            }
        }
    }

    /**
     * 复制一份dll放到系统临时文件夹中，处理jar包，dll无法读取问题（代替loadLibrary）
     *
     * @author tarzan LIU
     * @date 2020/10/16
     */
    private synchronized static void copyFile(String libName, String javaUrl, String dllDir) throws IOException {
        InputStream in = null;
        FileOutputStream writer = null;
        File make = new File(javaUrl);
        if (!make.exists() && !make.isDirectory()) {
            make.mkdirs();
        }
        File extractedLibFile = new File(javaUrl + File.separator + libName);
        try {
            String dllUrlInJar = "/" + dllDir + "/";
            in = new ClassPathResource(dllUrlInJar + libName).getStream();
            if (in == null) {
                in = new ClassPathResource(libName).getStream();
            }
//            JNIMapUtil.class.getResource(libName);
            BufferedInputStream reader = new BufferedInputStream(in);
            writer = new FileOutputStream(extractedLibFile);
            byte[] buffer = new byte[1024];
            while (reader.read(buffer) > 0){
                writer.write(buffer);
                buffer = new byte[1024];
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                in.close();
            }
            if (writer != null) {
                writer.close();
            }
        }
    }
}