package gravitripsPackage;

import java.util.Scanner;

public class HumanPlayer extends Player {

	Scanner scanner = new Scanner(System.in);

	public HumanPlayer(char token) {
		super(token);
	}


	@Override
	public int doMove(Field field) {
		int columNumber = -1;
		while (true) {
			try {
				columNumber = Integer.valueOf(scanner.nextLine());
			} catch (Exception e) {
				System.out.println(e.getMessage() + "Please make your next column choose: ");
			}
			if (columNumber < 0 || columNumber > field.COLUMNS) {
				throw new IllegalArgumentException();
			}
			return columNumber;
		}
	}

	private FieldSymbol token;

	@Override
	public FieldSymbol getToken() {
		return token;
	}
}
