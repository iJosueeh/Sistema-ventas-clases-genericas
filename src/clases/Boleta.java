/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;
import java.util.List;

class Boleta<T extends Producto> implements IBoleta {

    private Cliente cliente;
    private List<T> productos;
    private double total;

    public Boleta(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.total = 0.0;
    }

    public double getTotal() {
        return total;
    }

    public void agregarProducto(T producto) {
        productos.add(producto);
        total += producto.getPrecio();
    }

    @Override
    public void mostrarBoleta() {
        System.out.println("----------------------------");
        System.out.println("Cliente: ");
        System.out.println("- ID: " + cliente.getId());
        System.out.println("- Nombre: " + cliente.getNombre());
        System.out.println("Productos comprados: ");
        for (T producto : productos) {
            System.out.println("- " + producto.getId() + ", Nombre: " + producto.getNombre() + ", Precio: " + producto.getPrecio());
        }
        System.out.println("Total: $" + total);
        System.out.println("----------------------------");
    }

}
