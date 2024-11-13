
import clases.Cliente;
import clases.Producto;
import clases.SistemaVentas;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class Main {

    public static void main(String[] args) {
        List<Producto> productosCliente = new ArrayList<>();
        boolean continuar = true;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Bienvenido al sistema de Ventas \n");

            System.out.print("Nombre del Cliente: ");
            String nombreCliente = scanner.nextLine();
            Cliente cliente = new Cliente(nombreCliente);

            productosCliente.clear();

            System.out.print("¿Cuántos productos vas a agregar?: ");
            int cantidadProductos = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < cantidadProductos; i++) {
                System.out.print("Nombre del producto " + (i + 1) + ": ");
                String nombreProducto = scanner.nextLine();

                System.out.print("Precio del producto " + (i + 1) + ": ");
                double precioProducto = scanner.nextDouble();
                scanner.nextLine(); 

                Producto producto = new Producto(nombreProducto, precioProducto);
                productosCliente.add(producto);

                System.out.println();
            }

            SistemaVentas<Producto> sistemaVentas = new SistemaVentas<>();
            sistemaVentas.generarVenta(cliente, productosCliente);
            sistemaVentas.mostrarVentas();

            System.out.println("¿Deseas realizar otra venta?");
            System.out.println("1. Sí");
            System.out.println("2. No");
            int menuOpcion = scanner.nextInt();
            scanner.nextLine(); 

            continuar = (menuOpcion == 1);
        } while (continuar);

    }
}
