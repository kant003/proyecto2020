import java.io.*;

public class TextUtility {
	/* Funcion que pone un punto en un texto al final si no lo tiene */
	
	public static String ponerPuntoEnTexto(String texto) {
		if(texto.charAt(texto.length()-1)!='.') {
			return texto+='.';
		}
		return texto;
	}
}
