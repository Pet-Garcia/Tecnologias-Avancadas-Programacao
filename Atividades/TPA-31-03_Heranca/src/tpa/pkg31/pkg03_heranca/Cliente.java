/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpa.pkg31.pkg03_heranca;

/**
 *
 * Pessoa -> Cliente
 * Cliente herda de Pessoa
 */
public class Cliente extends Pessoa {
    private String saldo;
    
    public void setSaldo(String saldo){
        this.saldo = saldo;
    }
    public String getSaldo(){
        return this.saldo;
    }
}
