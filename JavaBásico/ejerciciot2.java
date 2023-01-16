package Ejercicios;

import java.util.Scanner;

public class Funciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el precio: ");
        double precio = scanner.nextDouble();

        double nuevoprecio = preciomasIVA(precio);
        System.out.println("Precio más IVA: " + nuevoprecio);

    }

    static double preciomasIVA(double precio) {
        return precio * 1.21;
    }

}
