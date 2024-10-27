/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject12;

/**
 *
 * @author Athur Lindo
 */import java.util.Arrays;
public class Mavenproject12 {

    public static void main(String[] args) {
     Integer[] numerosCrescentes = new Integer[50];
        for (int i = 0; i < 50; i++) {
            numerosCrescentes[i] = (int)(Math.random() * 100); 
        }
        Arrays.sort(numerosCrescentes); 
        System.out.println("Números em ordem crescente: " + Arrays.toString(numerosCrescentes));   
    }
}
