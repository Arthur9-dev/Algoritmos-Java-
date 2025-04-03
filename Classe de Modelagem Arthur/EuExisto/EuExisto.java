/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Athur Lindo
 */
 public class EuExisto {
    private String nome;   
    private String mensagem;

   
    public EuExisto() {
        this.nome = "";   
        this.mensagem = "Oi, eu existo!";
    }

     
    public EuExisto(String nome) {
        this.nome = nome;
        this.mensagem = "Oi, eu existo!";
    }

     
    public void mostrarExistencia() {
        System.out.println("Oi, meu nome e " + this.getNome() + ", e eu existo!");
    }

     
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
 
