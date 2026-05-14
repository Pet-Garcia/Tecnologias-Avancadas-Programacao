
package Ex1_Contrato_Imovel;

public class Imovel {
    private Endereco endereco;
    private double valor;
    
    public Imovel(Endereco endereco, double valor){
        this.endereco = endereco;
        this.valor = valor;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
