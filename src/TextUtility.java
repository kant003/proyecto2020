import java.io.*;
import java.util.Scanner;

public class TextUtility {
	
	static Scanner sc = new Scanner(System.in);
		
	public static String TextoEnMinúsculas(String texto) {
		return texto.toUpperCase();
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
	
	
	

}
