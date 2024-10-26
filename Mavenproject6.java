/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject6;

/**
 *
 * @author Athur Lindo
 */public class Mavenproject6 {

    public static void main(String[] args) {
    String[] numeros = new String[50];  

       
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = String.valueOf(i + 1);  
        }

        System.out.println("Números crescentes:");
        for (String numero : numeros) {
            System.out.print(numero + " ");  
        }
    }
}