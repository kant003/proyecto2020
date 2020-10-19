import java.util.Scanner;

public class TextUtility {
	static Scanner paco = new Scanner(System.in);
	
	public static String TextoMayusuculas(String texto) {
		
		texto=paco.next();
		texto.toUpperCase();
		
		return texto;
	}
	
	
}
