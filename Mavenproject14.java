/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject14;

/**
 *
 * @author Athur Lindo
 */import java.util.Arrays;
public class Mavenproject14 {

    public static void main(String[] args) {
      Integer[] numerosPares = new Integer[100];
        int index = 0;
        for (int i = 0; index < 100; i++) {
            if (i % 2 == 0) {  
                numerosPares[index++] = i;
            }
        }
        System.out.println("Números pares: " + Arrays.toString(numerosPares));  
    }
}
