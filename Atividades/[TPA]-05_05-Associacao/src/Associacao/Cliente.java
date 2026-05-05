
package Associacao;

public class Cliente {
    private String nome;
    private Endereco endereco;
    
    public void setNome(String n){
        this.nome = n;
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    public Endereco getEndereco(){
        return this.endereco;
    }
}
