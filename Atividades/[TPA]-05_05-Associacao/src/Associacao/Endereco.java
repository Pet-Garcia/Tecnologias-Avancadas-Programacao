
package Associacao;

public class Endereco {
    private String logradouro;
    private String num;
    private String bairro;
    
    public void setLogradouro(String l){
        this.logradouro = l;
    }
    public String getLogradouro(){
        return this.logradouro;
    }
    
    public void setNum(String n){
        this.num = n;
    }
    public String getNum(){
        return this.num;
    }
    
    public void setBairro(String b){
        this.bairro = b;
    }
    public String getBairro(){
        return this.bairro;
    }
}
