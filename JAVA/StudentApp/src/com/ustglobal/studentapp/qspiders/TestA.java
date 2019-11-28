package com.ustglobal.studentapp.qspiders;

//import com.ustglobal.studentapp.jspiders.Angular;
//import com.ustglobal.studentapp.jspiders.React;

import com.ustglobal.studentapp.jspiders.*;

public class TestA {
	public static void main(String[] args) {
		QTP q = new QTP();
		q.teachQtp();

		Selenium s = new Selenium();
		s.teachSelenium();

//		com.ustglobal.studentapp.jspiders.Angular a = new com.ustglobal.studentapp.jspiders.Angular();
//		a.teachAngular();
//	
//		com.ustglobal.studentapp.jspiders.Angular b = new com.ustglobal.studentapp.jspiders.Angular();
//		b.teachAngular();
//	
		Angular an = new Angular();
		an.teachAngular();
		
		React t = new React();
		t.teachReact();
	
	}

}
