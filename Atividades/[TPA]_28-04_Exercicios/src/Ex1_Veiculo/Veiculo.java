
package Ex1_Veiculo;

public class Veiculo {
    
    private String modelo;
    private String marca;
    private int data;
    private String cor;
    private double valor;
    private String resultado;
    
    public void setModelo(String m){
        this.modelo = m;
    }
    public String getModelo(){
        return modelo;
    }
    
    public void setMarca(String ma){
        this.marca = ma;
    }
    public String getMarca(){
        return marca;
    }
    
    public void setData(int d){
        this.data = d;
    }
    public int getData(){
        return data;
    }
    
    public void setCor(String c){
        this.cor = c;
    }
    public String getCor(){
        return cor;
    }
    
    public void setValor(double val){
        this.valor = val;
    }
    public double getValor(){
        return valor;
    }
    
    public String getResultado(){
        return resultado;
    }
    
    public Veiculo(String modelo, String marca, int data, String cor, double valor){
        this.modelo = modelo;
        this.marca = marca;
        this.data = data;
        this.cor = cor;
        this.valor = valor + 1.05;
        
        resultado = "Modelo: " + this.modelo + "\n" +
                "Marca: " + this.modelo + "\n" +
                "Data: " + this.data + "\n" +
                "Cor: " + this.cor + "\n" +
                "Valor: " + this.valor + "\n";
        
    }
    
    
}
