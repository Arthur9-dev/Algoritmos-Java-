/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author Athur Lindo
 */import java.util.Scanner;
public class NewClass4 {
   public static double calcularMedia(double[] notas) {
        double soma = 0;
        for(double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public static String[] determinarConceito(double media) {
        if (media >= 9) {
            return new String[]{"A", "Aprovado"};
        } else if (media >= 7) {
            return new String[]{"B", "Aprovado"};
        } else if (media >= 5) {
            return new String[]{"C", "Aprovado"};
        } else if (media >= 2.5) {
            return new String[]{"D", "Reprovado"};
        } else {
            return new String[]{"E", "Reprovado"};
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            if (scanner.hasNextDouble()) {
                notas[i] = scanner.nextDouble();
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                return;
            }
        }

        double media = calcularMedia(notas);
        String[] resultado = determinarConceito(media);

        System.out.printf("Média: %.2f%n", media);
        System.out.println("Conceito: " + resultado[0]);
        System.out.println("Status: " + resultado[1]);

        scanner.close();
    }
} 
 
