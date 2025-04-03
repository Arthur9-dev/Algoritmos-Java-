/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Athur Lindo
 */  import javax.swing.JOptionPane;

public class Aluno {
     
    private String nome;
    private String matricula;
    private double nota;

     
    public void inserirDados() {
        nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
        matricula = JOptionPane.showInputDialog("Digite a matrícula:");
        nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota:"));
    }

     
    public void mostrarDados() {
        String mensagem = "ALUNO: " + nome + "\n" +
        "MATRICULA: " + matricula + "\n" +
        "NOTA: " + nota + "\n" +
        "SITUAÇÃO: " + (nota >= 6 ? "Aprovado" : "Reprovado");
        JOptionPane.showMessageDialog(null, mensagem);
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}

 
