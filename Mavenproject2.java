/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author Athur Lindo
 */import java.util.Scanner;
public class Mavenproject2 {

     public static boolean ehTriangulo(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public static String tipoTriangulo(double a, double b, double c) {
        if (a == b && b == c) {
            return "Triângulo Equilátero";
        } else if (a == b || a == c || b == c) {
            return "Triângulo Isósceles";
        } else {
            return "Triângulo Escaleno";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do lado A (em cm): ");
        if (scanner.hasNextDouble()) {
            double a = scanner.nextDouble();

            System.out.print("Digite o valor do lado B (em cm): ");
            if (scanner.hasNextDouble()) {
                double b = scanner.nextDouble();

                System.out.print("Digite o valor do lado C (em cm): ");
                if (scanner.hasNextDouble()) {
                    double c = scanner.nextDouble();

                    if (ehTriangulo(a, b, c)) {
                        System.out.println("Os valores formam um " + tipoTriangulo(a, b, c) + ".");
                    } else {
                        System.out.println("Os valores fornecidos não formam um triângulo.");
                    }
                } else {
                    System.out.println("Entrada inválida para o lado C.");
                }
            } else {
                System.out.println("Entrada inválida para o lado B.");
            }
        } else {
            System.out.println("Entrada inválida para o lado A.");
        }

        scanner.close(); 
       
    }
}
