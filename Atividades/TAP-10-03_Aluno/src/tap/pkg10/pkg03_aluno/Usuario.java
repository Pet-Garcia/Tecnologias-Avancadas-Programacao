package tap.pkg10.pkg03_aluno;

import javax.swing.JOptionPane;

public class Usuario {


    public static void main(String[] args) {
        Aluno a = new Aluno();

        //Inserindo os dados
        a.setNome(JOptionPane.showInputDialog("Digite o nome"));
        a.setRA(JOptionPane.showInputDialog("Digite o ra"));
        
        //Exibindo os dados
        JOptionPane.showMessageDialog(null, a.getNome());
        JOptionPane.showMessageDialog(null, a.getRA());

    }
    
}
