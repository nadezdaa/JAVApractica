import java.util.Scanner;

	public class ugadaikaSmart {
		public static void main(String[] args) {
			System.out.println("Hello, please choose one number from a range between 1 and 100 . Program will try to guess it.");

			int min = 1;
			int max = 101;
			int guess = (min + max) / 2;
			System.out.println("Is your number: " + guess);
			System.out.println("Input comment if a number should be higher, lower, or correct: ");

			String TextInput;
			String correct = "correct";
			String lower = "lower";
			String higher = "higher";
			boolean trueguess = false;
			Scanner Scanner = new Scanner(System.in);

			while (trueguess == false) {
				TextInput = Scanner.nextLine();
				if (TextInput.equals(lower)) {
					max = guess;
				}
				if (TextInput.equals(higher)) {
					min = guess;
				}
				if (TextInput.equals(correct)) {
					trueguess = true;
					System.out.println("Thank you! Game over!");
					break;
				}
				guess = (min + max) / 2;
				System.out.println("Is your number: " + guess);
			}
			Scanner.close();
		}
	}

