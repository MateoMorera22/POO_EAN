package EAN.sistemaDomicilio.com;
import EAN.sistemaDomicilio.com.Cliente;
import EAN.sistemaDomicilio.com.inventario;
import EAN.sistemaDomicilio.com.domiciliario;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author SALA
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Cliente cliente1 = new Cliente();
        inventario inventario1 = new inventario();
        domiciliario domicilario1 = new domiciliario();
        
       cliente1.nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre");
       cliente1.apellido = JOptionPane.showInputDialog(null, "Ingrese el Apellido");
       //cliente1.numArticulosCarro = Integer.parseInt(JOptionPane.showInputDialog
       // (null, "Ingrese el numero de articulos"));
 
       
       //JOptionPane.showMessageDialog(null," Su compra " +cliente1.nombre + " " +
           //    cliente1.apellido +" fue del numero de articulos " 
             //  + cliente1.numArticulosCarro + " Quedaron en el invetario: " + 
             //  cliente1.comprar(cliente1.numArticulosCarro,inventario1.numeroArticulos) );
       
       
       int numArticulos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de articulos"));
       String nombreArticulo = JOptionPane.showInputDialog(null, "Ingrese el nombre");
       for(int i=0; i< numArticulos;i++){
         inventario1.articulos[i]=nombreArticulo;
         inventario1.cantidadArticulos[i]= numArticulos;
         JOptionPane.showMessageDialog(null, "Se agrego el producto " + nombreArticulo + " con la cantidad: " + numArticulos);
       }
       
       ////clases, array, funciones.
       
       
    
     

       cliente1.solicitarDomicilio = JOptionPane.showInputDialog(null, "Ingrese "
               + "(si) si desea el domicilio");
       boolean estado = cliente1.domicilio(cliente1.solicitarDomicilio);
       domicilario1.estado = estado;
       
      
      
       

       if(estado == true){
       JOptionPane.showMessageDialog(null, "El domiciliario va en camino");
       }else{
       JOptionPane.showMessageDialog(null, "Se cancela el domicilio");
       }
       
    }
    
    
    
}
