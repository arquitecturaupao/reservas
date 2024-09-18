
package reservas;

import java.util.ArrayList;

public class DatosCoches {
    private ArrayList<Coche> coches;

    public DatosCoches() {
        coches = new ArrayList<>();
    }

    public String registrarCoche(Coche coche) {
        coches.add(coche);
        return coche.getMatricula();
    }

    public Coche buscarporMatricula(String matricula) {
        Coche coche = null;

        for (Coche c : coches) {
            if (c.getMatricula().equals(matricula)) {
                coche = c;
                break;
            }
        }
        return coche;
    }

    public boolean existeMatricula(String matricula) {
        for (Coche c : coches) {
            if (c.getMatricula().equals(matricula)) {
                return true;
            }
        }
        return false;
    }

    public Coche buscarCochexIndice(int i) {
        return coches.get(i);
    }

    public void eliminarCoche(Coche coche) {
        coches.remove(coche);
    }

    public int obtenerCoches() {
        return coches.size();
    }

    public String listarCoches() {
        String cadena = "";

        for (Coche c : coches) {
            cadena += c.toString() + "\n";
        }

        return cadena;
    }
}
