package gravitripsPackage;

import static gravitripsPackage.FieldSymbol.*;

public class Field {
	int ROWS = 6;
	int COLUMNS = 7;

	final FieldSymbol[][] field;

	public Field(int colums, int rows) {
		field = new FieldSymbol[rows][colums];
	}

	public void FieldStart() {
		for (int x = 0; x < field.length; x++) {
			for (int y = 0; y < field[x].length; y++) {
				field[x][y] = FREE_CHAR;
			}
		}
	}

	public void printField() {
		for (int x = 0; x < COLUMNS; x++) {
			System.out.print((x + 1) + " ");
		}
		System.out.println();
		for (int y = 0; y < ROWS; y++) {
			for (int x = 0; x < COLUMNS; x++) {
				System.out.print(field[x][y].toChar() + " ");
			}
			System.out.println();
		}
	}

	public Integer getCOLUMNS() {
		return field.length;
	}

	public boolean dropTokenIntoColumn(int column, FieldSymbol value) {
		if (field[0][column] != FieldSymbol.FREE_CHAR) {
			return false;
		}
		int y = field[column].length - 1;
		while (field[y][column] != FieldSymbol.FREE_CHAR) {
			y--;
		}
		field[y][column] = value;
		return true;
	}

	public boolean checkBlankSpace(int row, int column) {
		if (field[row][column] != FREE_CHAR) {
			return false;
		}
		return true;
	}

	public boolean WinConditions(FieldSymbol token) {
		return winHorizontal(token) || winVertical(token);

	}

	public boolean winVertical(FieldSymbol token) {
		int counToken = 0;
		for (int x = 0; x < COLUMNS; x++) {
			for (int y = 0; y < ROWS; y++) {
				if (token.equals(field[y][x])) {
					counToken = counToken++;
				} else {
					counToken = 0;
				}
				if (counToken == 4) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean winHorizontal(FieldSymbol token) {
		int counToken = 0;
		for (int y = 0; y < ROWS; y++) {
			for (int x = 0; x < COLUMNS; x++) {
				if (token.equals(field[y][x])) {
					counToken = counToken++;
				} else {
					counToken = 0;
				}
				if (counToken == 4) {
					return true;
				}
			}
		}
		return false;
	}

}
