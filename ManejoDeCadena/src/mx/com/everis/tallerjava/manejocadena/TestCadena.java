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
	}

}
