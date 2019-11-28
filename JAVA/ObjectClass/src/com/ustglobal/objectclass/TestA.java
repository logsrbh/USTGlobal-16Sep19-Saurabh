package com.ustglobal.objectclass;

public class TestA {

	public static void main(String[] args) {

		PenDrive p = new PenDrive();
		USBDrive.read(p);
		
		Mouse m = new Mouse();
		USBDrive.read(m);
	}

}
