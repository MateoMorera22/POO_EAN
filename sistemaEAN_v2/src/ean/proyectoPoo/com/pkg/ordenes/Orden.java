/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ean.proyectoPoo.com.pkg.ordenes;

import ean.proyectoPoo.com.pkg.inventario.Articulo;

/**
 *
 * @author mateo
 */
public class Orden {
    Articulo articulosOrden[];
    int ID;
    int precioTotal;

    public Articulo[] getArticulosOrden() {
        return articulosOrden;
    }

    public int getID() {
        return ID;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setArticulosOrden(Articulo[] articulosOrden) {
        this.articulosOrden = articulosOrden;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }
    
    
    
    
    
}
