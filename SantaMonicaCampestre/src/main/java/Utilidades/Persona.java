package Utilidades;

public class Persona{
    
        private String nombre;
        private String apellido;
        private String email;
        private String numeroTelefono;
        private String tipoDocumento;
        private String numDocumento;
        private String nacionalidad;
        private String password;

    public Persona(String nombre, String apellido, String email, String numeroTelefono, String tipoDocumento, String numDocumento, String nacionalidad, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.numeroTelefono = numeroTelefono;
        this.tipoDocumento = tipoDocumento;
        this.numDocumento = numDocumento;
        this.nacionalidad = nacionalidad;
        this.password = password;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String contraseña) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + 
               "apellido=" + apellido + 
               "email=" + email + 
               "numeroTelefono=" + numeroTelefono + 
               "tipoDocumento=" + tipoDocumento + 
               "numDocumento=" + numDocumento + 
               "nacionalidad=" + nacionalidad + 
               ",ontraseña=" + password + '}';
    }  
}
