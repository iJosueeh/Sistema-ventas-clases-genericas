/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

public class Producto {

    private int id;
    private static int contador = 1;
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.id = contador++;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + getNombre() + ", precio=" + getPrecio() + '}';
    }

}
