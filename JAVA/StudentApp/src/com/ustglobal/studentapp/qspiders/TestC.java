package com.ustglobal.studentapp.qspiders;

import com.ustglobal.studentapp.jspiders.Angular;
import com.ustglobal.studentapp.jspiders.React;

public class TestC {
	public static void main(String[] args) {

		Angular a = new Angular();
		a.teachAngular();
		React t = new React();
		t.teachReact();
		
		StringBuffer s = new StringBuffer();
		System.out.println(s.capacity());
	}
}
