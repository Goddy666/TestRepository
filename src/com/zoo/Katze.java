package com.zoo;

public class Katze extends Tier implements streichelbar {

	public Katze(String name, int alter) {
		super(name, alter);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void füttern() {
		// TODO Auto-generated method stub
		System.out.println("Du Fütterst die Katze");
	}

	@Override
	public void streicheln() {
		// TODO Auto-generated method stub
		System.out.println("Katze Wird gestreichelt und shnurrt!");
		System.out.println("u re dead !!");
	}

}
