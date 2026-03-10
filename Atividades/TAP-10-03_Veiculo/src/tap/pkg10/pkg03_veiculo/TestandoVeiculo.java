
package tap.pkg10.pkg03_veiculo;

import javax.swing.JOptionPane;

public class TestandoVeiculo {

    public static void main(String[] args) {
        Veiculo v = new Veiculo();
        v.setMarca ("Ford");
        JOptionPane.showMessageDialog(null, v.getMarca());
    }
    
}
