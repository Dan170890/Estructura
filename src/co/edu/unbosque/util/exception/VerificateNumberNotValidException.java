package co.edu.unbosque.util.exception;

public class VerificateNumberNotValidException extends Exception{
	public VerificateNumberNotValidException() {
		super("The number cant be a symbol, space and letter");
	}

}
