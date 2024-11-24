/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject27;

/**
 *
 * @author Athur Lindo
 */import java.util.HashSet;
import java.util.Scanner;
public class Mavenproject27 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][5];
        HashSet<Integer> elementos = new HashSet<>();
        int pares = 0, impares = 0;
        boolean repetido = false;

        
        System.out.println("Digite os elementos da matriz 3x5:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = scanner.nextInt();
                if (!elementos.add(matriz[i][j])) {
                    repetido = true;
                }
                if (matriz[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
        }

        System.out.println("A matriz possui elementos repetidos? " + repetido);
        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
    }
}
