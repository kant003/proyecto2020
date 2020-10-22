
import java.util.regex.*;
import java.io.*;

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

	public static String TextoEnMinusculas(String texto) {
		return texto.toLowerCase();
	}
	
	/**
	 * Funcion que recibe un texto y este se guarda en el fichero "historial.txt"
	 * los textos guardados estan separados por un triple espacio en el fichero
	 * 
	 * @param textoRecibido String a guardar en el historial
	 * @throws IOException
	 */
	public void guardarEnHistorial(String textoRecibido) throws IOException {
		File historial = new File("historial.txt");
		FileWriter fw = null;

		fw = new FileWriter(historial, true);
		fw.write("   " + textoRecibido);
		fw.close();
	}
	
	public static int contarVocales(String texto) {
		int CuentaVocales=0;
		String Vocales = "AEIOUaeiouáéíóú";
		
		for(int i = texto.length()-1; i >= 0; i--) {
			for(int j = Vocales.length()-1; j >= 0; j--) {
				if (texto.charAt(i) == Vocales.charAt(j)) {
				CuentaVocales++;
				}
			}
		}
		return CuentaVocales;

	}

}
