package com.syntaxInJava2;

public class AdditionVsConcatenation {

	public static void main(String[] args) {
		int a  = 100;
		int b = 200;
		String x = "Hello";
		String y = "Friends";
		
		System.out.println(a +b+ " " +x+ " " +y);
		
		System.out.println(a + y+ a +b);
		System.out.println(x + y+(a + b));
		System.out.println(x+y+a+b); // HelloFriends100200 cause a and b are not doing anything between themselves except sit next to each other.
		
	}

}
