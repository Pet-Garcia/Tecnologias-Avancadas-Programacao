
package Loja_ex8;

import javax.swing.JOptionPane;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    
    public Pessoa(){
        
        JOptionPane.showMessageDialog(null, "Passou neste construtor");
    }
    
    public void setNome(String n){
        this.nome = n;
    }
    public String getNome(){
        return nome;
    }
    
    public void setIdade(int i){
        this.idade = i;
    }
    public int getIdade(){
        return idade;
    }
    
    public void setSexo(String s){
        this.sexo = s;
    }
    public String getSexo(){
        return sexo;
    }
}
