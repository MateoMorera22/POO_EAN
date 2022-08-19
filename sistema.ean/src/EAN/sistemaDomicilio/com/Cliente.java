/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EAN.sistemaDomicilio.com;

import javax.swing.JOptionPane;

/**
 *
 * @author SALA
 */
public class Cliente {
  
    String nombre;
    String apellido;
    int numArticulosCarro;
    String solicitarDomicilio;
 
    static int comprar(int numArticulos, int stock){
        int stockTotal=stock-numArticulos;
        return stockTotal;
    }
    
    static boolean domicilio(String solicitarDomicilio){
        boolean estado = false;
        if(solicitarDomicilio.equals("si") || solicitarDomicilio.equals("SI")){
            estado = true;
        }else{
        
           estado = false;
        }
        return estado;
    }

    void nombre(String showInputDialog) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
