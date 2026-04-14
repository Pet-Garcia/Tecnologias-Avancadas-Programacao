
package Loja_ex8;

public class Vendedor extends Empregado{
    private double valorvendas;
    private int qtdvendas;
    
    public void setValorvendas(double vv){
        this.valorvendas = vv;
    }
    public double getValorvendas(){
        return valorvendas;
    }
    
    public void setQtdvendas(int q){
        this.qtdvendas = q;
    }
    public int getQtdvendas(){
        return qtdvendas;
    }
}
