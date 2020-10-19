import java.awt.EventQueue;
import java.util.Scanner;

import javax.swing.JFrame;

public class Principal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		// Llamada a la función
		contarLetras();
	}

	// Función para introducir un texto y contar sus letras
	private static void contarLetras() {
			Scanner sc = new Scanner (System.in);
			System.out.println("Introduce un texto.");
			String contLetras = sc.nextLine();
			System.out.println(contLetras.length());
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
