/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpa.pkg31.pkg03_heranca;

/**
 *
 * Pessoa -> Funcionario
 * Funcionario herda de Pessoa
 */
public class Funcionario extends Pessoa{
    private String cargo;
    private String salario;
    
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    public String getNome(){
        return this.cargo;
    }
    
    public void setSalario(String salario){
        this.salario = salario;
    }
    public String getSalario(){
        return this.salario;
    }
}
