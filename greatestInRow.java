
	import java.util.Scanner;

	public class greatestInRow {
		public static void main(String[] args) {
			System.out.println("Hello, to start game - input a number,if you want to finish enter 0. ");
			Scanner scanner = new Scanner(System.in);
			int number = scanner.nextInt();
			int max = number ;
			do {
				number  = scanner.nextInt();
				if (max < number ){
					max = number;
			     }
			 } while ( number  != 0);
		       System.out.println("Your greatest number = " + max + ". Good bye!");
		       scanner.close();
			}
	     }


