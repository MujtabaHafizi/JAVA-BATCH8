package Class7;

public class Class1 {

	public static void main(String[] args) {
		String month = "July";
		String result = null;
		// if month is december , february == winter
		// if month is march or april or may == Spring

		switch (month) {
		case "December":
		case "January":
		case "February":
			System.out.println("Winter");
			break;

		case "March":
		case "April":
		case "May":
			System.out.println("Spring");
			break;
			
		case "June":
		case "July":
		case "August":
			System.out.println("Summer");
			break;

		}

	}

}
