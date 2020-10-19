import java.util.Scanner;

public class TextUtility {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("Introduzca el texto:");
		String word1 = sca.nextLine();		
		System.out.println(word1.charAt(0));
		sca.close();
	}
}
