/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exemplo;

/**
 *
 * @author aluno
 */
public class Principal {
    public static void main(String[] args){
        Endereco e = new Endereco();
        Cliente c = new Cliente();
        
        e.setLogradouro("Rua um");
        e.setNumero("100");
        
        c.setNome("Ze");
        c.setEndereco(e);
        c.setSaldo(1500);
        
        System.out.println(c.getNome() + c.getEndereco().getLogradouro() + c.getEndereco().getNumero() + c.getSaldo());
    }
}
