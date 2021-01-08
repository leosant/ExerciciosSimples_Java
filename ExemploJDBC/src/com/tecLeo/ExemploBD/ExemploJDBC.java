package com.tecLeo.ExemploBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import com.mysql.cj.jdbc.exceptions.CommunicationsException;

public class ExemploJDBC {
	public static void main(String[] args) {
		
		try {			
			String url = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
			String user = "root";
			String senha = "";
			
			Connection conexao = DriverManager.getConnection(url, user, senha);
			System.out.println("Banco de dados: Conectado\n");
			
			Statement stmt = conexao.createStatement(), stmt2 = conexao.createStatement();
			
			ResultSet resultado = stmt.executeQuery("select * from clientes");
			/*Outra forma de manter o statement aberto (Não funcionou)
			stmt.getMoreResults(Statement.KEEP_CURRENT_RESULT);*/
			
			ResultSet resultado2 = stmt2.executeQuery("select * from produtos");
			
			while(resultado.next() && resultado2.next()) { //o método next() retorna true caso haja mais linhas
				System.out.println("Matricula do cliente: "+resultado.getInt("id"));
				System.out.println("Nome do cliente: "+resultado.getString("nome"));
				System.out.println("Produto do cliente: "+resultado2.getString("n_produto"));
			}
			
			resultado.close();
			resultado2.close();
			stmt.close();
			conexao.close();
			
		}catch(CommunicationsException e) {
			JOptionPane.showMessageDialog(null, "Banco de dados: Desconectado");
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
}
