import java.util.Scanner;

public class guessNumber {
	public static void main(String[] args) {
		System.out.println("I'm thinking of number between 1 and 100.");
		Scanner scanner = new Scanner(System.in);
		int targetNr = (int) (Math.random() * 100);
		boolean trueguess = false;
		int tryNr = 0;
		while (trueguess == false) {
			int enteredNr = scanner.nextInt();
			tryNr++;
			if (enteredNr == targetNr) {
				trueguess = true;
				System.out.println("Your guess is right! You win! I was thinking about number: " + targetNr);
			} else if (enteredNr < targetNr) {
				System.out.println("Fail, number should be higher.");
			} else if (enteredNr > targetNr) {
				System.out.println("Fail, number should be lower.");
			}
		}
		scanner.close();
	}
}