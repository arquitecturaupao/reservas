
package reservas;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Reservas {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static DatosClientes clientes = new DatosClientes();

    public static void main(String[] args) throws IOException {
        
        
        int opc;

        System.out.println("\n*****SISTEMA DE RESERVA DE AUTOS*****\n");
        do {
            opc = menu();
            switch (opc) {
                case 1:
                    registrarCliente();
                    break;
                case 2:
                    registrarCoche();                    
                    break;
                case 3:
                    registrarGaraje();                    
                    break;
                case 4:
                    registrarAgencia();                    
                    break;
                case 5:
                    registrarReserva();                    
                    break;
                case 6:
                    System.out.println("LISTA DE CLIENTES => " + clientes.obtenerClientes());
                    System.out.println(clientes.listarClientes());
                    break;
                /*case 7:
                    System.out.println("LISTA DE AUTOS => " + huespedes.obtenerHuespeds());
                    System.out.println(huespedes.listarHuespeds());
                    break;
                case 8:
                    System.out.println("LISTA DE RESERVAS => " + huespedes.obtenerHuespeds());
                    System.out.println(huespedes.listarHuespeds());
                    break;*/
                }
            }while (opc !=9);
            System.out.println("\n*****Hasta pronto...*****\n");
    }
    static int menu() throws IOException {
        int opc;
        do {
            System.out.println("\n****MENÚ DE OPCIONES****\n");
            System.out.println("1. Registrar cliente");
            System.out.println("2. Registrar Coche");
            System.out.println("3. Registrar Garaje");
            System.out.println("4. Registrar Agencia");
            System.out.println("5. Registrar Reserva");
            System.out.println("6. Listar Clientes");
            System.out.println("7. Listar Coches");
            System.out.println("8. Listar Reservas");
            System.out.println("9. Salir");
            System.out.println("\n");
            try{
                opc = Integer.parseInt(br.readLine());
            }catch(NumberFormatException e){
                System.out.println("Debe digitar un número...");
                opc = 0;
            }
        } while (opc < 1 || opc > 9);
        return opc;
    }
    
    static void registrarCliente() throws IOException {
        String dni, nombre, direccion, telefono, email, numeroLicencia;
        //LocalDate fechaRegistro;

        do {
            System.out.print("Ingresar DNI: ");
            dni = br.readLine();
        } while (dni.trim().length() == 0);
        if (clientes.existeDNI(dni)) {
            System.out.println("Cliente ya se encuentra registrado.\n");
        } else {
            do {
                System.out.print("Nombre: ");
                nombre = br.readLine().trim().toUpperCase();
            } while (nombre.trim().length() == 0);
            do {
                System.out.print("Dirección: ");
                direccion = br.readLine().trim().toUpperCase();
            } while (direccion.trim().length() == 0);
            do {
                System.out.print("Telefono: ");
                telefono = br.readLine().trim().toUpperCase();
            } while (telefono.trim().length() == 0);
            do {
                System.out.print("Email: ");
                email = br.readLine().trim().toUpperCase();
            } while (email.trim().length() == 0);
            do {
                System.out.print("Número de licencia: ");
                numeroLicencia = br.readLine().trim().toUpperCase();
            } while (numeroLicencia.trim().length() == 0);
            
            clientes.registraCliente(new Cliente(dni, nombre, direccion, telefono, email, numeroLicencia));
            System.out.println("\nCliente registrado satisfactoriamente.\n");
        }
    }
    
    static void registrarCoche() throws IOException {
    
    }
    
    static void registrarGaraje() throws IOException{
    
    }
    
    static void registrarAgencia() throws IOException{
    
    }
    
    static void registrarReserva() throws IOException{
        
    }

}
