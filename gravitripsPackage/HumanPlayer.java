package gravitripsPackage;

import java.util.Scanner;

public class HumanPlayer extends Player {

	Scanner scanner = new Scanner(System.in);

	@Override
	public int playerMoveReturn(Field field) {
		System.out.println("Please enter column number:");
		field.printField();
		int columNumber;
		columNumber = Integer.parseInt(scanner.nextLine());
		columNumber = columNumber - 1;
		if (columNumber > 0 && columNumber < field.columns){
			System.out.print("Please try again. The column must be in a range betwen 1-7.");
		}
		return columNumber;
	}
}
