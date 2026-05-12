
package Ex1_Contrato_Imovel;

public class Proprietario extends Pessoa{
    private String conjuge;
    
    public void setConjuge(String c){
        this.conjuge = c;
    }
    public String getConjuge(){
        return this.conjuge;
    }
}
