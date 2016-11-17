package mx.com.everis.tallerjava.testing;

import mx.com.evaris.tallerjava.persona.Persona;
import mx.com.everis.tallerjava.genericos.MiGenerico;

public class TestGenerico {
	
	public static void main(String [] args){
		MiGenerico<String> generico = new MiGenerico<String>("Diego");
		
		//MiGenerico<Float> generico = new MiGenerico<Float>(10.5f);
		//MiGenerico<Persona> generico = new MiGenerico<Persona>(Persona());
		
		//generico.print();
		
	}
}
