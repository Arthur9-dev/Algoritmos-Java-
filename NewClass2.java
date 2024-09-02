/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author Athur Lindo
 */import java.util.Scanner;
  import java.time.LocalDate;

public class NewClass2 {
     public static LocalDate receberData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia: ");
        int dia = scanner.nextInt();

        System.out.print("Digite o mês: ");
        int mes = scanner.nextInt();

        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt();

        return LocalDate.of(ano, mes, dia);
    }

    public static void main(String[] args) {
        System.out.println("Digite a primeira data:");
        LocalDate data1 = receberData();

        System.out.println("Digite a segunda data:");
        LocalDate data2 = receberData();

        if (data1.isBefore(data2)) {
            System.out.println("Ordem crescente: " + data1 + " e " + data2);
        } else {
            System.out.println("Ordem crescente: " + data2 + " e " + data1);
        }
}  
}  
