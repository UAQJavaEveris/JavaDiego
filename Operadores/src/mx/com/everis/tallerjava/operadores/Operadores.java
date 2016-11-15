package mx.com.everis.tallerjava.operadores;

public class Operadores {
	
	int valor1 = 11;
	byte edad = 22;
	String nombre = "Diego";
	boolean boolean1 = true;
	char sexom = 'M';
	char sexoh = 'H';
	byte mayor = 18;
	
	public void main(String args[]){
		if (edad > mayor) {
			datos();
		}
	}
	
	public void datos(){
		
		System.out.println(nombre+""+edad+""+sexoh+"");
	}

}
