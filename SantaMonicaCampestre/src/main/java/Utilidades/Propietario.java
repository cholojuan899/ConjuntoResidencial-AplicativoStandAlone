package Utilidades;
import Utilidades.Persona;

public class Propietario extends Persona{
    
    private String numeroPropiedad;
    private String profesion;

    public Propietario(String nombre, String apellido, String email, String numeroTelefono, String tipoDocumento, String numDocumento, String nacionalidad, String password) {
        super(nombre, apellido, email, numeroTelefono, tipoDocumento, numDocumento, nacionalidad, password);
    }
    
    public void setNumeroPropiedad(String numeroPropiedad) {
        this.numeroPropiedad = numeroPropiedad;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getNumeroPropiedad() {
        return numeroPropiedad;
    }

    public String getProfesion() {
        return profesion;
    }
    
    

  

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

