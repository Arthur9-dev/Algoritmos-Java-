/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject4;

/**
 *
 * @author Athur Lindo
 */import java.util.Arrays;
public class Mavenproject4 {

    public static void main(String[] args) {
           String[] nomes = {"Ana", "Carlos", "Bia", "Fernando", "Eduardo", "Gabriel", "Heitor", "Igor", "Julia", "Karen", "Luiz", "Marcos", "Natalia", "Pedro", "Roberta"};
        Arrays.sort(nomes); 
        
        System.out.println("Nomes em ordem crescente:");
        for (String nome : nomes) {
            System.out.print(nome + " ");
        }
    }
}
    
