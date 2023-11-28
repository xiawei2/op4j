import com.sun.jna.platform.win32.COM.util.Factory;

/**
 * @author xiawei
 * @version 1.0
 * @date 2023/03/08 1:01
 */
public class Op {
    static {

    }
    public static IOpInterface getOp(){
        return new Factory().createObject(OpInterface.class);
    }
}
