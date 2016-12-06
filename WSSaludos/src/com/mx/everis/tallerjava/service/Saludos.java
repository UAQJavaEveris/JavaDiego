package com.mx.everis.tallerjava.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Saludos {
	@WebMethod
	public String getSaludo(){
		
		return "Hola Mundo desde un web service";
	}
	@WebMethod
	public String getSaludoName(String nombre){
		
		return "Hola "+nombre;
	}

}
