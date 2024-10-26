/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject6;

/**
 *
 * @author Athur Lindo
 */import java.util.Arrays;
public class Mavenproject6 {

    public static void main(String[] args) {
      Integer[] numeros = new Integer[50];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * 100);  
        }
        
        Arrays.sort(numeros); 
        
        System.out.println("Numeros em ordem crescente:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}
