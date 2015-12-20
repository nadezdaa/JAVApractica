package gravitripsPackage;

import java.util.Scanner;

public class Game {

	private final Field field;
	private Player humanPlayer = new HumanPlayer('O');
	private Player computerPlayer = new ComputerPlayer('X');

	public Game(Field field, Player humanPlayer, Player computerPlayer) {
		super();
		this.field = field;
		this.humanPlayer = humanPlayer;
		this.computerPlayer = computerPlayer;
	}

	Scanner scanner = new Scanner(System.in);

	public void gameStart() {

		field.FieldStart();
		field.printField();

		do {
			humanMove();
			computerMove();
		} while (!field.WinConditions(FieldSymbol.O) && !field.WinConditions(FieldSymbol.X));

		announceTheWinner();
	}

	private void announceTheWinner() {
		if (field.WinConditions(FieldSymbol.O)) {
			System.out.println("'O' token won the game!");
		} else if (field.WinConditions(FieldSymbol.X)) {
			System.out.println("'X' token won the game!");
		}
	}

	private void computerMove() {
		int columNumber = computerPlayer.doMove();
		field.dropTokenIntoColumn(columNumber, computerPlayer.getToken());
		field.printField();
	}

	private void humanMove() {
		System.out.println("Please enter column number:");
		int columNumber = humanPlayer.doMove();
		field.dropTokenIntoColumn(columNumber, humanPlayer.getToken());
		field.printField();
	}

}