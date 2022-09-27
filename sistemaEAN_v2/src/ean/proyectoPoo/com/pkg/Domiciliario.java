/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ean.proyectoPoo.com.pkg;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Domiciliario extends Persona {

    String placaMoto;
    boolean estado;

    public Domiciliario(String placaMoto, boolean estado, String nombre, String apellido, String fechaNacimiento, String Genero, String email, String password, int id) {
        super(nombre, apellido, fechaNacimiento, Genero, email, password, id);
        this.placaMoto = placaMoto;
        this.estado = estado;
    }


    public String getPlacaMoto() {
        return placaMoto;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    

    @Override
    public boolean ingresar(String entradaPassword) {
        String pass = this.getPassword();
        boolean passState = false;
      if(entradaPassword.equals(pass)){
          System.out.println("Bienvenido al sistema sr. repartid@r");
          passState = true;
      }else{
          System.out.println("La contraseña es incorrecta");
      }
      return passState;
    }
    
    
    public static boolean AsignarDomicilio(boolean entradaEstado){
        boolean estadoDomi = false;
        if(entradaEstado == true){
        System.out.println("Sr tiene un pedido, desea tomarlo?");
        Scanner leer = new Scanner(System.in);
        String opc = leer.nextLine();
        if(opc.equals("si") || opc.equals("SI")){
            estadoDomi = true;
        }
        }else{
            System.out.println("En el momento no se tienen domicilios...");
            estadoDomi=false;
        }
        return estadoDomi;
    }


}
