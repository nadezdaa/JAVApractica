package gravitripsPackage;

import java.util.Random;

public class ComputerPlayer extends Player {

	Random random = new Random();

	public ComputerPlayer(char token) {
		super(token);
	}

	@Override
	public int doMove(Field field) {

		int ColumNumber = 0;

		do {

			ColumNumber = random.nextInt(field.getCOLUMNS());
		} while (field.checkBlankSpace(0, ColumNumber));

		return ColumNumber;

	}

	protected FieldSymbol token;

	@Override
	public FieldSymbol getToken() {
		return token;
	}
}
