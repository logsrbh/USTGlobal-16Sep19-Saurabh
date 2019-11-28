package com.ustglobal.didemo.util;

import com.ustglobal.didemo.dao.I;
import com.ustglobal.didemo.impl.A;

public class DiManager {

	static A a = null;
	
	public static I getI() {
		if(a==null) {
			a= new A();
		}
		return a;
	}
	
}
