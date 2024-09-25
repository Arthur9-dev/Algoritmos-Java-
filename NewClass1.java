/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class NewClass1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Coletando informações do aluno
        System.out.println("Digite o seu nome:");
        String nome = sc.nextLine();  // Nome do aluno
        System.out.println("Digite a sua turma:");
        String turma = sc.nextLine();  // Turma do aluno

        // Array para armazenar as notas do aluno
        double[] notas = new double[4]; 

        // Laço de repetição para coletar as notas
        for (int i = 0; i < 4; i++) {
            System.out.printf("Digite minha nota do %dº bimestre:\n", (i + 1));
            notas[i] = sc.nextDouble();  // Armazenando cada nota
        }

        // Calculando a média das notas
        double soma = 0;  // Variável para acumular a soma das notas
        for (double nota : notas) {
            soma += nota;  // Acumulando as notas
        }
        double media = soma / 4;  // Calculando a média

        // Exibindo os resultados
        System.out.println("O nome é: " + nome);
        System.out.println("A turma é: " + turma);
        System.out.printf("A média é: %.2f\n", media);

        // Decisão encadeada para verificar a situação do aluno
        if (media >= 7) {
            System.out.println("Aprovado!");  // Se a média for maior ou igual a 7
        } else if (media >= 6.0) {
            System.out.println("Recuperação!");  // Se a média estiver entre 6 e 7
        } else {
            System.out.println("Reprovado!");  // Se a média for menor que 6
        }

        sc.close();  // Fechando o scanner
    }
}
