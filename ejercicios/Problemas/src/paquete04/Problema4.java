/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema4 {

    static Scanner entrada = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int elegir;
        String nombre;
        String cedula;
        System.out.println("Ingrese 1 para valor de planilla de luz, 2 para "
                + "valor del predio de un inmueble)");
        elegir = entrada.nextInt();
        entrada.nextLine(); // limpieza de buffer
        if (elegir == 1) {
            System.out.println("Ingrese su nombre");
            nombre = entrada.nextLine();
            System.out.println("Ingrese su cedula");
            cedula = entrada.nextLine();
            calcularValorLuz(nombre, cedula);
        } else {
            if (elegir == 2) {
                System.out.println("Ingrese su nombre");
                nombre = entrada.nextLine();
                System.out.println("Ingrese su cedula");
                cedula = entrada.nextLine();
                calcularPredio(nombre, cedula);
            } else {
                System.out.println("Ingrese una opcion valida");

            }
        }

    }

    public static void calcularValorLuz(String n, String c) {
        double kilowatio;
        double numKilowatio;
        double valorLuz;
        System.out.println("Ingrese el valor del Kilowatio");
        kilowatio = entrada.nextDouble();
        System.out.println("Ingrese su numero de kilowatios al mes");
        numKilowatio = entrada.nextDouble();
        valorLuz = kilowatio * numKilowatio;
        System.out.printf("Cliente %s con cédula %s debe cancelar el valor de "
                + "$%s", n, c, valorLuz);

    }
     public static void calcularPredio(String n, String c) {
        double inmueble;
        double predio;
        System.out.println("Ingrese el valor del inmueble");
        inmueble = entrada.nextDouble();
        predio = inmueble * 0.02;
        System.out.printf("Cliente %s con cédula %stiene un bien inmueble "
                + "valorado en $%s y tiene que pagar de predio $ %s.", n, c, 
                inmueble, predio );
     }
}
