package mx.com.everis.tallerjava.hilos;

public class MiHiloThread extends Thread{
	
	@Override
	public void run(){
		System.out.println("Mi hilo con clase Thread : "+Thread.currentThread());
	}
}
