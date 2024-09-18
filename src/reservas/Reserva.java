
package reservas;

import java.time.LocalDate;

public class Reserva {
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String numeroConfirmacion;
    private String precioTotal;
    private String litrosGasolina;
    private String indicadorEntrega;
    private String metodoPago;    
    private String comentarios;

    public Reserva(String numeroConfirmacion, String precioTotal, String litrosGasolina, String indicadorEntrega, String metodoPago, String comentarios) {
        this.precioTotal = precioTotal;
        this.litrosGasolina = litrosGasolina;
        this.indicadorEntrega = indicadorEntrega;
        this.metodoPago = metodoPago;
        this.numeroConfirmacion = numeroConfirmacion;
        this.comentarios = comentarios;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(String precioTotal) {
        this.precioTotal = precioTotal;
    }

    public String getLitrosGasolina() {
        return litrosGasolina;
    }

    public void setLitrosGasolina(String litrosGasolina) {
        this.litrosGasolina = litrosGasolina;
    }

    public String isIndicadorEntrega() {
        return indicadorEntrega;
    }

    public void setIndicadorEntrega(String indicadorEntrega) {
        this.indicadorEntrega = indicadorEntrega;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getNumeroConfirmacion() {
        return numeroConfirmacion;
    }

    public void setNumeroConfirmacion(String numeroConfirmacion) {
        this.numeroConfirmacion = numeroConfirmacion;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
    
    
}
