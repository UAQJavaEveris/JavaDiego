package mx.com.everis.tallerjava.manejocadena;

public class TestCadena {
	
	public static void main(String[] args){
		
		String text = "Existen dos tipos de personas en el mundo";
		
		String [] separar = text.split("\\s");
		
		for (int i = 0; i < separar.length; i++) {
			System.out.println(separar[i]);
		}
		
		//String text2 = text.trim();
		
		//System.out.println(text2);
		/**
		 * Remplaza el espacio por el numero 1
		 */
		System.out.println(text.replace(" ", "1"));
	}

}
