package Github;


public class ejercicioTexto {

	public static String textoAMostrar(String texto, int punto){
		String textoFinal="";
		int indice = texto.indexOf(".");
	
		if (indice==-1)
			return "";
		else
			return texto.substring(indice,texto.length()-1);
	}
	public static void main(String[] args) {
		int punto = 1; // Mostrara lo escrito despues de este punto
		String texto = "Este es un texto. Esto esta escrito desde el primer punto. Esto esta escrito despues del segundo punto. Esto esta escrito despues del tercer punto";
		String textoDespuesPunto = textoAMostrar(texto, punto);
		System.out.println(textoDespuesPunto);
	}

}
