/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ejerciciosclase5poo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author SALA
 */
public class EjerciciosClase5POO {

    // declarando otra funcion
    static int sumar(int a, int b) {
        int resultado = (a + b);
        return resultado;
    }

    static boolean bisiesto(int año) {
        int p, q, r;

        p = año % 4;
        q = año % 100;
        r = año % 400;

        if (p == 0 && (q != 0 || r == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        /* 
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero 1"); 
       int a = leer.nextInt();
        System.out.println("Ingrese el numero 2");
       int b = leer.nextInt();
        System.out.println(sumar(a, b));
         */
        
        Scanner leer = new Scanner(System.in);
        String continuar=" ";
        
        while(!continuar.equals("salir")){
        int year = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese el año"));
        boolean esBisiesto = bisiesto(year);

        if (esBisiesto == true) {
            JOptionPane.showMessageDialog(null, "El " + year + " es bisiesto");
        } else {
            JOptionPane.showMessageDialog(null, "El " + year + " no es bisiesto");
        }
        
         
        continuar = JOptionPane.showInputDialog(null, "¿Desea continuar?, escriba (salir) para salir de lo contrario continue");
        
        }
   
    }
}
