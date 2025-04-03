/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Athur Lindo
 */
import javax.swing.JOptionPane;

public class exercicio3 {
    public static void main(String[] args) {
        // solicita a altura do usuario em metros
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura (em metros):"));
        
        // solicita o sexo do usuario: M para masculino ou F para feminino
        String sexo = JOptionPane.showInputDialog("Digite o sexo (M para masculino, F para feminino):");

        // calcula o peso ideal com base na altura e no sexo
        double pesoIdeal = calcularPesoIdeal(altura, sexo);

        // verifica se o sexo foi inserido corretamente e exibe o peso ideal
        if (pesoIdeal > 0) {
            JOptionPane.showMessageDialog(null, "O peso ideal e: " + pesoIdeal + " kg");
        } else {
            JOptionPane.showMessageDialog(null, "Sexo invalido. Digite M ou F.");
        }
    }

    // funcao que calcula o peso ideal com base na altura e no sexo
    static double calcularPesoIdeal(double altura, String sexo) {
        if (sexo.equalsIgnoreCase("M")) {
            return (72.7 * altura) - 58;
        } else if (sexo.equalsIgnoreCase("F")) {
            return (62.1 * altura) - 44.7;
        } else {
            return 0;  
        } 
    }
}
