package Class7Oct17;

public class Class7WhileLoops {

	public static void main(String[] args) {

		boolean workDay=  true;
		int day = 1 ;
		while(workDay) {
			while(day<6) {
				System.out.println("I need a day off");
				day++;
			}
			System.out.println("Why are we using this statement int this example?");
			workDay = false;
		}
		
		
		
		
		
	}

}
