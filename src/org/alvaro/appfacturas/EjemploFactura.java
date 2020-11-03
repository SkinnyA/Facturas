package org.alvaro.appfacturas;

import org.alvaro.appfacturas.model.*;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNif("12345678A");
        cliente.setNombre("Alvaro");

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese una descripcion de la factura: ");
        Factura factura = new Factura(s.nextLine(), cliente);

        Producto producto;


        System.out.println();

        for(int i = 0; i < 2; i++){
            producto = new Producto();
            System.out.println("Ingrese producto numero " + producto.getCodigo() + ": ");
            producto.setNombre(s.nextLine());

            System.out.println("Ingrese el precio: ");
            producto.setPrecio(s.nextFloat());

            System.out.println("Ingrese la cantidad: ");

            factura.addItemFactura(new ItemFactura(s.nextInt(), producto));

            System.out.println();
            s.nextLine();
        }
        System.out.println(factura);
    }
}
