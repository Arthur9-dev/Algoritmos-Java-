/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject28;

/**
 *
 * @author Athur Lindo
 */
public class Mavenproject28 {

    public static void main(String[] args) {
           double[][] matriz = {
            {1.2, 2.3, 3.4, 4.5},
            {5.6, 6.7, 7.8, 8.9},
            {9.1, 10.2, 11.3, 12.4},
            {13.5, 14.6, 15.7, 16.8}
        };

        System.out.println("Diagonal principal:");
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        System.out.println("\nDiagonal secundária:");
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[i][3 - i] + " ");
     }
    }
}
