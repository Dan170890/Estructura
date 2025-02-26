package co.edu.unbosque.util.exception;



public class IdentificacionFloatNotValidException extends Exception{

	public IdentificacionFloatNotValidException() {
		super("The number cant have letters, symbols and space");
	}
	
}
