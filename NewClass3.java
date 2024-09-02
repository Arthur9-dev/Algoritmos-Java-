/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author Athur Lindo
 */import java.util.Scanner;
public class NewClass3 {
     public static String classificarNadador(int idade) {
        if (idade >= 5 && idade <= 7) {
            return "Infantil A";
        } else if (idade >= 8 && idade <= 10) {
            return "Infantil B";
        } else if (idade >= 11 && idade <= 13) {
            return "Juvenil A";
        } else if (idade >= 14 && idade <= 17) {
            return "Juvenil B";
        } else if (idade >= 18) {
            return "Senior";
        } else {
            return "Idade fora das categorias. A idade mínima é 5 anos.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a idade do nadador: ");
        
        if(scanner.hasNextInt()) {
            int idade = scanner.nextInt();
            String categoria = classificarNadador(idade);
            System.out.println("O nadador pertence à categoria: " + categoria);
        } else {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
        }
        
        scanner.close();
    }
}
 