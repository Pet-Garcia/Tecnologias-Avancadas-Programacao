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
public class Cliente extends Pessoa{ // HErança
    private double saldo;

    public Cliente(){ //Construtor
        JOptionPane.showMessageDialog(null, "Cliente");
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
