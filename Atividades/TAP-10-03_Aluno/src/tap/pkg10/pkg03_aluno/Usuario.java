/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tap.pkg10.pkg03_aluno;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Usuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno a = new Aluno();
        String nome,  ra;


        a.setNome(JOptionPane.showInputDialog("Digite o nome"));
        a.setRA(JOptionPane.showInputDialog("Digite o ra"));
        
        JOptionPane.showMessageDialog(null, a.getNome());
        JOptionPane.showMessageDialog(null, a.getRA());

    }
    
}
