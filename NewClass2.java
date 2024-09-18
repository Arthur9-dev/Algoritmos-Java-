/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author Athur  
 */import java.util.Scanner;
public class NewClass2 {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);

         
        System.out.print("Informe o valor inicial: ");
        int valorInicial = scanner.nextInt();

        System.out.print("Informe o valor final: ");
        int valorFinal = scanner.nextInt();

        int soma = 0;

        
        for (int i = valorInicial; i <= valorFinal; i++) {
            if (i % 2 == 0) {  
                soma += i; 
            }
        }

       
        System.out.println("A soma dos números pares entre " + valorInicial + " e " + valorFinal + " é: " + soma);

        scanner.close();
    }
}
