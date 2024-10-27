/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject11;

/**
 *
 * @author Athur Lindo
 */import java.util.Arrays;
import java.util.Collections;
public class Mavenproject11 {

    public static void main(String[] args) {
      String[] nomesDecrescentes = {"Ana", "Carlos", "Beatriz", "Fabio", "Eduardo", "Julia", "Igor", "Luiza", "Pedro", "Raquel",
                                      "Sofia", "Thiago", "Miguel", "Alice", "Fernanda", "Gabriel", "Henrique", "Isabela", "Ricardo", "Tatiane"};
        Arrays.sort(nomesDecrescentes, Collections.reverseOrder());  
        System.out.println("Nomes em ordem decrescente: " + Arrays.toString(nomesDecrescentes));
    }
}
