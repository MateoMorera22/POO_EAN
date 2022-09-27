/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ean.proyectoPoo.com.pkg.inventario;

/**
 *
 * @author mateo
 */
public class Articulo {
    private int idArticulo;
    private String nombreArticulo;
    private String marcaArticulo;
    private int cantidadArticulo;
    private String descripcionArticulo;

    public Articulo(int idArticulo, String nombreArticulo, String marcaArticulo, int cantidadArticulo, String descripcionArticulo) {
        this.idArticulo = idArticulo;
        this.nombreArticulo = nombreArticulo;
        this.marcaArticulo = marcaArticulo;
        this.cantidadArticulo = cantidadArticulo;
        this.descripcionArticulo = descripcionArticulo;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public String getMarcaArticulo() {
        return marcaArticulo;
    }

    public int getCantidadArticulo() {
        return cantidadArticulo;
    }

    public String getDescripcionArticulo() {
        return descripcionArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public void setMarcaArticulo(String marcaArticulo) {
        this.marcaArticulo = marcaArticulo;
    }

    public void setCantidadArticulo(int cantidadArticulo) {
        this.cantidadArticulo = cantidadArticulo;
    }

    public void setDescripcionArticulo(String descripcionArticulo) {
        this.descripcionArticulo = descripcionArticulo;
    }
    
   
 
}
