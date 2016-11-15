package mx.com.everis.tallerjava.Testing;

import mx.com.everis.tallerjava.exception.*;

public class Testing {
	
	public static void main(String args[])throws MiException{
		int valorA = 0;
		int valorB = 1;
		
		if (valorA >= valorB) {
			throw new MiException();
		}
		else{
			System.out.println("Sin exception");
		}
	}

}
