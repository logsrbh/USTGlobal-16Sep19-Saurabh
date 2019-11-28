package com.ustglobal.objectclass;

public class USBDrive {

	public static void read(Object obj) {
		if(obj instanceof PenDrive)
		{
			PenDrive p =(PenDrive) obj;
			p.read();
			p.write();

		}else if (obj instanceof Mouse) {
			Mouse m = new Mouse();
			m.click();
			m.scroll();

		}else {
			System.out.println("Invalid");
		}



	}
}
