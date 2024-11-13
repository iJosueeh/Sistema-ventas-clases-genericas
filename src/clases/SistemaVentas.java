/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;
import java.util.List;

public class SistemaVentas<T extends Producto> {

    private List<Boleta> ventas;

    public SistemaVentas() {
        ventas = new ArrayList<>();
    }

    public void generarVenta(Cliente cliente, List<T> productos) {
        Boleta<T> boletaVentas = new Boleta<>(cliente);

        for (T producto : productos) {
            boletaVentas.agregarProducto(producto);
        }

        ventas.add(boletaVentas);
    }

    public void mostrarVentas() {
        System.out.println("------------------------\n");
        for (Boleta<T> boleta : ventas) {
            boleta.mostrarBoleta();
            System.out.println("---------------------\n");
        }
    }
    
}
