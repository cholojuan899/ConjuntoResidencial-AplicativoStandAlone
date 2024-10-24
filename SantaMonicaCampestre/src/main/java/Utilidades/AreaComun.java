
package Utilidades;

public class AreaComun {
    private String nombreArea;
    private int capacidad;
    private String periodicidadMantenimiento;
    private double costoMantenimiento;
    private String horaCierre;
    private String horaApertura;
    private String diasDeServicio;

    public AreaComun(String nombreArea, int capacidad, String periodicidadMantenimiento, double costoMantenimiento, String horaCierre, String horaApertura, String diasDeServicio) {
        this.nombreArea = nombreArea;
        this.capacidad = capacidad;
        this.periodicidadMantenimiento = periodicidadMantenimiento;
        this.costoMantenimiento = costoMantenimiento;
        this.horaCierre = horaCierre;
        this.horaApertura = horaApertura;
        this.diasDeServicio = diasDeServicio;
    }

    public String getDiasDeServicio() {
        return diasDeServicio;
    }

    public void setDiasDeServicio(String diasDeServicio) {
        this.diasDeServicio = diasDeServicio;
    }

    public String getNombreArea() {
        return nombreArea;
    }

    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getPeriodicidadMantenimiento() {
        return periodicidadMantenimiento;
    }

    public void setPeriodicidadMantenimiento(String periodicidadMantenimiento) {
        this.periodicidadMantenimiento = periodicidadMantenimiento;
    }

    public double getCostoMantenimiento() {
        return costoMantenimiento;
    }

    public void setCostoMantenimiento(double costoMantenimiento) {
        this.costoMantenimiento = costoMantenimiento;
    }

    public String getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(String horaCierre) {
        this.horaCierre = horaCierre;
    }

    public String getHoraApertura() {
        return horaApertura;
    }

    public void setHoraApertura(String horaApertura) {
        this.horaApertura = horaApertura;
    }

    @Override
    public String toString() {
        return "AreaComun{" + "nombreArea=" + nombreArea + ", capacidad=" + capacidad + ", periodicidadMantenimiento=" + periodicidadMantenimiento + ", costoMantenimiento=" + costoMantenimiento + ", horaCierre=" + horaCierre + ", horaApertura=" + horaApertura + ", diasDeServicio=" + diasDeServicio + '}';
    }
    
    
    
    
}
