/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_clase;

/**
 *
 * @author SALA
 */
public class Persona {
    
    // encapsulamiento
    
    
   private String nombre;
   private String apellidos;
   private int edad;
   private String genero;
   
   
   public String getNombre(){
     return this.nombre;
   }
   
   public void setNombre(String entradaNombre){
             this.nombre = entradaNombre;
   }
   
   public String getApellido(){
   return this.apellidos;
   }
   
   public void setApellido(String entradaApellido){
       this.apellidos=entradaApellido;
   }
   
   
   public int getEdad(){
   return this.edad;
   }
   
   public void setEdad(int edadEntrada){
       this.edad=edadEntrada;
   }
   
   public String getGenero(){
   return this.genero;
   }
   
   public void setGenero(String entradaGenero){
   this.genero = entradaGenero;
   }

   void hablar(){
       System.out.println("Persona hablando");
       System.out.println(edad);
   }
   
   void caminar (int entradaCantidadPasos){
   int pasos = 0;
   while (pasos<=entradaCantidadPasos){
       pasos++;
       System.out.println("Persona caminando pasos dados: " + pasos);
   }
   }
   
   // aprendiendo uml e 24 josep schuller
   // Loombook
   
   
    
}
