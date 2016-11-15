package mx.com.everis.tallerjava.clases;

import mx.com.everis.tallerjava.interfaces.MiInterface;

public abstract class Persona implements MiInterface {
	
	public Persona(){
		
	}
	
	public abstract String getNombre();
	
	public void setNombre(){
		
	}
	
	public String getApellido(){
		return "";
	}

}
