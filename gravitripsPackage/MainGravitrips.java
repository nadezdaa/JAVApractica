package gravitripsPackage;

public class MainGravitrips {
	public static void main(String[] args) {
		System.out.println("Welcome to gravitrips game! The player who succeedes placing 4 his pieces in a horizontal, vertical or diagonal row wins the game.");
		Field field = new Field(6, 7);
		Game game = new Game(field, new HumanPlayer(), new ComputerPlayer());
		game.gameStart();
	}
}