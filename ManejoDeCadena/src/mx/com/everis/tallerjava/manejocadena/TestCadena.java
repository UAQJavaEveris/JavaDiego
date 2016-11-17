package mx.com.everis.tallerjava.manejocadena;

public class TestCadena {
	
	public static void main(String[] args){
		
		/**
		 * Equals: compara loque esta adentro de memoria
		 * ==: Compara direccion de memoria
		 */
		String nombre = "Diego";
		String nombre2 = new String ("Diego");
		
		if (nombre == nombre2) {
			System.out.println("Son iguales");
		}else{
			System.out.println("No son iguales");
		}
		
		if (nombre.equals(nombre2)) {
			System.out.println("Son iguales");
		}else{
			System.out.println("No son iguales");
		}
		
		System.out.println("------------------------------");
		
		String textcomplet = "Existen dos tipos de personas en el mundo";
		
		String[] text = textcomplet.split(" ");
		//String[] text = textcomplet.split("\\s");
		//System.out.println(text[1]);
		
		for (int i = 0; i < text.length; i++) {
			System.out.println(text[i]);
		}
		
		System.out.println("-----------------------");
		
		String text2 = textcomplet.trim();
		System.out.println(text2);
		
		System.out.println("Posicion : "+text2.indexOf("p"));
		
	}

}
