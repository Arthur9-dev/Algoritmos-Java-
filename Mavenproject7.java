/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject7;

/**
 *
 * @author Athur Lindo
 */  
public class Mavenproject7 {

    public static void main(String[] args) {
        String[] numeros = new String[50];  

        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = String.valueOf(50 - i); 
        }

     
        System.out.println("Números decrescentes:");
        for (String numero : numeros) {
            System.out.print(numero + " ");  
        }
    }
}