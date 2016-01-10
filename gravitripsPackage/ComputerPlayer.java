package gravitripsPackage;

import java.util.Random;

public class ComputerPlayer extends Player {

	Random random = new Random();

	@Override
	public int doMove(Field field) {

		int ColumNumber;
		ColumNumber = random.nextInt(field.getCOLUMNS());
		return ColumNumber;
	}

}
