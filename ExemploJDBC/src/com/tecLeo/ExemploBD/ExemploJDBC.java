package com.tecLeo.ExemploBD;

import java.sql.BatchUpdateException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExemploJDBC {
	
	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
		String user = "root";
		String senha = "";
		
		Connection conexao = null;
		
		try {			
			
			conexao = DriverManager.getConnection(url, user, senha);
			
			System.out.println("Banco de dados: Conectado\n");
			
			conexao.setAutoCommit(false);
			
			PreparedStatement stmt = conexao.prepareStatement("insert into clientes (nome) values (?)"); 
					Statement stmt2 = conexao.createStatement();
					
//			stmt.addBatch("insert into clientes values(null 'cliente 1')");
//			
//			stmt.executeBatch();
					
			stmt.setString(1, "Clientete");
			stmt.executeUpdate();
			
			conexao.commit();
			
			
			ResultSet resultado = stmt.executeQuery("select * from clientes");
			
			/*Outra forma de manter o statement aberto (Não funcionou)
			stmt.getMoreResults(Statement.KEEP_CURRENT_RESULT);*/
			
			ResultSet resultado2 = stmt2.executeQuery("select * from produtos");
			
			while(resultado.next()) { //o método next() retorna true caso haja mais linhas
				
				System.out.println("Matricula do cliente: "+resultado.getInt("id"));
				System.out.println("Nome do cliente: "+resultado.getString("nome"));
			}

//			Outra forma de inserir dados no bd
//			resultado.moveToInsertRow();
//			resultado.updateString(2, "Leonardo");
//			resultado.insertRow();
			
//			Linha que altera texto na coluna
//			resultado.first();
//			resultado.updateString("nome", "TextoAlt");
//			usados para cancela-las
//			resultado.cancelRowUpdates();
//			resultado.updateRow();
					
			while(resultado2.next()) {
				
				System.out.println("\nOutra Table");
				System.out.println("Produto do cliente: "+resultado2.getString("n_produto"));
			}
			
//			int linhas = stmt.executeUpdate("insert into clientes(nome) values ('Teste02')");
//			
//			System.out.println(linhas+" linhas afetadas");

			resultado.close();
			resultado2.close();
			stmt.close();
			conexao.close();
			
		}catch(BatchUpdateException e) {
			conexao.rollback();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
