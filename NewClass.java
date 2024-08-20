/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 * 
 * @author Athur Lindo
 */ import java.util.Scanner;
   public class NewClass {
    public static void main(String[] args) {
        try (Scanner Scanner = new Scanner(System.in)) {
            System.out.print("Digite a hora de início do turno (0 a 23): ");
            int hora = Scanner.nextInt();
            if (hora < 0 || hora > 23) {
                System.out.println("Hora inválida. Por favor, insira uma hora entre 0 e 23.");
            } else {
                if (hora >= 5 && hora < 13) {
                    System.out.println("Turno de Manhã");
                } else if (hora >= 13 && hora < 21) {
                    System.out.println("Turno de Tarde");
                } else {
                    System.out.println("Turno de Noite");
                }
            }   }
}
   }
