
package reservas;


public class Garaje {
    private String ubicacion;
    private String capacidad;
    private String horarioOperacion;

    public Garaje(String ubicacion, String capacidad, String horarioOperacion) {
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
        this.horarioOperacion = horarioOperacion;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getHorarioOperacion() {
        return horarioOperacion;
    }

    public void setHorarioOperacion(String horarioOperacion) {
        this.horarioOperacion = horarioOperacion;
    }
    
    
    
}
