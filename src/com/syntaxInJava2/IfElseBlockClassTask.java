package com.syntaxInJava2;

public class IfElseBlockClassTask {

	public static void main(String[] args) {

		double comparison1 = 9.99;
		double comparison2 = 6.99;
		if (comparison1 > comparison2) {
			System.out.println("Double value is greater than Comparison");
		} else {
			System.out.println(" Double value is not greater than Comparison");
		}
		System.out.println("                                             \n");
		int temperatureCheck = 70;
		if (temperatureCheck < 32) {
			System.out.println(" Water will freeze with temperature");
		} else {
			System.out.println("Water will not freeze with temperature");
		}
		System.out.println("                              \n");
		boolean sleepy = false;
		if (sleepy) {
			System.out.println("i will take a nap");
		} else {
			System.out.println(" I will study for otherwise for the class");
		}
		System.out.println("                                 \n");
		boolean hungry = true;
		if (hungry) {
			System.out.println(" You can eat something" + "!");
		} else {
			System.out.println("I will continue studying" + "!");
		}
		System.out.println(" \n");
		int t = 100;
		t += 200;
		System.out.println(t);//

	}

}
