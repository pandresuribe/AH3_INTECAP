
package com.mycompany.clase4_ejercicio2;

public class Clase4_Ejercicio2 {

       public static void main(String[] args) {
        int[] numerosImpares = new int[51];

        int contador = 0;
        for (int i = 1; i <= 100; i += 2) {
            numerosImpares[contador] = i;
            contador++;
        }

        for (int numero : numerosImpares) {
            System.out.println(numero);
        }
    }
}