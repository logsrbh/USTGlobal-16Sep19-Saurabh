package com.ustglobal.didemo;

import com.ustglobal.didemo.dao.I;
import com.ustglobal.didemo.impl.A;
import com.ustglobal.didemo.util.DiManager;

public class MainClass {
	
	public static void main(String[] args) {
		
		I i = DiManager.getI();
		
		i.m1();
		i.m2();
		i.m3();
		
		
	}

}
