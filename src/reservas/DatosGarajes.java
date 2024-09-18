
package reservas;

import java.util.ArrayList;

public class DatosGarajes {
    private ArrayList<Garaje> garajes;

    public DatosGarajes() {
        garajes = new ArrayList<>();
    }

    public String registrarGaraje(Garaje garaje) {
        garajes.add(garaje);
        return garaje.getUbicacion();
    }

    public Garaje buscarporUbicacion(String ubicacion) {
        Garaje garaje = null;

        for (Garaje g : garajes) {
            if (g.getUbicacion().equals(ubicacion)) {
                garaje = g;
                break;
            }
        }
        return garaje;
    }

    public boolean existeGaraje(String ubicacion) {
        for (Garaje g : garajes) {
            if (g.getUbicacion().equals(ubicacion)) {
                return true;
            }
        }
        return false;
    }

    public Garaje buscarGarajexIndice(int i) {
        return garajes.get(i);
    }

    public void eliminarGaraje(Garaje garaje) {
        garajes.remove(garaje);
    }

    public int obtenerGarajes() {
        return garajes.size();
    }

    public String listarGarajes() {
        String cadena = "";

        for (Garaje g : garajes) {
            cadena += g.toString() + "\n";
        }

        return cadena;
    }
}
