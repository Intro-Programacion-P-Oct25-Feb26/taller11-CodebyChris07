/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete07;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema7 {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        String[] ciudad = obtenerCiudades();
        caracteres(ciudad);

    }

    public static String[] obtenerCiudades() {
        int numero;
        System.out.println("Ingrese el número de elementos de su arreglo");
        numero = entrada.nextInt();

        entrada.nextLine(); // limpieza de buffer
        String[] ciudades = new String[numero];
        for (int fila = 0; fila < ciudades.length; fila++) {
            System.out.println("Ingrese el nombre de la ciudad");
            ciudades[fila] = entrada.nextLine();
            ciudades[fila] = ciudades[fila].substring(0, 1).toUpperCase() + 
                    ciudades[fila].substring(1).toLowerCase();
        }
        return ciudades;
    }

    public static void caracteres(String[] a) {
        System.out.println("\nCiudades con 4 o 5 caracteres:");
        for (int fila = 0; fila < a.length; fila++) {
            int tamano = a[fila].length();
            if ((tamano == 4) || (tamano == 5)) {
                System.out.println(a[fila]);
            }
        }

    }
}
