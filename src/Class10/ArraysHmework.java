package Class10;

public class ArraysHmework {

	public static void main(String[] args) {

		String [] countries = new String[3];
		
		countries [0] = "Afghanistan";
		countries [1] = "Pakistan";
		countries [2] = "India";
		
		System.out.print(countries[0]+" ");
		System.out.print(countries[1]+" ");
		System.out.print(countries[2]+" ");
		
		System.out.println();
		System.out.println();
		
		String [] countries1 = {"Paris", "Germany", "Australia"};
		
		System.out.print(countries1[0]+" ");
		System.out.print(countries1[1]+" ");
		System.out.print(countries1[2]+" ");
		
			System.out.println();
			System.out.println();
			
			for(String world:countries) {
				System.out.print(world+" ");
			}
			
			System.out.println();
			System.out.println();
			
			for(int i = 0; i<countries1.length; i++) {
				System.out.print(countries1[i]+" ");
			}
			System.out.println();
			System.out.println();
			for(int i = 0 ; i<countries.length; i++) {
				System.out.print(countries[i]+" ");
			}
			System.out.println();
			System.out.println();
			for(String world1:countries1) {
				System.out.print(world1+" ");
				
			}
		}
	}


