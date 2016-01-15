package gravitripsPackage;

public abstract class Player {
	private FieldSymbol token;

	void setToken(FieldSymbol token) {
		this.token = token;
	}

	public FieldSymbol getToken() {
		return token;
	}

	public abstract int playerMoveReturn(Field field);
}
