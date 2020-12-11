package com.tecleo.view;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginApp extends Application{

	public static void main(String [] args) {
		
		launch(args);
		
	}
	
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		AnchorPane pane = new AnchorPane();
		pane.setPrefSize(400, 300);
		
		Scene scene = new Scene(pane);
		
		primaryStage.setScene(scene);
		
		primaryStage.show();
		
		//Criando componentes
		Label lblLogin = new Label();
		lblLogin.setText("Login: ");
		lblLogin.setLayoutX((320 - lblLogin.getWidth())/2);
		lblLogin.setLayoutY(55);
		
		TextField txtLogin = new TextField();
		txtLogin.setPromptText("Digite aqui seu login");
		txtLogin.setLayoutX((pane.getWidth() - txtLogin.getWidth())/2);
		txtLogin.setLayoutY(50);
		
		Label lblSenha = new Label();
		lblSenha.setText("Senha: ");
		lblSenha.setLayoutX((320 - lblSenha.getWidth())/2);
		lblSenha.setLayoutY(85);
		
		PasswordField txtSenha = new PasswordField();
		txtSenha.setPromptText("Digite aqui sua senha");
		txtSenha.setLayoutX((pane.getWidth() - txtLogin.getWidth())/2);
		txtSenha.setLayoutY(80);
		
		Button btEntrar = new Button("Entrar");
		btEntrar.setLayoutX((pane.getWidth() - btEntrar.getWidth())/2);
		btEntrar.setLayoutY(150);
		
		Button btSair = new Button("Sair");
		btSair.setLayoutX(btEntrar.getLayoutX() + 65);
		btSair.setLayoutY(150);
		
		//Style
		pane.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, blue 0%, silver 100%);");
		
		
		pane.getChildren().addAll(lblLogin, txtLogin, lblSenha, txtSenha, btEntrar, btSair);
	}

}
