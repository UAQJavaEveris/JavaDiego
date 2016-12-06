package com.mx.everis.tallerjava.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.rpc.ServiceException;
import javax.xml.ws.WebServiceRef;

import com.mx.everis.tallerjava.service.Saludos;
import com.mx.everis.tallerjava.service.SaludosService;
import com.mx.everis.tallerjava.service.Sumas;
import com.mx.everis.tallerjava.service.SumasService;

/**
 * Servlet implementation class MiServlet
 */
@WebServlet(description = "MiServlet", urlPatterns = {"/MiServlet"})
public class MiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	@WebServiceRef
	private SaludosService serviceSaludos;
	
	@WebServiceRef
	private SumasService serviceSumas;
	
    public MiServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet");
		String nombre = request.getParameter("nombre");
		System.out.println("El nombre es : " + nombre);
		Saludos port = null;
		try {
			port = serviceSaludos.getSaludos();
		} catch (ServiceException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(port.getSaludo());
		System.out.println(port.getSaludoName(nombre));
		
		Sumas portSuma = null;
		try {
			portSuma = serviceSumas.getSumas();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(portSuma.getSuma(2,3));
		System.out.println(portSuma.getSumaTresNumero(2,3,3));
		//int[]enteros = {1,2,3,4,5};
		List<Integer> enteros = new ArrayList<Integer>();
		enteros.add(1);enteros.add(2);enteros.add(3);

		//System.out.println("Suma array numeros"+ portSuma.getSumaArrayNum(enteros);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
