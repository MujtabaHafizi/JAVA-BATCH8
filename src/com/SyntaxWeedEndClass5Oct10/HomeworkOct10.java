package com.SyntaxWeedEndClass5Oct10;

import java.util.Scanner;

public class HomeworkOct10 {

	public static void main(String[] args) {

	
	double commission ;
	double sales  ;	
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter the sales amount");
	sales = scan.nextInt();
	if(sales>=10 && sales<100) {
		commission = (sales * 10) / 100;
	}else if(sales>=100 && sales<200) {
		commission = (sales* 20) /100;;
	}else if(sales>=200 && sales<500) {
		commission = (sales * 30)/100;
	}else if(sales>=500) {
		commission = (sales * 50)/100;
	}else {
		commission = 0;
	}
	System.out.println("Your will get $"  +commission+ " commission");
	if(commission>1000) {
		System.out.println("You are an awesom seller");

	}
	}

}
