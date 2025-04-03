 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author Athur Lindo
 */
import javax.swing.JOptionPane;

public class exercicio1 {

    public static void main(String[] args) {
        // pede o nome do aluno via uma janela de entrada
        String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
        
        // pede a primeira nota do aluno
        double nota1 = lerNota("Digite a 1 nota:");
        
        // pede a segunda nota do aluno
        double nota2 = lerNota("Digite a 2 nota:");
        
        // pede a media das notas
        double media = calcularMedia(nota1, nota2);
        
        // verifica se o aluno foi aprovado ou reprovado
        String resultado;
        if (media >= 7.0) {
            resultado = "Aprovado";
        } else {
            resultado = "Reprovado";
        }
        
        // exibe uma mensagem com o nome do aluno, a media e o resultado
        JOptionPane.showMessageDialog(null, nome + " teve media de " + media + " e " + resultado);
    }

    // funcao que solicita uma nota do aluno e a converte para double
    static double lerNota(String mensagem) {
        return Double.parseDouble(JOptionPane.showInputDialog(mensagem));
    }

    // funcao que calcula a media  
    static double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }
}

