package com.Op4j;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.platform.win32.COM.util.Factory;

/**
 * @author xiawei
 * @version 1.0
 * @date 2023/03/08 1:01
 */
public class Op {
    static IOpInterface op;

    /**
     * 获取op接口
     * @return
     */
    public static IOpInterface getOp(){
        if (op == null){
            // 如果未注册，则先进行注册进行
            if (!RegOp.reg){
                RegOp.RegOps();
            }
            return new Factory().createObject(OpInterface.class);
        }else {
            return op;
        }

    }

    /**
     * 获取新的op接口
     * @return
     */
    public static IOpInterface getNewOp(){
        // 如果未注册，则先进行注册进行
        if (!RegOp.reg){
            RegOp.RegOps();
        }
        return new Factory().createObject(OpInterface.class);
    }

}
