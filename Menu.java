package test;

public enum Menu {
	 ADD(1), PRINT(2), DELETE(3), SAVE(4), LOAD(5),  EXIT(6);

	private int number;

	private Menu(int number) {
		this.number = number;
		}

	public int getNumber() {
		return number;
	}
}
