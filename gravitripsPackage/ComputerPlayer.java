package gravitripsPackage;

import java.util.Random;

public class ComputerPlayer extends Player {

	Random random = new Random();

	@Override
	public int playerMoveReturn(Field field) {

		int ColumNumber;
		ColumNumber = random.nextInt(field.getColumns());
		return ColumNumber;
	}

}
