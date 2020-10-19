import java.util.regex.*;
import java.util.Scanner;

public class TextUtility {

	public boolean ComprobarDni(String dni) {

		Pattern patron = Pattern.compile("[0-9]{8}[A-Z a-z]");
		Matcher mat = patron.matcher(dni);

		if (!mat.matches()) {
			System.out.println("dni incorrecto");

			return false;
		} else {
			System.out.println("correcto");
			return true;
		}
		

	}

}
