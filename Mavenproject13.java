/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject13;

/**
 *
 * @author Athur Lindo
 */import java.util.Arrays;
import java.util.Collections;
public class Mavenproject13 {

    public static void main(String[] args) {
        Integer[] numerosDecrescentes = new Integer[50];
        for (int i = 0; i < 50; i++) {
            numerosDecrescentes[i] = (int)(Math.random() * 100);  
        }
        Arrays.sort(numerosDecrescentes, Collections.reverseOrder()); 
        System.out.println("Números em ordem decrescente: " + Arrays.toString(numerosDecrescentes));
    }
}
