/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject15;

/**
 *
 * @author Athur Lindo
 */import java.util.Arrays;
public class Mavenproject15 {

    public static void main(String[] args) {
 Integer[] numerosImpares = new Integer[100];
        int index = 0;
        for (int i = 0; index < 100; i++) {
            if (i % 2 != 0) {  
                numerosImpares[index++] = i;
            }
        }
        System.out.println("Números ímpares: " + Arrays.toString(numerosImpares));
    }
    }

