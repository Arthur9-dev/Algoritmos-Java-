/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject30;

/**
 *
 * @author Athur Lindo
 */import java.util.Scanner;
public class Mavenproject30 {

    public static void main(String[] args) {
        char[][] tabuleiro = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };
        Scanner scanner = new Scanner(System.in);
        boolean jogando = true;
        char jogadorAtual = 'X';

        while (jogando) {
            System.out.println("Tabuleiro:");
            for (char[] linha : tabuleiro) {
                for (char celula : linha) {
                    System.out.print("[" + celula + "]");
                }
                System.out.println();
            }

            System.out.println("Jogador " + jogadorAtual + ", escolha a linha e coluna (0-2):");
            int linha = scanner.nextInt();
            int coluna = scanner.nextInt();

            if (tabuleiro[linha][coluna] == ' ') {
                tabuleiro[linha][coluna] = jogadorAtual;
                jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
            } else {
                System.out.println("Posição ocupada! Tente novamente.");
            }

           } 
        }
}
