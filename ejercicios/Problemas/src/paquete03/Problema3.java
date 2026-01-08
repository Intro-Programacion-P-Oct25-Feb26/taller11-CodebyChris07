/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema3 {

    static Scanner entrada = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int elegir;

        System.out.println("Ingrese el area que desea realizar(1 = area del "
                + "cuadrado, 2 = area del triangulo, 3 area del rectangulo)");
        elegir = entrada.nextInt();
        if (elegir == 1) {
            obtenerAreaCuadrado();
        } else {
            if (elegir == 2) {
                obtenerAreaTriangulo();
            } else {
                if (elegir == 3) {
                    obtenerAreaRectangulo();
                } else {
                    System.out.println("Ingrese una opcion valida");

                }
            }
        }
    }

    public static void obtenerAreaCuadrado() {
        double area;
        double lado;
        System.out.println("ingrese el lado del cuadrado");
        lado = entrada.nextDouble();
        area = lado * lado;
        System.out.printf("El area del cuadrado es %s", area);
    }

    public static void obtenerAreaTriangulo() {
        double area;
        double base;
        double altura;
        System.out.println("ingrese la base del triangulo");
        base = entrada.nextDouble();
        System.out.println("ingrese la altura del triangulo");
        altura = entrada.nextDouble();
        area = (base * altura) / 2;
        System.out.printf("El area del trianfulo es %s", area);
    }

    public static void obtenerAreaRectangulo() {
        double area;
        double base;
        double altura;
        System.out.println("ingrese la base del triangulo");
        base = entrada.nextDouble();
        System.out.println("ingrese la altura del triangulo");
        altura = entrada.nextDouble();
        area = base * altura;
        System.out.printf("El area del rectangulo es %s", area);
    }
}
