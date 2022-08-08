/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio2clasepoo;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Ejercicio2ClasePOO {

    public static void main(String[] args) {
       int numeros[] = new int [5];
Scanner leer = new Scanner(System.in);
int numero = 0;

for(int i=0;i<numeros.length;i++){
System.out.println("Ingrese un numero");
numeros[i]= leer.nextInt();
}

for (int elemento:numeros){
            System.out.println(elemento);
        }
    }
}
