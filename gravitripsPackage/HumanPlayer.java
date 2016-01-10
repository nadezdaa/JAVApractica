package gravitripsPackage;

import java.util.Scanner;

public class HumanPlayer extends Player {

	Scanner scanner = new Scanner(System.in);

	@Override
	public int doMove(Field field) {
		System.out.println("Please enter column number:");
		field.printField();
		int columNumber;
		columNumber = Integer.parseInt(scanner.nextLine());
		if (columNumber >= 0 && columNumber < field.COLUMNS && field.checkBlankSpace(0, columNumber)){
			System.out.print("Please try again. The column must be empty.");
		}
		return columNumber - 1;
	}
}
