
package Ex1_Contrato_Imovel;

public class Inquilino extends Pessoa {
    private double renda;
    private String profissao;
    
    public Inquilino(String nome, String cpf, double renda, String profissao){
        super(nome, cpf);
        this.renda = renda;
        this.profissao = profissao;
    }
    
    public void setRenda(double r){
        this.renda = r;
    }
    public double getRenda(){
        return this.renda;
    }
    
    public void setProfissao(String p){
        this.profissao = p;
    }
    public String getProfissao(){
        return this.profissao;
    }
}
