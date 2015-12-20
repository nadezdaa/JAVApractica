package gravitripsPackage;

public abstract class Player {

	public abstract FieldSymbol getToken();

	public Player(char token) {
		super();
	}

	public abstract int doMove(Field field);

}
