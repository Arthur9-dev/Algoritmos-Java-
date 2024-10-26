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
      String[] nomes = {"Ana", "Carlos", "Bia", "Fernando", "Eduardo", "Gabriel", "Heitor", "Igor", "Julia", "Karen", "Luiz", "Marcos", "Nata"
              + "lia", "Pedro", "Roberta"};
       Arrays.sort(nomes, Collections.reverseOrder());  
        
        System.out.println("Nomes em ordem decrescente:");
        for (String nome : nomes) {
            System.out.print(nome + " ");
        }    
    }
}
