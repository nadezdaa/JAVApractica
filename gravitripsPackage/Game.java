package gravitripsPackage;

import java.util.Scanner;
import static gravitripsPackage.FieldSymbol.*;

public class Game {

	private final Field field;
	private Player[] players;
	private final FieldSymbol[] token = { X, O };

	public Game(Field field, Player humanPlayer, Player computerPlayer) {
		this.field = field;
		players = new Player[] { humanPlayer, computerPlayer };
		for (int i = 0; i < 2; i++)
			players[i].setToken(token[i]);
	}

	Scanner scanner = new Scanner(System.in);

	public void gameStart() {

		field.FieldStart();

		int current = 1;
		do {
			current = (current == 0) ? 1 : 0;
			playerTurn(current);
		} while (!field.WinConditions(token[current]) && !field.draw());
		announceTheWinner(players[current], token[current]);
	}

	public void playerTurn(int current) {
		boolean valid = false;
		do {
			int columNumber = players[current].doMove(field);
			valid = field.dropTokenIntoColumn(columNumber, token[current]);
		} while (!valid);
	}

	public void announceTheWinner(Player current, Enum<FieldSymbol> fieldSymbol) {
		if (field.WinConditions(token[0])) {
			field.printField();
			System.out.println(token[0] + " token won the game!");
		}
		if (field.WinConditions(token[1])) {
			field.printField();
			System.out.println(token[1] + " token won the game!");
		} else if (field.draw()) {
			System.out.println("DRAW!");
		}
	}

}