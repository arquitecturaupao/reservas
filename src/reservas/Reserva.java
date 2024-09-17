
package reservas;

import java.time.LocalDate;

public class Reserva {
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private float precioTotal;
    private float litrosGasolina;
    private boolean indicadorEntrega;
    private String metodoPago;
    private String numeroConfirmacion;
    private String comentarios;

    public Reserva(float precioTotal, float litrosGasolina, boolean indicadorEntrega, String metodoPago, String numeroConfirmacion, String comentarios) {
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

    public float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }

    public float getLitrosGasolina() {
        return litrosGasolina;
    }

    public void setLitrosGasolina(float litrosGasolina) {
        this.litrosGasolina = litrosGasolina;
    }

    public boolean isIndicadorEntrega() {
        return indicadorEntrega;
    }

    public void setIndicadorEntrega(boolean indicadorEntrega) {
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
