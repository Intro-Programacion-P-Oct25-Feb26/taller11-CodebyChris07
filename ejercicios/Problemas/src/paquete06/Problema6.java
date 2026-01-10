/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

/**
 *
 * @author reroes
 */
public class Problema6 {
    public static void main(String[] args) {
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};

        double prome = promedio(informacion);

        double desvi = desviacion(informacion, prome);

        System.out.printf("Media aritmética: %.2f\n", prome);
        System.out.printf("Desviación estándar: %.2f\n", desvi);
    }

    public static double promedio(int[] a) {
        int suma = 0;
        double promedio;
        for (int fila = 0; fila < a.length; fila++) {
            suma = suma + a[fila];

        }
        promedio = suma / a.length;
        return promedio;

    }

    public static double desviacion(int[] a, double b) {
        double suma = 0;
        for (int fila = 0; fila < a.length; fila++) {
            suma = suma + Math.pow(a[fila] - b, 2);
        }
        double varianza = suma / a.length;
        return Math.sqrt(varianza);

    }


}
