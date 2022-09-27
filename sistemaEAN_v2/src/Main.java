
import ean.proyectoPoo.com.pkg.Cliente;
import ean.proyectoPoo.com.pkg.Domiciliario;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author mateo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // crear cliente
        System.out.println("Para ingresar primero registrese");
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombreCli = leer.nextLine();
        System.out.println("Ingrese su Apellido");
        String apellidoCli = leer.nextLine();
        System.out.println("Ingrese su Fecha de nacimiento");
        String nacimientoDateCli = leer.nextLine();
        System.out.println("Ingrese su Genero");
        String GeneroCli = leer.nextLine();
        System.out.println("Ingrese su email");
        String emailCli = leer.nextLine();
        String passwordCli = " ";
        int estadoPass = 2;

        while (estadoPass > 1) {
            System.out.println("Ingrese su password");
            passwordCli = leer.nextLine();
            System.out.println("Ingrese su nuevamente su pasword");
            String passwordCli2 = leer.nextLine();
            if (passwordCli.equals(passwordCli2)) {
                estadoPass = 0;
            } else {
                estadoPass = 2;
            }
        }// valida si la contraseña coincide

        System.out.println("Ingrese el numero de productos a comprar");
        int numProducCli = leer.nextInt();

        Cliente clientePrueba = new Cliente(numProducCli, false, nombreCli,
                apellidoCli, nacimientoDateCli, GeneroCli, emailCli, passwordCli, 1);
 leer.nextLine();
        // Asigna estado para el domiciliario...
        System.out.println("Bienvenido... desea llevar los articulos a domicilio?");
        String entradaDomicilio = leer.nextLine();
        boolean estadoSolicitud = Cliente.solicitarDomicilio(entradaDomicilio);
        clientePrueba.setSolicitarDomicilio(estadoSolicitud);

        // crear cliente
        System.out.println("Ingresar domiciliario");
        System.out.println("Para continuar registre un domiciliario");
        System.out.println("Ingrese su nombre");
        String nombreDomi = leer.nextLine();
        System.out.println("Ingrese su Placa");
        String PlacaDomi = leer.nextLine();
        System.out.println("Ingrese su Apellido");
        String apellidoDomi = leer.nextLine();
        System.out.println("Ingrese su Fecha de nacimiento");
        String nacimientoDateDomi = leer.nextLine();
        System.out.println("Ingrese su Genero");
        String GeneroDomi = leer.nextLine();
        System.out.println("Ingrese su email");
        String emailDomi = leer.nextLine();
        String passwordDomi = " ";
        int estadoPassDomi = 2;

        while (estadoPassDomi > 1) {
            System.out.println("Ingrese su password");
            passwordDomi = leer.nextLine();
            System.out.println("Ingrese su nuevamente su pasword");
            String passwordDomi2 = leer.nextLine();
            if (passwordDomi.equals(passwordDomi2)) {
                estadoPassDomi = 0;
            } else {
                estadoPassDomi = 2;
            }
        }// valida si la contraseña coincide

        Domiciliario domiciliario1 = new Domiciliario(PlacaDomi, false, nombreDomi,
                 apellidoDomi, nacimientoDateDomi, GeneroDomi, emailDomi, passwordDomi, 1);

        boolean entradaEstadoDomi = Domiciliario.AsignarDomicilio(estadoSolicitud);
        domiciliario1.setEstado(estadoSolicitud);

        Cliente.estadoDomicilio(entradaEstadoDomi);

    }

}
