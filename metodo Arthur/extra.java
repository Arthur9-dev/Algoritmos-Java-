 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Athur Lindo
 */
import javax.swing.JOptionPane;

public class extra {
    public static void main(String[] args) {
        // solicita o valor antes do desconto ao usuario
        double valorOriginal = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor original do produto:"));
        
        // solicita a porcentagem de desconto ao usuario
        double porcentagemDesconto = Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem de desconto:"));

        // calcula o valor do desconto
        double valorDesconto = calcularDesconto(valorOriginal, porcentagemDesconto);
        
        // exibe o valor do desconto
        JOptionPane.showMessageDialog(null, "O valor do desconto e: R$ " + valorDesconto);

        // calcula o valor final do produto apos aplicar o desconto
        double valorFinal = calcularValorFinal(valorOriginal, valorDesconto);
        
        // exibe o valor final do produto
        JOptionPane.showMessageDialog(null, "O valor final do produto e: R$ " + valorFinal);

        // verifica se o valor final esta abaixo de 50 reais e exibe uma mensagem
        if (valorFinal < 50.00) {
            JOptionPane.showMessageDialog(null, "produto com um otimo preco");
        }
    }

    // funcao que calcula o valor do desconto com base no valor original e na porcentagem de desconto
    static double calcularDesconto(double valorOriginal, double porcentagemDesconto) {
        return (valorOriginal * porcentagemDesconto) / 100;
    }

    // funcao que calcula o valor final do produto apos aplicar o desconto
    static double calcularValorFinal(double valorOriginal, double valorDesconto) {
        return valorOriginal - valorDesconto;
    }
}
