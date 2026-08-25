/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formulario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Formulario {
    private String nome;
    private String telefone;
    private String email;
    private String novidades;
    private String mensagem;
        
        
    public void Inserir(String n, String t, String e, String nt, String m) throws SQLException{
        
        try{
            Connection con = new Conexao().ConexaoBD();
            if (con != null){
                PreparedStatement ps;
                String sql = "insert into forms (nome, telefone, email, novidades, mensagem) values (?, ?, ?, ?, ?)";
                ps = con.prepareStatement(sql);
                ps.setString(1, n);
                ps.setString(2, t);
                ps.setString(3, e);
                ps.setString(4, nt);
                ps.setString(5, m);
                int resultados = ps.executeUpdate();
                
                if(resultados > 0){
                    JOptionPane.showMessageDialog(null, "Inserido com sucesso");
                }else{
                    JOptionPane.showMessageDialog(null, "Erro ao tentar inserir");
                }
                ps.close();
                con.close();
            } 
        }catch(SQLException erro){
                System.out.println("Exceção causada na inserção");
        }
    }
}
