package Class7Oct17;

public class Class8WhileLoops {

	public static void main(String[] args) {
		
		int day = 1;
		boolean workDay = true;
		
		while (workDay) {
			if(day<3)
			System.out.println("I need a day off"); // it prints (I need a day off) 5 times.
			day++;
		}
	}

}
