/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Athur Lindo
 */import java.util.Scanner;
public class NewClass1 {
    public static void main(String[] args) {
        try (Scanner Scanner = new Scanner(System.in)) {
            System.out.print("Digite o peso (em kg): ");
            double peso = Scanner.nextDouble();
            System.out.print("Digite a altura (em metros): ");
            double altura = Scanner.nextDouble();
            double imc = peso / (altura * altura);
            System.out.printf("O IMC é: %.2f%n", imc);
            if (imc < 18) {
                System.out.println("Classificação: Magreza");
            } else if (imc >= 18.0 && imc <= 24.9) {
                System.out.println("Classificação: Saudável");
            } else if (imc >= 25.0 && imc <= 29.9) {
                System.out.println("Classificação: Sobrepeso");
            } else {
                System.out.println("Classificação: Obesidade");
            }
        }
    }
}
