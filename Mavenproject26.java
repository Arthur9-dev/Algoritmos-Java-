/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject26;

/**
 *
 * @author Athur Lindo
 */import java.util.Scanner;
public class Mavenproject26 {

    public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int somaImpares = 0;

         
        System.out.println("Digite os elementos da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = scanner.nextInt();
                if (matriz[i][j] % 2 != 0) {
                    somaImpares += matriz[i][j];
                }
            }
        }

        
        System.out.println("Soma de cada coluna:");
        for (int j = 0; j < 5; j++) {
            int somaColuna = 0;
            for (int i = 0; i < 5; i++) {
                somaColuna += matriz[i][j];
            }
            System.out.println("Coluna " + j + ": " + somaColuna);
        }

        
        System.out.println("Soma de cada linha:");
        for (int i = 0; i < 5; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 5; j++) {
                somaLinha += matriz[i][j];
            }
            System.out.println("Linha " + i + ": " + somaLinha);
        }

        System.out.println("Soma dos números ímpares: " + somaImpares);
    }
    }
}
