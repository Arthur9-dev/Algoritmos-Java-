/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject7;

/**
 *
 * @author Athur Lindo
 */import java.util.Arrays;
   import java.util.Collections;
public class Mavenproject7 {

    public static void main(String[] args) {
         Integer[] numeros = new Integer[50];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * 100);  
        }
        
        Arrays.sort(numeros, Collections.reverseOrder()); 
        
        System.out.println("Nu"
                + "meros em ordem decrescente:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}
