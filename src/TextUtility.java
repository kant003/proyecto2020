import java.util.regex.*;
import java.util.Scanner;

public class TextUtility {

	public void ComprobarDni() {

		String dni;
		Scanner sc = new Scanner(System.in);
		Pattern patron = Pattern.compile("[0-9]{7,8}[A-Z a-z]");
		System.out.print("Introduce DNI : ");
		dni = sc.nextLine();
		Matcher mat = patron.matcher(dni);
		while (!mat.matches()) {
			System.out.println("El DNI introducido es incorrecto");
			System.out.print("Introduce un DNI correcto: ");
			dni = sc.nextLine();
			mat = patron.matcher(dni);
		}
		System.out.println("El DNI " + dni + " es válido.");
	}
}
