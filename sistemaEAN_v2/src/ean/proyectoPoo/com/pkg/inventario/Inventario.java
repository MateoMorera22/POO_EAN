/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ean.proyectoPoo.com.pkg.inventario;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Inventario {
    private Articulo listaArticulos[];
    private String nombre;
    private int idInventario;

    public Inventario(Articulo[] listaArticulos, String nombre, int idInventario) {
        this.listaArticulos = listaArticulos;
        this.nombre = nombre;
        this.idInventario = idInventario;
    }

    public Articulo[] getListaArticulos() {
        return listaArticulos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdInventario() {
        return idInventario;
    }
    
    public static int contarArticulos(Articulo ListaArticulos[]){
       int contador = ListaArticulos.length;
       return contador;
    }
    
    
    
    public static void eliminarArticulos(Articulo ListaArticulos[]){
        System.out.println("Ingrese el id del producto a eliminar");
        Scanner leer = new Scanner(System.in);
        int selector = leer.nextInt();

    }
    
    public static void agregarArticulo(Articulo articuloEntrada){
    
    
    }

}
