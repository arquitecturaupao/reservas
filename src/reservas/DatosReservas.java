
package reservas;

import java.util.ArrayList;

public class DatosReservas {
    private ArrayList<Reserva> reservas;

    public DatosReservas() {
        reservas = new ArrayList<>();
    }

    public String registrarReserva(Reserva reserva) {
        reservas.add(reserva);
        return reserva.getNumeroConfirmacion();
    }

    public Reserva buscarporNumeroConfirmacion(String numeroConfirmacion) {
        Reserva reserva = null;

        for (Reserva r : reservas) {
            if (r.getNumeroConfirmacion().equals(numeroConfirmacion)) {
                reserva = r;
                break;
            }
        }
        return reserva;
    }

    public boolean existeReserva(String numeroConfirmacion) {
        for (Reserva r : reservas) {
            if (r.getNumeroConfirmacion().equals(numeroConfirmacion)) {
                return true;
            }
        }
        return false;
    }

    public Reserva buscarReservaxIndice(int i) {
        return reservas.get(i);
    }

    public void eliminarReserva(Reserva reserva) {
        reservas.remove(reserva);
    }

    public int obtenerReservas() {
        return reservas.size();
    }

    public String listarReservas() {
        String cadena = "";

        for (Reserva g : reservas) {
            cadena += g.toString() + "\n";
        }

        return cadena;
    }
}
