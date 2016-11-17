package mx.com.everis.tallerjava.test;

import java.util.ArrayList;
import java.util.List;

public class TestingColecciones {
	
	public static void main(String[] args){
		
		ArrayList<String> nombre = new ArrayList<String>();
		nombre.add("Diego");
		nombre.add("Ernesto");
		nombre.add("Eduardo");
		
		for(String a : nombre){
			System.out.println(a);
		}
		List<String> apellidos = new ArrayList<String>();
		
		apellidos.add("Arellano");
		apellidos.add("Briseño");
		apellidos.add("Briseño");
		
		for (String p : apellidos){
			System.out.println(p);
		}
		System.out.println("Size apellidos : "+apellidos.size());
		System.out.println(apellidos.get(1));
		
		if (apellidos.contains("Briseño")) {
			System.out.println("Contiene el apellido");
			
		}else{
			System.out.println("No contiene el apellido");
		}
		
		ArrayList<ArrayList<String>> lista = new ArrayList<ArrayList<String>>();
		
		
	}

}
