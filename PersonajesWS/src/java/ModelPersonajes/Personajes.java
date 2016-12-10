package ModelPersonajes;
// Generated 08-dic-2016 12:08:05 by Hibernate Tools 4.3.1



/**
 * Personajes generated by hbm2java
 */
public class Personajes  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private String nacionalidad;
     private String empresa;

    public Personajes() {
    }

    public Personajes(String nombre, String nacionalidad, String empresa) {
       this.nombre = nombre;
       this.nacionalidad = nacionalidad;
       this.empresa = empresa;
    }
    public Personajes(int id, String nombre, String nacionalidad, String empresa) {
       this.nombre = nombre;
       this.nacionalidad = nacionalidad;
       this.empresa = empresa;
       this.id = id;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNacionalidad() {
        return this.nacionalidad;
    }
    
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public String getEmpresa() {
        return this.empresa;
    }
    
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }




}

