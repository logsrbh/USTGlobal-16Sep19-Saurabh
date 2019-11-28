package com.ustglobal.objectclass;

public class TestC {
	public static void main(String[] args) {
		Marker m = new Marker();
		int  h= m.hashCode();
		System.out.println(h);
		String s =m.toString();
		System.out.println(s);
	}
}
