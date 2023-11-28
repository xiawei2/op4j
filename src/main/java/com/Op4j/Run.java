package com.Op4j;

import static com.Op4j.RegOp.RegOps;

/**
 * 注册后 执行
 * @author Can
 *
 */
public class Run {
	

	public static void main(String[] args) {
		IOpInterface op = Op.getOp();
		System.out.println(op.Ver());

		//demo2
//		Ole32.INSTANCE.CoInitializeEx(Pointer.NULL, Ole32.COINIT_MULTITHREADED);
//		OpInterface2 op2 = new OpInterface2();
//		System.out.println("demo2: " + op2.Ver());
	}

}
