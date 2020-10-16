import java.awt.EventQueue;

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
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}
	
	class ValidadorDNI
	{
		private String dni;

			public ValidadorDNI(String dni) {
				this.dni = dni;
			}

		
		public boolean validar() {	
			
			if(dni.length() != 9 || Character.isLetter(dni.charAt(8)) == false ) {
				return false;
			}

			
			if(soloNumeros() == true) {
				return true;
			}
			else {
				return false;
			}
		}

			private boolean soloNumeros() {

				int i, j = 0;
				String numero = ""; 
				String miDNI = "";
				String[] unoNueve = {"0","1","2","3","4","5","6","7","8","9"};

				for(i = 0; i < this.dni.length() - 1; i++) {
					numero = this.dni.substring(i, i+1);

					for(j = 0; j < unoNueve.length; j++) {
						if(numero.equals(unoNueve[j])) {
							miDNI += unoNueve[j];
						}
					}
				}

				if(miDNI.length() != 8) {
					return false;
				}
				else {
					return true;
				}
			}
		
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
