package com.cisc181.core;

public class PersonException extends Exception {

	private Person P;
	
	public PersonException(Person P){
		super();
		this.P=P;
	}
	public Person getP(){
		return P;
	}
}
