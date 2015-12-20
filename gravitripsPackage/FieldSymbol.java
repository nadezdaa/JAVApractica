package gravitripsPackage;

public enum FieldSymbol {
	X('X'), O('O'), FREE_CHAR('*');
	char token;

	private FieldSymbol(char token) {
		this.token = token;
	}

	public char toChar() {
		return token;
	}
	

}
