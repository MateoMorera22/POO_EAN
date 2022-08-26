/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo_persona;

import javax.swing.JOptionPane;

/**
 *
 * @author SALA
 */
public class Persona {
    
   private String nombre;
   private String apellidos;
   private int edad;
   private String genero;
   private int numArticulos;

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumArticulos() {
        return numArticulos;
    }

    public void setNumArticulos(int numArticulos) {
        this.numArticulos = numArticulos;
    }
    
    public void comprar(int articulosCliente){
         JOptionPane.showMessageDialog(null, "El numero de productos que compro es: " + articulosCliente);
    }
   
    
    
}
