package com.syntaxInJava2;

public class primitiveCastingOctober3 {

	public static void main(String[] args) {
		double d = 12/7;
		System.out.println(d); // 

		double e = 9;
		System.out.println(e); // this is integer and we try to assign is to double. that is why it is not giving the right answer.
		
		int i  = (int) 9.99;
		System.out.println(i); // we lost .99 value cause we used NARROWING . 
		
		byte b = (byte) 130;
		System.out.println(b);
		
		
	}

}
