package com.zoo;

public abstract class Tier {
	
	private String name;
	private int alter;
	
	
	
	public Tier(String name, int alter) {
		super();
		this.name = name;
		this.alter = alter;
	}


	public void f�ttern(){
		System.out.println("Du f�tterst  "+ name +"");
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAlter() {
		return alter;
	}


	public void hatGeburstag() {
		alter += 1;
	}

}
