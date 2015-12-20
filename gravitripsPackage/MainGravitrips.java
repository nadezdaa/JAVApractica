package gravitripsPackage;

public class MainGravitrips {
	public static void main(String[] args) {
		Field field = new Field(6, 7);
		Game game = new Game(field, new HumanPlayer('X'), new ComputerPlayer('O'));
		game.gameStart();
	}
}