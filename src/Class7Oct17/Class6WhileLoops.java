package Class7Oct17;

public class Class6WhileLoops {

	public static void main(String[] args) {
		String day = "Saturday";
		if(day.equalsIgnoreCase("Saturday")) {
			System.out.println("My favorite jave class"); // this will print once
		}
		
		
		 while (day.equalsIgnoreCase("Saturday")) {
			System.out.println("My favorite jave class"); // this will be printed and it won't stop printing.
			day = "Sunday";
		}
		
		boolean isItBreakTime =false;
		if(isItBreakTime) {
			System.out.println("I will get a cup of tea");
		}
	}

}
