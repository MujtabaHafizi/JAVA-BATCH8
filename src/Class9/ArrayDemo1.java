package Class9;

public class ArrayDemo1 {

	public static void main(String[] args) {

//		int a = 10; // one variable can only hold one value:
//		a = 20;
		
		int [] num = new int[5];
		 num[0]= 10;
		 num[1]= 20;
		 num[2]= 30;
		 num[3]= 40;
		 num[4]= 50;
		 // to access elements from an array?
		 System.out.println(num[1]);
		 System.out.println(num[2]);

		 
		 System.out.println(num[1]+num[4]);
		 System.out.println("Accessing 3 element "+num[2]);
		 
		 // i would like to change 50 to 100;
		 num[4] = 100;
		 System.out.println("Value of 5th elements after change "+ num[4]);
		 // we can place collection of values . 
		 
		 int [] array = new int[2];
		// array[0]= 10.99; // compiler Error CE; type of value must be integer
		 
		// String[] array= new String[4];
		 
		 
		 
		 
	}

}
