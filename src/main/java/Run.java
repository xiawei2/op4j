import com.sun.jna.platform.win32.COM.util.Factory;
/**
 * 注册后 执行
 * @author Can
 *
 */
public class Run{
	

	public static void main(String[] args) {
		//demo1
		IOpInterface op = Op.getOp();
		System.out.println(op.Ver());
		String p = op.AStarFindPath(10,10,"1,0|1,1|1,2|1,3",0,0,9,9);
		System.out.println(p);


		//demo2
//		Ole32.INSTANCE.CoInitializeEx(Pointer.NULL, Ole32.COINIT_MULTITHREADED);
//		OpInterface2 op2 = new OpInterface2();
//		System.out.println("demo2: " + op2.Ver());
	}

}
