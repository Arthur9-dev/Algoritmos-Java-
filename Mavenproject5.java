/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject5;

/**
 *
 * @author Athur Lindo
 */import java.util.Arrays;
import java.util.Collections;
public class Mavenproject5 {

    public static void main(String[] args) {
        String[] nomes = new String[15];  
        
        nomes[0] = "Ana";
        nomes[1] = "Carlos";
        nomes[2] = "Bia";
        nomes[3] = "Fernando";
        nomes[4] = "Eduardo";
        nomes[5] = "Gabriel";
        nomes[6] = "Heitor";
        nomes[7] = "Igor";
        nomes[8] = "Julia";
        nomes[9] = "Karen";
        nomes[10] = "Luiz";
        nomes[11] = "Marcos";
        nomes[12] = "Natalia";
        nomes[13] = "Pedro";
        nomes[14] = "Roberta";
 
        Arrays.sort(nomes, Collections.reverseOrder());

        System.out.println("Nomes em ordem decrescente:");
        for (String nome : nomes) {
            System.out.print(nome + " ");
        }
    }
}
