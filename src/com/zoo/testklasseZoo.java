package com.zoo;

public class testklasseZoo {

	public static void main(String[] args) {
		Tier t = new Katze("Riddick", 2);
		Katze k = new Katze("Goddy", 10);
		Tieger ti = new Tieger("Mailia", 5);
		
		ti.f�ttern();
		t.f�ttern();
		k.f�ttern();
	
//		t = k ;
		k.streicheln();
	}
}
