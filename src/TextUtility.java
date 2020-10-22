import java.io.*;
import java.util.Scanner;

public class TextUtility {
	
	static Scanner sc = new Scanner(System.in);
		
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
