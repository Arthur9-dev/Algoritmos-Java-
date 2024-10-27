/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject9;

/**
 *
 * @author Athur Lindo
 */
public class Mavenproject9 {

    public static void main(String[] args) {
     String[] campeonatoBrasileiro = {
            "1. Palmeiras", "2. Flamengo", "3. Internacional", "4. São Paulo", "5. Grêmio",
            "6. Fluminense", "7. Corinthians", "8. Athletico-PR", "9. Santos", "10. Vasco",
            "11. Fortaleza", "12. Botafogo", "13. Atlético-MG", "14. Bahia", "15. Ceará",
            "16. Goiás", "17. Sport", "18. Red Bull Bragantino", "19. Atlético-GO", "20. Coritiba"
        };
        System.out.println("Classificação do Campeonato Brasileiro:");
        for (String posicao : campeonatoBrasileiro) {
            System.out.println(posicao);
    }
    }
}
