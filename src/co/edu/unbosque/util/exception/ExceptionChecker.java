package co.edu.unbosque.util.exception;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExceptionChecker {

	public static void verificarVacio(String x) throws VerificateNullException {
		if (x.contentEquals("")) {
			throw new VerificateNullException();
		}
	}

	public static void verificarNumeroDecimal(String index) throws IdentificacionFloatNotValidException {
		Pattern p = Pattern.compile("^[0-9]+(\\.[0-9]+)?$");
		Matcher m = p.matcher(index);

		if (!m.matches()) {
			throw new IdentificacionFloatNotValidException();
		}
	}

	public static void identificarEnteros(String index) throws VerificateNumberNotValidException {

		Pattern p = Pattern.compile("[^0-9]");
		Matcher m = p.matcher(index);

		if (m.find()) {
			throw new VerificateNumberNotValidException();
		}
	}

	public static void identificarPalabras(String x) throws VerificateLettersNotValidException {
		Pattern p = Pattern.compile("[^a-zA-Z]");
		Matcher m = p.matcher(x);
		if (m.find()) {
			throw new VerificateLettersNotValidException();
		}
	}

	public static void identificarFraseYEntero(String x) throws VerificateNumbersLettersNotValidException {
		Pattern p = Pattern.compile("[^a-zA-Z 0-9 :]");
		Matcher m = p.matcher(x);
		if (m.find()) {
			throw new VerificateNumbersLettersNotValidException();
		}
	}

	public static void identificarFrase(String x) throws VerificatePhrasesNotValidException {
		Pattern p = Pattern.compile("[^a-zA-Z ]");
		Matcher m = p.matcher(x);
		if (m.find()) {
			throw new VerificatePhrasesNotValidException();
		}
	}

}
