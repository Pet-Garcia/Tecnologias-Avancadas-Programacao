/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tap.pkg10.pkg03_aluno;

/**
 *
 * @author aluno
 */
public class Aluno {
    // atributos
    private String nome;
    private String ra;
    
    // Setter
    public void setNome(String n){
        this.nome = n;
    }
    public void setRA(String r){
        this.ra = r;
    }
    
    // Getter
    public String getNome(){
        return nome;
    }
    public String getRA(){
        return ra;
    }
    
    
    
    public void cadastrar(String n, String r){
        nome = n;
        ra = r;
    }
}
