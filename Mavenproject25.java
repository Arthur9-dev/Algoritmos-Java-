/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject25;

/**
 *
 * @author Athur Lindo
 */
public class Mavenproject25 {

    public static void main(String[] args) {
      
        char[][] matrizA = {
            {'a', 'b', 'c', 'd', 'e'},
            {'f', 'g', 'h', 'i', 'j'},
            {'k', 'l', 'm', 'n', 'o'},
            {'p', 'q', 'r', 's', 't'},
            {'u', 'v', 'w', 'x', 'y'}
        };

        System.out.println("Matriz A:");
        for (char[] linha : matrizA) {
            for (char elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }

       
        int[][] matrizB = {
            {19, 25, 100, 99},
            {10, 7, 25, 14},
            {35, 2, 47, 74}
        };

        System.out.println("\nMatriz B:");
        for (int[] linha : matrizB) {
            for (int elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }

        
        double[][] matrizC = {
            {1.9, 2.5, 10.0},
            {1.0, 7.8, 2.5},
            {3.5, 2.2, 4.7}
        };

        System.out.println("\nMatriz C:");
        for (double[] linha : matrizC) {
            for (double elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }   
    }
}
