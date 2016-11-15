package mx.com.everis.tallerjava.arreglos;

public class Arreglos {
	
	 static int numeros[] = {10,20,30,40,50,60,70};
	 static int suma = 0;
	
	public static void main(String[] args){
		System.out.println("Suma decendente : "+Decendente());
		System.out.println("Suma ascendente : "+Ascendente());
	}
	
	static int Decendente(){
		for(int i = 0; i < numeros.length;i++){
			suma = suma + numeros[i];
			
		}
		return suma;
	}
	
	static int Ascendente(){
		for (int i = numeros.length; i == 0; i--) {
			suma = suma +  numeros[i];
		}
		return suma;
	}

}