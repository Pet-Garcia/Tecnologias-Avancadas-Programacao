/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formulario;

import java.sql.Connection; // *
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
 
public class Conexao {
    String bd = "formmensagens";
    String usuario = "root";
    String senha = "";
    
    public Connection ConexaoBD() throws SQLException{ 
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost/" + bd,
                    usuario, senha);
        }catch(SQLException | ClassNotFoundException erro){
            JOptionPane.showMessageDialog(null, "Erro: " + erro);
            return null;
        }
    }
}