/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author SALA
 */
public class Automovil {
    
   public String marca;
    String color;
    String placa;
    double cilindraje;
    String tipo;
    
     public void acelerar  (int entradaVelocidad, int entradaVelocidadFinal){
    for(int velocidad = entradaVelocidad; velocidad <=entradaVelocidadFinal; velocidad+=10){
        System.out.println("Automovil acelerado");
    }
    
    }
    
}
