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
        //Verifica si el archivo existe o no existe si no lo crea.
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            System.out.println("El archivo ya estaba creado...");
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            System.out.println("El archivo se acaba de crear");
        }
        
        //Guarda un texto ingresado por el usuario.
        System.out.println("Introdusca un texto");
        cadena = leer.nextLine();
        bw.write(cadena);
        bw.close();
        
        
        //Imprime lo que contiene el archivo
        
        FileReader LeerArchivo = new FileReader(archivo);
        BufferedReader leerArchivoT = new BufferedReader(LeerArchivo);
        while((texto = leerArchivoT.readLine())!=null) {
            System.out.println(texto);
        }
		
        bw.close();
	}
}
