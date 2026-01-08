/*
Realizar una solución para el control anual de consumo eléctrico por viviendas.
Se dispone de un conjunto de 10 viviendas de una urbanización. Para cada vivienda 
se desea registrar el consumo de energía eléctrica correspondiente a cada mes 
del año.

Desde un procedimiento principal se debe realizar lo siguiente:

Llamar y generar una función que devuelva el listado de viviendas.

• En esta función se deben solicitar por teclado los datos correspondientes al 
identificador o nombre de cada vivienda.

• La función debe retornar un arreglo unidimensional con los datos ingresados.

Llamar y generar una función que devuelva la matriz de consumos eléctricos mensuales.

• En esta función se deben solicitar por teclado los valores de consumo eléctrico
de cada vivienda para cada mes del año.

• Los datos deben almacenarse en una matriz bidimensional, donde:

 ◦ Las filas representen las viviendas,
 ◦ Las columnas representen los meses del año.
 ◦ La función debe retornar dicha matriz.
Llamar y generar una función adicional que reciba como parámetro la matriz de 
consumos eléctricos.

• Esta función debe:

 ◦ Calcular la suma total anual de consumo para cada vivienda,
 ◦ Almacenar los resultados en un arreglo unidimensional, donde cada posición 
corresponda a una vivienda.
 ◦ Retornar el arreglo de suma total de consumo por cada vivienda
Generar un procedimiento que reciba como parámetros:

• El arreglo de viviendas,

• El arreglo con la suma anual de consumo por vivienda.

• Este procedimiento debe:

 ◦ Construir un reporte en formato de texto, utilizando una sola cadena,
 ◦ Presentar en pantalla el consumo anual correspondiente a cada vivienda.

 */
package paquete02;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author reroes
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] casa = viviendas();
        double[][] consumo = consumoElec();
        double[] suma = sumaTotalVivienda(consumo);
        reporte(casa, suma);
    }

    public static String[] viviendas() {
        Scanner entrada = new Scanner(System.in);
        String[] casa = new String[10];
        for (int a = 0; a < casa.length; a++) {
            System.out.println("Ingrese el nombre de la vivienda");
            casa[a] = entrada.nextLine();
        }
        return casa;
    }

    public static double[][] consumoElec() {
        Scanner entrada = new Scanner(System.in);
        double[][] mensual = new double[10][12];
        for (int a = 0; a < mensual.length; a++) {
            for (int b = 0; b < mensual[a].length; b++) {
                System.out.println("Ingrese el consumo Electrico de la vivienda");
                mensual[a][b] = entrada.nextDouble();
            }
        }
        return mensual;
    }

    public static double[] sumaTotalVivienda(double[][] consu) {
        double[] anual = new double[10];
        for (int a = 0; a < consu.length; a++) {
            double suma = 0;
            for (int b = 0; b < consu[a].length; b++) {
                suma += consu[a][b];
            }
            anual[a] = suma;
        }
        return anual;
    }

    public static void reporte(String[] c, double[] con) {
        for (int a = 0; a < c.length; a++) {
            System.out.printf("El consumo anual de %s es: %s\n", c[a], con[a]);
        }

    }
}
