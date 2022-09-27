/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ean.proyectoPoo.com.pkg;

/**
 *
 * @author mateo
 */
public abstract class Persona {
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String Genero;
    private String email;
    private String password;
    private int id;

    public Persona(String nombre, String apellido, String fechaNacimiento, String Genero, String email, String password, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.Genero = Genero;
        this.email = email;
        this.password = password;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getGenero() {
        return Genero;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }

    
    public abstract boolean ingresar(String entradaContraseña);
    

 
}
