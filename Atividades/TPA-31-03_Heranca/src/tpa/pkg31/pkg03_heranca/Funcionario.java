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
    private double salario;
    
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    public String getCargo(){
        return this.cargo;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    public double getSalario(){
        return this.salario;
    }
}
