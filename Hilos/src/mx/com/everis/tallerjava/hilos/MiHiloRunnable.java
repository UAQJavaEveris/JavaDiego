package mx.com.everis.tallerjava.hilos;

public class MiHiloRunnable implements Runnable{
	
	@Override
	public void run(){
		System.out.println("Mi hilo con la interfaz Ruunable : "+Thread.currentThread());
	}

}
