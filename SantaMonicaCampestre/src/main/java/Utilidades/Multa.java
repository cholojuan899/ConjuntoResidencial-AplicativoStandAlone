package Utilidades;
import Utilidades.Propietario;
import java.util.Date;



public class Multa {
    private Propietario propietario;
    private Propiedad numPropiedad;
    private String lugarOcurrencia;
    private String numMulta;
    private double valorMulta;
    private String eventoOcurrido;
    private String observaciones;
    private Date fechaReporte;
    private Date fechaOcurrencia;
    private Date fechaMaxPago;

    public Multa(Propietario propietario, Propiedad numPropiedad, String lugarOcurrencia, String numMulta, double valorMulta, String eventoOcurrido, String observaciones, Date fechaReporte, Date fechaOcurrencia, Date fechaMaxPago) {
        this.propietario = propietario;
        this.numPropiedad = numPropiedad;
        this.lugarOcurrencia = lugarOcurrencia;
        this.numMulta = numMulta;
        this.valorMulta = valorMulta;
        this.eventoOcurrido = eventoOcurrido;
        this.observaciones = observaciones;
        this.fechaReporte = fechaReporte;
        this.fechaOcurrencia = fechaOcurrencia;
        this.fechaMaxPago = fechaMaxPago;
    }

    public Date getFechaMaxPago() {
        return fechaMaxPago;
    }

    public void setFechaMaxPago(Date fechaMaxPago) {
        this.fechaMaxPago = fechaMaxPago;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public Propiedad getNumPropiedad() {
        return numPropiedad;
    }

    public void setNumPropiedad(Propiedad numPropiedad) {
        this.numPropiedad = numPropiedad;
    }

    public String getLugarOcurrencia() {
        return lugarOcurrencia;
    }

    public void setLugarOcurrencia(String lugarOcurrencia) {
        this.lugarOcurrencia = lugarOcurrencia;
    }

    public String getNumMulta() {
        return numMulta;
    }

    public void setNumMulta(String numMulta) {
        this.numMulta = numMulta;
    }

    public double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }

    public String getEventoOcurrido() {
        return eventoOcurrido;
    }

    public void setEventoOcurrido(String eventoOcurrido) {
        this.eventoOcurrido = eventoOcurrido;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Date getFechaReporte() {
        return fechaReporte;
    }

    public void setFechaReporte(Date fechaReporte) {
        this.fechaReporte = fechaReporte;
    }

    public Date getFechaOcurrencia() {
        return fechaOcurrencia;
    }

    public void setFechaOcurrencia(Date fechaOcurrencia) {
        this.fechaOcurrencia = fechaOcurrencia;
    }
    
    
    
    
}
