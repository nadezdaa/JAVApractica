package gravitripsPackage;

import java.util.Random;

public class ComputerPlayer extends Player {

	Random random = new Random();
	private Field field;

	public ComputerPlayer(char token) {
		super(token);
	}

	@Override
	public int doMove() {

		int ColumNumber = 0;

		try {
			do {

				ColumNumber = random.nextInt(field.getCOLUMNS());
			} while (field.checkBlankSpace(0, ColumNumber));

		} catch (Exception e) {
			if (ColumNumber < 0 || ColumNumber > field.COLUMNS) {
				throw new IllegalArgumentException();
			}
		}
		return ColumNumber;

	}

	protected FieldSymbol token;

	@Override
	public FieldSymbol getToken() {
		return token;
	}
}
