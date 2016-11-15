package mx.com.everis.tallerjava.arreglos;

import mx.com.everis.tallerjava.tipo.Persona;

public class Arreglos {
	
	String nombre[] = {"Diego","Manuel","Ismael"};
	int valores [] = {1,2,3};
	double decimales [] = {1.1,2.3,2.1};
	Double decimales2[] = {new Double(2.1), new Double(1.1)};
	static Persona personas [] = {new Persona("Diego","Arellano","22") };
	
	
	public static void main(String args[]){
		
		for(int i=0; i<personas.length;i++){
			System.out.println("Nombre: "+personas[i].getNombre()+
					"Apellido: "+personas[i].getApellido()+
					"Edad"+personas[i].getEdad());
		}
		
		for(Persona p : personas){
			System.out.println("Nombre: "+p.getNombre()+
					"Apellido: "+p.getApellido()+
					"Edad: "+p.getEdad());
		}
	}

}
