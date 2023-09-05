/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.FuncionarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class FuncionarioDAO {
       Connection conn;
        
        PreparedStatement pstm;
        
        
    public void cadastrarFuncionario(FuncionarioDTO objfuncionarioDTO){
     
        String sql = "insert into tabela (nome,cidade) values(?,?)";
        
        conn = new ConexaoDAO().conectaBd();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objfuncionarioDTO.getNome_Funcionario());
            pstm.setString(2, objfuncionarioDTO.getCidade_Funcionario());
       
            pstm.execute();
            pstm.close();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Classe FuncionarioDAO" + erro);
        }
        
    }
}
