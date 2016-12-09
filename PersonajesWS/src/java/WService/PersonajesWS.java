/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WService;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import ModelPersonajes.Personajes;
import PersonajesDAO.PersonajesDAO;

/**
 *
 * @author Diego
 */
@WebService(serviceName = "PersonajesWS")
public class PersonajesWS {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "IngresarPersonajes")
    public String IngresarPersonajes(@WebParam(name = "id") int id, @WebParam(name = "nombre") String nombre, @WebParam(name = "nacionalidad") String nacionalidad, @WebParam(name = "empresa") String empresa) {
        //TODO write your implementation code here:
        Personajes p = new Personajes(id,nombre,nacionalidad,empresa);
        PersonajesDAO personajesDAO = new PersonajesDAO();
        personajesDAO.ingresarPersonaje(p);
        return "Nombre Ingresado";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "BuscarPersonajes")
    public String BuscarPersonajes(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        PersonajesDAO personajesDAO = new PersonajesDAO();
        
        return personajesDAO.consultarPersonaje(id);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "EliminarPersonaje")
    public String EliminarPersonaje(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        PersonajesDAO personajesDAO = new PersonajesDAO();
        
        return personajesDAO.eliminarPersonaje(id);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ActualizarPersonajes")
    public String ActualizarPersonajes(@WebParam(name = "id") int id, @WebParam(name = "nombre") String nombre, @WebParam(name = "nacionalidad") String nacionalidad, @WebParam(name = "empresa") String empresa) {
        //TODO write your implementation code here:
        Personajes p = new Personajes(id,nombre,nacionalidad,empresa);
        PersonajesDAO personajesDAO = new PersonajesDAO();
        personajesDAO.actualizarPersonaje(p);
        return "Nombre Actualizado";
    }
}
