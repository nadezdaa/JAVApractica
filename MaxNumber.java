import java.util.Scanner;

public class MaxNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, enter your first number:");
		int a = scanner.nextInt();
		int max = a;
		System.out.print("Enter your second number:");
		int b = scanner.nextInt();
		if ( b > max){
			 max = b;
		 }
		System.out.print("Enter your third number:");
		int c = scanner.nextInt();
		if (c > max) {
			max = c;
		}
		System.out.println("Max Number = " + max); 
		scanner.close();
	}
}
