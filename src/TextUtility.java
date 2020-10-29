
import java.util.regex.*;
import java.io.*;
import java.util.Scanner;

public class TextUtility {

	
	static Scanner sc = new Scanner(System.in);
		

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
	

	public static int contarA(String cadena) {
        
		
		int posicion, contador = 0;
      
        posicion = cadena.indexOf("a");
        
        while (posicion != -1) { 
            contador++;           
                              
            posicion = cadena.indexOf("a", posicion + 1);
        }
        

        return contador;
        
}
	//METODO PARA QUITAR LAS VOCALES DE UN TEXTO
	
	public String quitarVocales(String cadena) {

		String sinVocales = "";

		sinVocales = cadena.replaceAll("a,A,e,E,i,I,o,O,U,u", "");

		return sinVocales;
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
/**
	 * M�todo que recibe un texto y se devuelven un texto sin todos los espacios
	 * escritos al principio y al final y tambi�n los espacios
	 * m�ltiples(consecutivos) me los convierta en 1 solo espacio.
	 * 
	 * @param texto
	 * @return texto sin espacios de m�s
	 */

	public static String borrarEspacios(String texto) {
		String resultado = "";
		int i;
		int posicion1 = 0;
		for (i = 0; i < texto.length(); i++) {
			if (texto.charAt(i) != ' ') {
				posicion1 = i;
				while ((texto.charAt(i) != ' ') && (i < texto.length() - 1)) {
					i++;
				}

				resultado += texto.substring(posicion1, i + 1);
			}

		}
		if (resultado.charAt(resultado.length() - 1) == ' ') {
			resultado = resultado.substring(0, resultado.length() - 1);

		}

		return resultado;

	}


}
