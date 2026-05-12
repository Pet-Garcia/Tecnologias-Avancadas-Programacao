
package Ex1_Contrato_Imovel;

public class Pessoa {
    private String nome;
    private String cpf;
    
    public void setNome(String n){
        this.nome = n;
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
