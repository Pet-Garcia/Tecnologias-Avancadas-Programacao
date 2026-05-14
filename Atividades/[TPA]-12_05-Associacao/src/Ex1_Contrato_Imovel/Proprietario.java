
package Ex1_Contrato_Imovel;

public class Proprietario extends Pessoa{
    private String conjuge;
    
    public Proprietario(String nome, String cpf, String conjuge){
        super(nome, cpf);
        this.conjuge = conjuge;
    }
    
    public void setConjuge(String c){
        this.conjuge = c;
    }
    public String getConjuge(){
        return this.conjuge;
    }
}
