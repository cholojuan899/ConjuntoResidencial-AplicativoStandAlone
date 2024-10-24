package Utilidades;
import Utilidades.Persona;
import java.util.Date;

public class Empleado extends Persona {
   
    private String cargo;
    private Date fechaDeInicio;
    private double calificacion;
    private double salario;
    private String numCelular;

    public Empleado(String nombre, String apellido, String email, String numeroTelefono, String tipoDocumento, String numDocumento, String nacionalidad, String password) {
        super(nombre, apellido, email, numeroTelefono, tipoDocumento, numDocumento, nacionalidad, password);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(Date fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(String numCelular) {
        this.numCelular = numCelular;
    }

    

    
    
}
