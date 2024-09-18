
package reservas;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Reservas {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static DatosClientes clientes = new DatosClientes();
    static DatosCoches coches = new DatosCoches();
    static DatosAgencias agencias = new DatosAgencias();
    static DatosGarajes garajes = new DatosGarajes();
    static DatosReservas reservas = new DatosReservas();

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
                case 7:
                    System.out.println("LISTA DE AUTOS => " + coches.obtenerCoches());
                    System.out.println(coches.listarCoches());
                    break;
                case 8:
                    System.out.println("LISTA DE RESERVAS => " + reservas.obtenerReservas());
                    System.out.println(coches.listarCoches());
                    break;
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
        String matricula, modelo, color, marca, estadoGeneral,kilometrajeActual,anoFabricacion;

        do {
            System.out.print("Ingresar Matricula: ");
            matricula = br.readLine();
        } while (matricula.trim().length() == 0);
        if (coches.existeMatricula(matricula)) {
            System.out.println("Coche ya se encuentra registrado.\n");
        } else {
            do {
                System.out.print("Modelo: ");
                modelo = br.readLine().trim().toUpperCase();
            } while (modelo.trim().length() == 0);
            do {
                System.out.print("Color: ");
                color = br.readLine().trim().toUpperCase();
            } while (color.trim().length() == 0);
            do {
                System.out.print("Marca: ");
                marca = br.readLine().trim().toUpperCase();
            } while (marca.trim().length() == 0);
            do {
                System.out.print("Kilometraje: ");
                kilometrajeActual = br.readLine().trim().toUpperCase();
            } while (kilometrajeActual.trim().length() == 0);
            do {
                System.out.print("Estado general: ");
                estadoGeneral = br.readLine().trim().toUpperCase();
            } while (estadoGeneral.trim().length() == 0);
            do {
                System.out.print("Año de fabricacion: ");
                anoFabricacion = br.readLine().trim().toUpperCase();
            } while (anoFabricacion.trim().length() == 0);
            coches.registrarCoche(new Coche(matricula, modelo, color, marca, kilometrajeActual, estadoGeneral, anoFabricacion));
            System.out.println("\nCoche registrado satisfactoriamente.\n");
        }
    }
    
    static void registrarGaraje() throws IOException{
        String ubicacion, capacidad, horario;

        do {
            System.out.print("Ingresar Ubicacion: ");
            ubicacion = br.readLine();
        } while (ubicacion.trim().length() == 0);
        if (garajes.existeGaraje(ubicacion)) {
            System.out.println("Garaje ya se encuentra registrado.\n");
        } else {
            do {
                System.out.print("Capacidad del Garaje: ");
                capacidad = br.readLine().trim().toUpperCase();
            } while (capacidad.trim().length() == 0);
            do {
                System.out.print("Horario de operacion: ");
                horario = br.readLine().trim().toUpperCase();
            } while (horario.trim().length() == 0);
            garajes.registrarGaraje(new Garaje(ubicacion, capacidad, horario));
            System.out.println("\nGaraje registrado correctamente.\n");
        }
    }
    
    static void registrarAgencia() throws IOException{
        String gerente, nroEmpleados, telefono;

        do {
            System.out.print("Ingresar Gerente: ");
            gerente = br.readLine();
        } while (gerente.trim().length() == 0);
        if (agencias.existeAgencia(gerente)) {
            System.out.println("Agencia ya se encuentra registrada.\n");
        } else {
            do {
                System.out.print("Numero de empleados: ");
                nroEmpleados = br.readLine().trim().toUpperCase();
            } while (nroEmpleados.trim().length() == 0);
            do {
                System.out.print("Teléfono: ");
                telefono = br.readLine().trim().toUpperCase();
            } while (telefono.trim().length() == 0);
            agencias.registrarAgencia(new Agencia(gerente, nroEmpleados, telefono));
            System.out.println("\nAgencia registrada satisfactoriamente.\n");
        }
    }
    
    static void registrarReserva() throws IOException{
        String numeroConfirmacion, precioTotal, litrosGasolina, indicadorEntrega, metodoPago, comentarios;
        
        do {
            System.out.print("Ingresar Numero de confirmacion: ");
            numeroConfirmacion = br.readLine();
        } while (numeroConfirmacion.trim().length() == 0);
        if (reservas.existeReserva(numeroConfirmacion)) {
            System.out.println("Reserva ya existe.\n");
        } else {
            do {
                System.out.print("Precio Total: ");
                precioTotal = br.readLine().trim().toUpperCase();
            } while (precioTotal.trim().length() == 0);
            do {
                System.out.print("Litros de Gasolina: ");
                litrosGasolina = br.readLine().trim().toUpperCase();
            } while (litrosGasolina.trim().length() == 0);
            do {
                System.out.print("Indicador de entrega: ");
                indicadorEntrega = br.readLine().trim().toUpperCase();
            } while (indicadorEntrega.trim().length() == 0);
            do {
                System.out.print("Metodo de pago: ");
                metodoPago = br.readLine().trim().toUpperCase();
            } while (metodoPago.trim().length() == 0);
            do {
                System.out.print("Comentarios: ");
                comentarios = br.readLine().trim().toUpperCase();
            } while (comentarios.trim().length() == 0);
            
            reservas.registrarReserva(new Reserva(numeroConfirmacion, precioTotal, litrosGasolina, indicadorEntrega, metodoPago, comentarios));
            System.out.println("\nReserva exitosa.\n");
        }
    }

}
