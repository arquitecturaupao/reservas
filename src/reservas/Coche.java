
package reservas;

public class Coche {
    private String matricula;
    private String modelo;
    private String color;
    private String marca;
    private String kilometrajeActual;
    private String estadoGeneral;
    private String anoFabricacion;

    public Coche(String matricula, String modelo, String color, String marca, String kilometrajeActual, String estadoGeneral, String anoFabricacion) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
        this.marca = marca;
        this.kilometrajeActual = kilometrajeActual;
        this.estadoGeneral = estadoGeneral;
        this.anoFabricacion = anoFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getKilometrajeActual() {
        return kilometrajeActual;
    }

    public void setKilometrajeActual(String kilometrajeActual) {
        this.kilometrajeActual = kilometrajeActual;
    }

    public String getEstadoGeneral() {
        return estadoGeneral;
    }

    public void setEstadoGeneral(String estadoGeneral) {
        this.estadoGeneral = estadoGeneral;
    }

    public String getAnoFabricacion() {
        return anoFabricacion;
    }

    public void setAnoFabricacion(String anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }
    
    
}
