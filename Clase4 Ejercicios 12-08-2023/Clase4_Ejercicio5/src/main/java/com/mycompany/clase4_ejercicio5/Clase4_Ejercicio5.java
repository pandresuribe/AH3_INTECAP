
package com.mycompany.clase4_ejercicio5;

public class Clase4_Ejercicio5 {

     public static void main(String[] args) {
        int[][] matrizNumeros = new int[20][5]; // 20 filas y 5 columnas para un total de 100 números

        int numero = 1;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 5; j++) {
                matrizNumeros[i][j] = numero;
                numero++;
            }
        }

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrizNumeros[i][j] + " ");
            }
            System.out.println(); // Cambia de línea después de cada fila
        }
    
    }
}