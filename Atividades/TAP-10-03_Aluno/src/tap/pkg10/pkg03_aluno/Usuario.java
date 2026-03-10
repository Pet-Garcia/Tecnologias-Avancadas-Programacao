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


        nome = JOptionPane.showInputDialog("Digite o nome");
        ra = JOptionPane.showInputDialog("Digite o ra");
        
        a.cadastrar(nome, ra);
    }
    
}
