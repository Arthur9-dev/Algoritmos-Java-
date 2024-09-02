/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author Athur Lindo
 */import java.util.Scanner;

public class NewClass5 {
     public static String obterMes(int numero) {
        String[] meses = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };
        
        if (numero >= 1 && numero <= 12) {
            return "O mês correspondente ao número " + numero + " é " + meses[numero - 1] + ".";
        } else {
            return "Número inválido. Por favor, digite um número entre 1 e 12.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número entre 1 e 12: ");
        
        if(scanner.hasNextInt()) {
            int numero = scanner.nextInt();
            String mensagem = obterMes(numero);
            System.out.println(mensagem);
        } else {
            System.out.println("Entrada inválida. Por favor, digite um número.");
        }
        
        scanner.close();
    }
}

