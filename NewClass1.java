/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author Athur Lindo
 */import java.util.Scanner;
public class NewClass1 {
      public static void exibirMenu() {
        System.out.println("Menu de Opções:");
        System.out.println("1. BigMac");
        System.out.println("2. Quarteirão");
        System.out.println("3. MacChicken");
        System.out.println("4. Cheddar");
        System.out.println("5. Cheese Burger");
    }

    public static String selecionarLanche(int opcao) {
        switch(opcao) {
            case 1:
                return "Você escolheu BigMac.";
            case 2:
                return "Você escolheu Quarteirão.";
            case 3:
                return "Você escolheu MacChicken.";
            case 4:
                return "Você escolheu Cheddar.";
            case 5:
                return "Você escolheu Cheese Burger.";
            default:
                return "Opção inválida. Por favor, selecione um número entre 1 e 5.";
        }
    }

    public static void main(String[] args) {
          try (Scanner Scanner = new Scanner(System.in)) {
              exibirMenu();
              
              System.out.print("Digite o número da sua escolha: ");
              
              if(Scanner.hasNextInt()) {
                  int opcao = Scanner.nextInt();
                  String mensagem = selecionarLanche(opcao);
                  System.out.println(mensagem);
              } else {
                  System.out.println("Entrada inválida. Por favor, digite um número.");
              } }
    }
}

