/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ean.proyectoPoo.com.pkg;

import ean.proyectoPoo.com.pkg.inventario.Inventario;

/**
 *
 * @author mateo
 */
public class Proveedor extends Persona {

    private Inventario inventarioProveedor;

    public Proveedor(Inventario inventarioProveedor, String nombre, String apellido, String fechaNacimiento, String Genero, String email, String password, int id) {
        super(nombre, apellido, fechaNacimiento, Genero, email, password, id);
        this.inventarioProveedor = inventarioProveedor;
    }

    public Inventario getInventarioProveedor() {
        return inventarioProveedor;
    }

    @Override
public boolean ingresar(String entradaPassword) {
        String pass = this.getPassword();
        boolean passState = false;
      if(entradaPassword.equals(pass)){
          System.out.println("Bienvenido al sistema Proveedor");
          passState = true;
      }else{
          System.out.println("La contraseña es incorrecta");
      }
      return passState;
    }

     
    
}
