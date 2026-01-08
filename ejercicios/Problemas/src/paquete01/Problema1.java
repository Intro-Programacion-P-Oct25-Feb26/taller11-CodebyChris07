/*
 Se requiere diseñar un procedimiento (método que no retorna ningún valor) 
que permita procesar un arreglo bidimensional de números enteros.

El procedimiento debe recorrer completamente la estructura bidimensional y 
seleccionar únicamente aquellos elementos cuyo valor sea par. Los valores que 
cumplan esta condición deberán ser concatenados y mostrados en una única cadena 
de texto, respetando el orden en el que aparecen dentro del arreglo.

El procedimiento no debe generar ni devolver nuevos arreglos, sino que su 
función será exclusivamente procesar la información recibida y presentar el 
resultado por pantalla.

Para la verificación de la solución, se trabajará con el siguiente arreglo 
bidimensional:
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        imprimirDatos(informacion);
    }

    public static void imprimirDatos(int[][] datos) {
        String cadena = "";
        for (int a = 0; a < datos.length; a++) {
            for (int b = 0; b < datos[a].length; b++) {
                if ((datos[a][b] % 2) == 0) {
                    cadena = String.format("%s%d\n", cadena, datos[a][b]);
                }
            }
        }
       System.out.println(cadena);
    }
}
