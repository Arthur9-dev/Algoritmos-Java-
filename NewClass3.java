/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author Athur 
 */import java.util.Scanner;
public class NewClass3 {
      public static void main(String[] args) {
        Scanner scanner;
          scanner = new Scanner(System.in);

     
        System.out.print("Informe o primeiro número: ");
        int primeiroNumero = scanner.nextInt();

        System.out.print("Informe o segundo número: ");
        int segundoNumero = scanner.nextInt();

         
        int maior = Math.max(primeiroNumero, segundoNumero);
        int menor = Math.min(primeiroNumero, segundoNumero);

     
        System.out.println("Números pares em ordem decrescente entre " + maior + " e " + menor + ":");

        for (int i = maior; i >= menor; i--) {
            if (i % 2 == 0) {  
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
