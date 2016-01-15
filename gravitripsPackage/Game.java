package gravitripsPackage;

import java.util.Scanner;
import static gravitripsPackage.FieldSymbol.*;

public class Game {

	private final Field field;
	private Player player1;
	private Player player2;
	private Player currentPlayer;

	public Game(Field field, Player player1, Player player2) {
		this.field = field;
		this.player1 = player1;
		this.player2 = player2;
		player1.setToken(X);
		player2.setToken(O);
	}

	Scanner scanner = new Scanner(System.in);

	public void gameStart() {

		field.FieldStart();
		currentPlayer = player1;
		do {
			playerTurn(currentPlayer);
			playerTurnSwitching();
		} while (!field.winConditions(currentPlayer.getToken()) && !field.draw());
		announceTheWinner(currentPlayer.getToken());
	}

	private void playerTurn(Player currentPlayer) {
		boolean valid = false;
		do {
			int columNumber = currentPlayer.playerMoveReturn(field);
			valid = field.dropTokenIntoColumn(columNumber, currentPlayer.getToken());
		} while (!valid);
	}

	private void playerTurnSwitching() {
		if (currentPlayer == player1) {
			currentPlayer = player2;
		} else {
			currentPlayer = player1;
		}
	}

	public void announceTheWinner(FieldSymbol token) {
		if (field.winConditions(token)) {
			field.printField();
			System.out.println(token + " token won the game! Congratulations! ");
		} else if (field.draw()) {
			System.out.println("DRAW!");
		}
	}

}