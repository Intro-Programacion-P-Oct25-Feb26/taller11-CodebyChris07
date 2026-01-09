/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;

/**
 *
 * @author reroes
 */
public class Problema5 {

    public static void main(String[] args) {
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int[][] informacion2 = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int[][] resultado = obtenerSuma(informacion, informacion2);

        for (int fila = 0; fila < resultado.length; fila++) {
            for (int colum = 0; colum < resultado[fila].length; colum++) {
                System.out.printf("%s\t", resultado[fila][colum]);

            }
            System.out.printf("\n");
        }
    }
public static int[][] obtenerSuma (int[][] a, int[][] b){
int[][] matrizSuma = new int [3][3];
for (int fila = 0; fila < matrizSuma.length; fila++) { 
        for (int colum = 0; colum < matrizSuma[fila].length; colum++) { 
            matrizSuma[fila][colum] = a[fila][colum] + b[fila][colum];
        }
    }
    return matrizSuma;
}

}
