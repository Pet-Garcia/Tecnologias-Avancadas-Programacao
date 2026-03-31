/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpa.pkg31.pkg03_heranca;

/**
 *
 * Herança
 * Generalização: Pessoa
 * Especialização Funcionario, Cliente
 */
public class Pessoa {
    private String nome;
    private String cpf;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setCPF(String cpf){
        this.cpf = cpf;
    }
    public String getCPF(){
        return this.cpf;
    }
    
    
    
}
