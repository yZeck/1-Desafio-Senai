package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import DTO.FrutasDTO;

public class FrutasDAO {
	 Connection conn;
     
     PreparedStatement pstm;
     
     
 public void cadastrarFuncionario(FrutasDTO objfrutasDTO){
  
     String sql = "insert into frutas (nome,descricao,preco,quantidade) values(?,?,?,?)";
     
     conn = new ConnectionDAO().conectaBd();
     
     try {
         pstm = conn.prepareStatement(sql);
         pstm.setString(1, objfrutasDTO.getNome());
         pstm.setString(2, objfrutasDTO.getDescricao());
         pstm.setString(3, objfrutasDTO.getPreco());
         pstm.setString(4, objfrutasDTO.getQuantidade());
         
         pstm.execute();
         pstm.close();
         
         JOptionPane.showMessageDialog(null, "A Fruta Foi Cadastrada!");
     } catch (Exception erro) {
         JOptionPane.showMessageDialog(null, "Classe FrutasDAO" + erro);
     }
     
 }
 
 
 
 
 public void DeleteFrutas(String id){
	  
	 
     String sql = "delete from frutas where idFrutas =" + id + ";";
     
     conn = new ConnectionDAO().conectaBd();
     
     try {
         pstm = conn.prepareStatement(sql);
         pstm.execute();
         pstm.close();
         JOptionPane.showMessageDialog(null, "A fruta foi deletada!");
     } catch (Exception erro) {
         JOptionPane.showMessageDialog(null, "Classe FrutasDAO" + erro);
     }
     
 }
}
