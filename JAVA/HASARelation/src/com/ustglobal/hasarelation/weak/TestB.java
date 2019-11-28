package com.ustglobal.hasarelation.weak;

public class TestB {
	public static void main(String[] args) {

		Music m = new Music();
		System.out.println(m.name);
		m.playSong();
		System.out.println("======");

		m.c.ride();
		System.out.println(m.c.name);
		System.out.println(m.c.yom);
	}

}
