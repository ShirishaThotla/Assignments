package Question4;

public class CustomException extends Exception {

	String message;

	public CustomException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
}
