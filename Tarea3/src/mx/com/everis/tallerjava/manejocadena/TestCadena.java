package mx.com.everis.tallerjava.manejocadena;
import java.util.Random;
public class TestCadena {
	
	public static void main(String[] args){
		
		String text = "Existen dos tipos de personas en el mundo";
		String reemplazar = "";
		
		Random rnd = new Random();
        
        reemplazar = String.valueOf((int)rnd.nextDouble()*10+1);
        
        
		System.out.println(text.replace(" ", reemplazar));
			
	}	
}
