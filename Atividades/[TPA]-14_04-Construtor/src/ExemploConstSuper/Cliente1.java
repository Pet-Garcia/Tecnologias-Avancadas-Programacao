/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExemploConstSuper;

/**
 *
 * @author aluno
 */
public class Cliente1 extends Pessoa {
    private double saldo;
    
    public Cliente1(){
        
    }
    
    public Cliente1(double saldo, String nome){ //Declarado a variavel dos construtores
        super(nome); //Envia os dados necessarios para o construtor que está herdando.
        this.saldo = saldo;
    }
    
    public void main(){
        Cliente1 c = new Cliente1();
    }
}
