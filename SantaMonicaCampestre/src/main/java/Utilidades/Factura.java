package Utilidades;
import Utilidades.Propietario;
import java.util.Date;

public class Factura {
    private Propietario propietario;
    private Date fecha;
    private double valor;
    private double valorAdmon;
    private boolean multas;
    private double valorMultas;
    private boolean ctasVencidas;
    private double valorCtasVencidas;
    private double total;
    private String numFactura;

    public Factura(Propietario propietario, Date fecha, double valor, double valorAdmon, boolean multas, double valorMultas, boolean ctasVencidas, double valorCtasVencidas, double total, String numFactura) {
        this.propietario = propietario;
        this.fecha = fecha;
        this.valor = valor;
        this.valorAdmon = valorAdmon;
        this.multas = multas;
        this.valorMultas = valorMultas;
        this.ctasVencidas = ctasVencidas;
        this.valorCtasVencidas = valorCtasVencidas;
        this.total = total;
        this.numFactura = numFactura;
    }

    public String getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(String numFactura) {
        this.numFactura = numFactura;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValorAdmon() {
        return valorAdmon;
    }

    public void setValorAdmon(double valorAdmon) {
        this.valorAdmon = valorAdmon;
    }

    public boolean isMultas() {
        return multas;
    }

    public void setMultas(boolean multas) {
        this.multas = multas;
    }

    public double getValorMultas() {
        return valorMultas;
    }

    public void setValorMultas(double valorMultas) {
        this.valorMultas = valorMultas;
    }

    public boolean isCtasVencidas() {
        return ctasVencidas;
    }

    public void setCtasVencidas(boolean ctasVencidas) {
        this.ctasVencidas = ctasVencidas;
    }

    public double getValorCtasVencidas() {
        return valorCtasVencidas;
    }

    public void setValorCtasVencidas(double valorCtasVencidas) {
        this.valorCtasVencidas = valorCtasVencidas;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
    
    
    
}
