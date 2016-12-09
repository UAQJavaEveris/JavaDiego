/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonajesDAO;

import ModelPersonajes.Personajes;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;

/**
 *
 * @author Diego
 */
public class PersonajesDAO {
    
    public void ingresarPersonaje(Personajes p ){
        SessionFactory sf = null;
        Session sesion = null;
        Transaction tx = null;
        try {
            sf = HibernateUtil.getSessionFactory();
            sesion = sf.openSession();
            tx = sesion.beginTransaction();
            sesion.save(p);
            tx.commit();
            sesion.close();
        } catch (Exception ex) {
            tx.rollback();
            throw new RuntimeException("No pudo guardar");
        }
    }
    
    public String consultarPersonaje(int id){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sesion = sf.openSession();
        Personajes p = (Personajes)sesion.get(Personajes.class, id);
        
        sesion.close();
        if (p!=null) {
            return "Id : "+p.getId()+"\n Nombre : "+p.getNombre()+"\n Nacionalidad : "
                    +p.getNacionalidad()+"\n Empresa"+p.getEmpresa()+"";
        }else{
            return "El nombre no esta registrado"+p.getId();
        }
    }
    
     public String eliminarPersonaje(int id){
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session sesion = sf.openSession();
        Transaction tx = null;
        Personajes p = (Personajes)sesion.get(Personajes.class, id);

        if (p!=null) {
            tx = sesion.beginTransaction();
            sesion.delete(p);
            tx.commit();
            sesion.close();
            return "El nombre : "+p.getNombre()+" fue eliminado";
        }else{
            return "El nombre no esta registrado"+p.getId();
        }
    }
     public void actualizarPersonaje(Personajes p ){
        SessionFactory sf = null;
        Session sesion = null;
        Transaction tx = null;
        try {
            sf = HibernateUtil.getSessionFactory();
            sesion = sf.openSession();
            tx = sesion.beginTransaction();
            sesion.update(p);
            tx.commit();
            sesion.close();
        } catch (Exception ex) {
            tx.rollback();
            throw new RuntimeException("No pudo guardar");
        }
    }
    
}
