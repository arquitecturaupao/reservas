
package reservas;

public class Agencia {
    private String gerente;
    private String nroEmpleados;
    private String telefono;

    public Agencia(String gerente, String nroEmpleados, String telefono) {
        this.gerente = gerente;
        this.nroEmpleados = nroEmpleados;
        this.telefono = telefono;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public String getNroEmpleados() {
        return nroEmpleados;
    }

    public void setNroEmpleados(String nroEmpleados) {
        this.nroEmpleados = nroEmpleados;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
}
