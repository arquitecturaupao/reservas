
package reservas;

import java.util.ArrayList;

public class DatosAgencias {
    private ArrayList<Agencia> agencias;

    public DatosAgencias() {
        agencias = new ArrayList<>();
    }

    public String registrarAgencia(Agencia agencia) {
        agencias.add(agencia);
        return agencia.getGerente();
    }

    public Agencia buscarporGerente(String gerente) {
        Agencia agencia = null;

        for (Agencia a : agencias) {
            if (a.getGerente().equals(gerente)) {
                agencia = a;
                break;
            }
        }
        return agencia;
    }

    public boolean existeAgencia(String gerente) {
        for (Agencia a : agencias) {
            if (a.getGerente().equals(gerente)) {
                return true;
            }
        }
        return false;
    }

    public Agencia buscarAgenciaxIndice(int i) {
        return agencias.get(i);
    }

    public void eliminarAgencia(Agencia agencia) {
        agencias.remove(agencia);
    }

    public int obtenerAgencias() {
        return agencias.size();
    }

    public String listarAgencias() {
        String cadena = "";

        for (Agencia a : agencias) {
            cadena += a.toString() + "\n";
        }

        return cadena;
    }
}
