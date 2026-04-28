
package Ex1_Veiculo;

import javax.swing.JOptionPane;

public class Exibicao {
    private String m;
    private String ma;
    private int d;
    private String c;
    private double val;
    
    String dat;
    String valo;
    
    Veiculo v = new Veiculo(m, ma, d, c, val);
    
    public Exibicao(){
        m = JOptionPane.showInputDialog("Insira o modelo:");
        ma = JOptionPane.showInputDialog("Insira a marca:");
        dat = JOptionPane.showInputDialog("Insira a data:");
        d = Integer.parseInt(dat);
        c = JOptionPane.showInputDialog("Insira a cor:");
        valo = JOptionPane.showInputDialog("Insira o valor:");
        val = Double.parseDouble(valo);
        
    }
    
    public static void main(){
        
        JOptionPane.showMessageDialog(null, resultado);
        
    }
}
