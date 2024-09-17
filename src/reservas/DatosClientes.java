
package reservas;

import java.util.ArrayList;

public class DatosClientes {
    
    private ArrayList<Cliente> clientes;

    public DatosClientes() {
        clientes = new ArrayList<>();
    }

    public String registraCliente(Cliente cliente) {
        clientes.add(cliente);
        return cliente.getNombre();
    }

    public Cliente buscarporDNI(String dni) {
        Cliente cliente = null;

        for (Cliente c : clientes) {
            if (c.getDni().equals(dni)) {
                cliente = c;
                break;
            }
        }
        return cliente;
    }

    public boolean existeDNI(String dni) {
        for (Cliente c : clientes) {
            if (c.getDni().equals(dni)) {
                return true;
            }
        }
        return false;
    }

    public Cliente buscarClientexIndice(int i) {
        return clientes.get(i);
    }

    public void eliminarCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    public int obtenerClientes() {
        return clientes.size();
    }

    public String listarClientes() {
        String cadena = "";

        for (Cliente c : clientes) {
            cadena += c.toString() + "\n";
        }

        return cadena;
    }
}
