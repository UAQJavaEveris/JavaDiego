package mx.com.everis.tallerjava.localizacion;

import java.util.Locale;
import java.util.ResourceBundle;

public class Testing {

	public static void main(String[] args) {

		ResourceBundle text = ResourceBundle.getBundle("mx.com.everis.tallerjava.localizacion.Us",Locale.US);
		
		System.out.println(text.getString("ciudad"));
		System.out.println(text.getString("autobus"));

		System.out.println(text.getString("nombre"));
		System.out.println(text.getString("spring"));
	}

}