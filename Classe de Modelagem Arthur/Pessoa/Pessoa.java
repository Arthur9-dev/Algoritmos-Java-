/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Athur Lindo
 */ import javax.swing.JOptionPane;
 
public class Pessoa {
    
    private String nome;
    private int idade;
    private double altura;

    
    public void inserirDados() {
        nome = JOptionPane.showInputDialog("Digite o nome:");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura:"));
    }

     
    public void apresentarPessoa() {
        String dados = "Nome: " + getNome() + "\n" +
                      "Idade: " + getIdade() + "\n" +
                      "Altura: " + getAltura();
        JOptionPane.showMessageDialog(null, dados);
    }

   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}