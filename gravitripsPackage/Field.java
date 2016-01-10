package gravitripsPackage;

import static gravitripsPackage.FieldSymbol.*;

public class Field {
	int ROWS = 6;
	int COLUMNS = 7;

	final FieldSymbol[][] field;

	public int getROWS() {
		return ROWS;
	}

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
		if (field[column][0] != FieldSymbol.FREE_CHAR) {
			return false;
		}
		int y = field[column].length - 1;
		while (field[column][y] != FieldSymbol.FREE_CHAR) {
			y--;
		}
		field[column][y] = value;
		return true;
	}

	public boolean checkBlankSpace(int x, int y) {
		if (field[x][y] != FREE_CHAR) {
			return false;
		}
		return true;
	}

	public boolean WinConditions(FieldSymbol token) {
		return winHorizontal(token) || winVertical(token) || wonIntoDiagonalFirst(token)
				|| wonIntoDiagonalSecond(token);

	}

	public boolean winVertical(FieldSymbol token) {
		int counToken = 0;
		for (int x = 0; x < COLUMNS; x++) {
			for (int y = 0; y < ROWS; y++) {
				if (token.equals(field[x][y])) {
					counToken++;
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
				if (token.equals(field[x][y])) {
					counToken++;
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

	public boolean wonIntoDiagonalFirst(FieldSymbol token) {

		for (int y = ROWS - 1; y > 0; y--) {
			if (winDiagonalFirst(y, token)) {
				return true;
			}
		}
		return false;
	}

	public boolean winDiagonalFirst(int y, FieldSymbol token) {
		int counToken = 0;
		for (int x = 0; x < COLUMNS; x++) {
			if (token.equals(getField()[x][y])) {
				counToken++;
				y--;
				if (y < 0)
					y = ROWS - 1;
			} else {
				counToken = 0;
			}
			if (counToken == 4) {
				return true;
			}
		}
		return false;
	}

	public boolean wonIntoDiagonalSecond(FieldSymbol token) {

		for (int y = ROWS - 1; y > 0; y--) {
			if (winDiagonalSecond(y, token)) {
				return true;
			}
		}
		return false;
	}

	public boolean winDiagonalSecond(int y, FieldSymbol token) {

		int counToken = 0;
		for (int x = (COLUMNS - 1); x > 0; x--) {
			if (token.equals(getField()[x][y])) {
				counToken++;
				y--;
				if (y < 0)
					y = ROWS - 1;
			} else {
				counToken = 0;
			}
			if (counToken == 4) {
				return true;
			}
		}
		return false;
	}

	public boolean draw() {
		for (int y = 0; y < ROWS; y++) {
			for (int x = 0; x < COLUMNS; x++) {
				if (field[x][y] == FREE_CHAR) {
					return false;
				}
			}
		}
		return true;
	}

	public FieldSymbol[][] getField() {
		return field;
	}
}
