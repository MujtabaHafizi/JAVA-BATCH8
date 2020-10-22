package Class6;

public class NotMoreExamples {

	public static void main(String[] args) {

		boolean isJavaEasy = false;
		if (!isJavaEasy) {
			System.out.println("Pleae try to spend more time with Java");
		}

		System.out.println("              \n");
		String day = "saturday";
		if (!day.equals("sunday")) { // if day is not Sunday i am go
			System.out.println(" I am going to work1");
		}
		String day1 = "monday";
		if (day.equals("sunday")) {
			System.out.println("I am going to shopping");
		}

		String day2 = "sunday";
		if (!(day2.equals("sunday") || day2.equals("saturday"))) { // true + true = true.
			System.out.println("I am going to work2");
		}

		String day3 = "sunday";
		if (!day2.equals("sunday") || day3.equals("saturday")) { // true + true = true.
			System.out.println("I am going to work3");
		}

		String day4 = "sunday";
		if (!(day2.equals("sunday") && day4.equals("saturday"))) { // true + true = true.
			System.out.println("I am going to work4");
		}
	}

}