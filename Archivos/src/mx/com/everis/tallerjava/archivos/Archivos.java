package mx.com.everis.tallerjava.archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 * 
 * @author Diego
 * Manejo de Archivos
 */
public class Archivos {
	
	public static void main(String[] args) throws IOException{
		
		Scanner leer = new Scanner(System.in);
		Scanner guardar = null;
		String cadena = "";
		String texto = "";
		String ruta = "C:\\Users\\Diego\\Documents\\tallerjava\\holamundo.txt";
        File archivo = new File(ruta);
        
        BufferedWriter bw;
        
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            System.out.println("El archivo ya estaba creado...");
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            System.out.println("El archivo se acaba de crear");
        }
        
        
        System.out.println("Introdusca un texto");
        cadena = leer.nextLine();
        
        bw.write(cadena);
        
        bw.close();
        
        FileReader LeerArchivo = new FileReader(archivo);
        BufferedReader leerArchivoT = new BufferedReader(LeerArchivo);
        while((texto = leerArchivoT.readLine())!=null) {
            System.out.println(texto);
        }
		
        bw.close();
	}
}
