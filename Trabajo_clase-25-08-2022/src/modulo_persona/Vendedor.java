/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo_persona;

/**
 *
 * @author SALA
 */
public class Vendedor {
    
   private String nombre;
   private String apellidos;
   private String genero;
   private int numArticulos;

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getGenero() {
        return genero;
    }

    public int getNumArticulos() {
        return numArticulos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNumArticulos(int numArticulos) {
        this.numArticulos = numArticulos;
    }
    
    public static int descontarStock(int numArticulosCliente, int numArticulosVendedor){
      int articulosTotales = (numArticulosVendedor-numArticulosCliente);
      return articulosTotales;
        
    }
   
   
    
    
}
