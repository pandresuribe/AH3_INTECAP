
package com.mycompany.clase4_ejercicio1;

public class Clase4_Ejercicio1 {

    public static void main(String[] args) {
        
         int[] numerosPares = new int[50];
         
        int contador = 0;
        for (int i = 1; i <= 100; i ++) {
            if (i % 2 == 0) {
                numerosPares[contador] = i;
                contador++;
            }
        }

        for (int numero : numerosPares) {
            System.out.println(numero);
        }
    }
}
