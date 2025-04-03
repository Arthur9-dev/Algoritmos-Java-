/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Athur Lindo
 */
import javax.swing.JOptionPane;

public class exercicio2 {
    public static void main(String[] args) {
        // solicita o primeiro valor ao usuario
        double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1 valor:"));
        
        // solicita o segundo valor ao usuario
        double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2 valor:"));
        
        // chama a funcao que calcula a diferenca entre os valores
        diferenca(valor1, valor2);
    }

    static void diferenca(double valor1, double valor2) {
        double diferenca;
        
        // calcula a diferenca entre os valores
        if (valor1 > valor2) {
            diferenca = valor1 - valor2;
        } else {
            diferenca = valor2 - valor1;
        }
        
        // exibe a diferenca entre os valores em uma janela de dialogo
        JOptionPane.showMessageDialog(null, "A diferenca entre os 2 valores e: " + diferenca);   
    }
}
