/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.Connection; // *
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
 
public class Conexao {
    public static void main(String[] args) {
 
        
        Connection con = null; // Conexão Java - BD
        String bd = "etec";
        String usuario = "root";
        String senha = "";
        PreparedStatement ps; // estruturar o SQL
        String sql;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/" + bd,
                    usuario, senha);
            sql = "insert into alunos (nome,curso) values (?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, "Laurona");
            ps.setString(2, "ADS");
            if(ps.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Inserido com sucesso");
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao tentar inserir");
            }
            con.close();
        }catch(SQLException | ClassNotFoundException erro){
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
        }
    }
}
