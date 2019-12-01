package com.ustglobal.springcore.di;

public class Hello {
	
	
	
	public Hello() {
		System.out.println("Hello Object Created");;
	}

	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	private void init() {
		System.out.println("Init method executing from hello");
	}
	
	private void destroy() {
		System.out.println("Destroy method executing from hello");

	}
	

}
