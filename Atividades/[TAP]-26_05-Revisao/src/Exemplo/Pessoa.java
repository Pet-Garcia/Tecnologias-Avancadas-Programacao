/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exemplo;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Pessoa {
    private String nome;
    private Endereco endereco; // Associação
    
    // Primeiro a Generica e Depois a Especializada
    public Pessoa(String n, Endereco e){ //Construtor
        JOptionPane.showMessageDialog(null, "Pessoa");
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
