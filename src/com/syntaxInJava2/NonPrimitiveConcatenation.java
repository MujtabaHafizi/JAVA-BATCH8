package com.syntaxInJava2;

public class NonPrimitiveConcatenation {

	public static void main(String[] args) {

		String name = "Ahmad";
		
		// i would like to say : My name is Ahmad
		
		System.out.println(" My name is " +name);
		
		String lastName = " Hafizullah";
		System.out.println(name +" "+lastName); 
		
		
		String city =  "Miami";
		// Ahmad lives in Miami
		System.out.println(name+ " lives in "+ city);
		
		
		char grade =  'B';
		// Ahmad is B student.
		System.out.println(name+ " is " +grade+" Student");
		
		int age = 21;
		// Ahmad is 21 years of old.
		System.out.println(name+ " is " +age+" years of old");
		
		
		int date = 27;
		// 27 september
		String month = "September";
		System.out.println(date+ " of "+month);
		
		String state =  "DC";
		String anotherState =  "               DC "; // everything inside the String matters. it is completely two different things . 
		// the second one has a space.
		System.out.println(state);
		System.out.println(anotherState);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}