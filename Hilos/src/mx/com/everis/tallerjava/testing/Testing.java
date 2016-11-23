package mx.com.everis.tallerjava.testing;

import mx.com.everis.tallerjava.hilos.MiHiloRunnable;
import mx.com.everis.tallerjava.hilos.MiHiloThread;

public class Testing {
	
	public static void main(String[] args){
		
		//Primera forma de crear un hilo
		Thread miHiloConThread = new Thread (new MiHiloThread());
		
		//Segunda forma de crear un hilo
		MiHiloRunnable miHilo = new MiHiloRunnable();
		Thread miHiloConRunnable = new Thread(miHilo);
		miHiloConRunnable.start();
		
	}

}
