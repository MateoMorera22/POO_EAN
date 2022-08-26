/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_clase;

import paquete2.Automovil;

/**
 *
 * @author SALA
 */
public class Proyecto_clase {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
    
        Persona persona1 = new Persona();
        
        persona1.setNombre("Mateo");
        persona1.setApellido("Morera");
        persona1.setEdad(22);
        persona1.setGenero("M");
        
        System.out.println("El nombre de persona 1 es: " + persona1.getNombre());
        System.out.println("Los apellidos son de persona 1 es: " + persona1.getApellido());
        System.out.println("la edad de persona 1 es: " + persona1.getEdad());
        System.out.println("El genero de la persona 1 es: " + persona1.getGenero());
        
        persona1.caminar(10);
        
        Persona persona2 = new Persona();
        
        persona2.setNombre("Genesis");
        persona2.setGenero("F");
        persona2.setEdad(21);
        persona2.setApellido("Ospina");
        
        System.out.println("El nombre de persona 2 es: " + persona2.getNombre());
        System.out.println("Los apellidos son de persona 2 es: " + persona2.getApellido());
        System.out.println("la edad de persona 2 es: " + persona2.getEdad());
        System.out.println("El genero de la persona 2 es: " + persona2.getGenero());
        
        persona2.hablar();
        persona2.caminar(5);
        
        
        System.out.println("La ubicacion de persona 2 es: " + persona2);
        
        Automovil auto1 = new Automovil();
        auto1.marca="Audi";
        
        auto1.acelerar(0, 80);
    }
    
}
