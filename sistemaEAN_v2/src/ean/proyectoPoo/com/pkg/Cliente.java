/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ean.proyectoPoo.com.pkg;

import javax.swing.text.PasswordView;

/**
 *
 * @author mateo
 */
public class Cliente extends Persona{
    
    int numArticulosCarro;
    boolean solicitarDomicilio = false;

    public Cliente(int numArticulosCarro,boolean solicitarDomicilio,String nombre, String apellido, String fechaNacimiento, String Genero, String email, String password, int id) {
        super(nombre, apellido, fechaNacimiento, Genero, email, password, id);
        this.numArticulosCarro = numArticulosCarro;
        this.solicitarDomicilio = solicitarDomicilio;
    }

    public int getNumArticulosCarro() {
        return numArticulosCarro;
    }

    public boolean getSolicitarDomicilio() {
        return solicitarDomicilio;
    }

    public void setSolicitarDomicilio(boolean solicitarDomicilio) {
        this.solicitarDomicilio = solicitarDomicilio;
    }
    
    public static int comprar(int numArticulos, int stock){
        int stockTotal=stock-numArticulos;
        return stockTotal;
    }
    
    public static boolean solicitarDomicilio(String solicitarDomicilio){
        boolean estado = false;
        if(solicitarDomicilio.equals("si") || solicitarDomicilio.equals("SI")){
            estado = true;
        }else{
           estado = false;
        }
        return estado;
    }
    
    public static void estadoDomicilio(boolean estadoDomiciliario){
    if(estadoDomiciliario==true){
        System.out.println("El domiciliario se encuentra gestionando su orden");
    }else{
        System.out.println("Señor cliente por el momento no hay un domiciliario");
    }
    }

    @Override
    public boolean ingresar(String entradaPassword) {
        String pass = this.getPassword();
        boolean passState = false;
      if(entradaPassword.equals(pass)){
          System.out.println("Bienvenido al sistema cliente");
          passState = true;
      }else{
          System.out.println("La contraseña es incorrecta");
      }
      return passState;
    }

    
    
}
