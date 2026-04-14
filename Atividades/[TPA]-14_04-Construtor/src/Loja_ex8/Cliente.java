
package Loja_ex8;

import javax.swing.JOptionPane;

public class Cliente extends Pessoa{
    private double valordivida;
    private int dtnascimento;
    
    public Cliente(){
        
        JOptionPane.showMessageDialog(null, "Passou neste outro construtor");
    }

    public void setValordivida(double v){
        this.valordivida = v;
    }
    public double getValordivida(){
        return valordivida;
    }
    
    public void setDtnascimento(int d){
        this.dtnascimento = d;
    }
    public int getDtnascimento(){
        return dtnascimento;
        
    }
}
