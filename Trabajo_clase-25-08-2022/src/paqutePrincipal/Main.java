package paqutePrincipal;
import javax.swing.JOptionPane;
import modulo_persona.Persona;
import modulo_persona.Vendedor;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author SALA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona persona1 = new Persona();
        
        persona1.setNombre("Mateo");
        persona1.setApellidos("Morera");
        persona1.setEdad(22);
        persona1.setGenero("M");
        
        JOptionPane.showMessageDialog(null, "La persona fue creada con los siguientes datos: ");
        JOptionPane.showMessageDialog(null, "El nombre de la persona es: " + persona1.getNombre());
        JOptionPane.showMessageDialog(null, "El apellido de la persona es: " + persona1.getApellidos());
        JOptionPane.showMessageDialog(null, "El nombre de la persona es: " + persona1.getGenero());
        JOptionPane.showMessageDialog(null, "El nombre de la persona es: " + persona1.getEdad());
        
        int numArticulosCliente =  Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese productos a comprar"));
        
        persona1.setNumArticulos(numArticulosCliente);
        
        Vendedor vendedor1 = new Vendedor();
        vendedor1.setNombre("Pedro");
        vendedor1.setApellidos("algo");
        vendedor1.setGenero("M");
        vendedor1.setNumArticulos(1000);
        
   
        JOptionPane.showMessageDialog(null, "El inventario actualmente cuenta con: " 
                + vendedor1.descontarStock(numArticulosCliente, vendedor1.getNumArticulos()));
        
        int resultadoStock = vendedor1.descontarStock(numArticulosCliente,vendedor1.getNumArticulos());
        
        vendedor1.setNumArticulos(resultadoStock);
        JOptionPane.showMessageDialog(null, "El numero de articulos actuales para el vendedor es: " 
                + vendedor1.getNumArticulos());
        
        
        
        
        
        
    }
    
}
