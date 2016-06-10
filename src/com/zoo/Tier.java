package com.zoo;

public abstract class Tier {
	
	private String name;
	private int alter;
	
	
	
	public Tier(String name, int alter) {
		super();
		this.name = name;
		this.alter = alter;
	}


	public void füttern(){
		System.out.println("Du fütterst  "+ name +"");
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
