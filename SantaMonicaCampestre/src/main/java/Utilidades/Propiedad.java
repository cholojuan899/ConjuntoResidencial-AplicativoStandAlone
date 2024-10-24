
package Utilidades;

public class Propiedad {
    private String numPropiedad;
    private double sizePropiedad;
    private double valorPropiedad;
    private Propietario propietario;

    public Propiedad(String numPropiedad, double sizePropiedad, double valorPropiedad, Propietario propietario) {
        this.numPropiedad = numPropiedad;
        this.sizePropiedad = sizePropiedad;
        this.valorPropiedad = valorPropiedad;
        this.propietario = propietario;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public String getNumPropiedad() {
        return numPropiedad;
    }

    public void setNumPropiedad(String numPropiedad) {
        this.numPropiedad = numPropiedad;
    }

    public double getSizePropiedad() {
        return sizePropiedad;
    }

    public void setSizePropiedad(double sizePropiedad) {
        this.sizePropiedad = sizePropiedad;
    }

    public double getValorPropiedad() {
        return valorPropiedad;
    }

    public void setValorPropiedad(double valorPropiedad) {
        this.valorPropiedad = valorPropiedad;
    }

    @Override
    public String toString() {
        return "Propiedad{" + "numPropiedad=" + numPropiedad + ", sizePropiedad=" + sizePropiedad + ", valorPropiedad=" + valorPropiedad + ", propietario=" + propietario + '}';
    }
 
    
}