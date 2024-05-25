package at.stams.tomi;

public class InvalidInputException extends Exception {

	private String input;

	public InvalidInputException(String input) {
		this.input = input;
	}
}
