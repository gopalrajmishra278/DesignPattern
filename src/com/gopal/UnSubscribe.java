package com.gopal;

public class UnSubscribe implements Observer {

	String name;

	UnSubscribe(String name){
		
		this.name = name;
	}

	@Override
	public void notified(String name) {
		
		System.out.println(this.name);
		
	}


}
