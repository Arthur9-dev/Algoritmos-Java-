/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Athur Lindo
 */import javax.swing.JOptionPane;
public class exercicio5 {
    public static void main(String[] args) {
    
        double base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base:"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura:"));

        double hipotenusaQuadrado = calcularHipotenusaQuadrado(base, altura);

        JOptionPane.showMessageDialog(null, "O valor da hipotenusa ao Quadrado e: " + hipotenusaQuadrado);
    }

    static double calcularHipotenusaQuadrado(double base, double altura) {
        double baseQuadrado = base * base;
        double alturaQuadrado = altura * altura;
        return (baseQuadrado + alturaQuadrado);
        
    }
}   
 

