package com.tecleo.view;



import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginApp extends Application{

	
	private AnchorPane pane;
	private Label lblLogin, lblSenha;
	private TextField txtLogin;
	private PasswordField txtSenha;
	private Button btEntrar, btSair;
	private static Stage stage;

	public static void main(String [] args) {

		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		initComponents();
		initLayout();
		initListeners();
		
		Scene scene = new Scene(pane);
		
		primaryStage.setScene(scene);		
		primaryStage.setResizable(false);
		primaryStage.setTitle("Login - GOLFX");
		primaryStage.show();
	
		LoginApp.stage = primaryStage;
		
	}






	private void initComponents() {

		pane = new AnchorPane();
		pane.setPrefSize(400, 300);
		pane.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%,"
				+ " blue 0%, silver 100%);");


		lblLogin = new Label();
		lblLogin.setText("Login: ");

		txtLogin = new TextField();
		txtLogin.setPromptText("Digite aqui seu login");

		lblSenha = new Label();
		lblSenha.setText("Senha: ");
		
		txtSenha = new PasswordField();
		txtSenha.setPromptText("Digite aqui sua senha");

		btEntrar = new Button("Entrar");

		btSair = new Button("Sair");
	}

	private void initLayout() {

		lblLogin.setLayoutX(110);
		lblLogin.setLayoutY(55);

		txtLogin.setLayoutX(150);
		txtLogin.setLayoutY(50);

		lblSenha.setLayoutX(110);
		lblSenha.setLayoutY(85);
		
		txtSenha.setLayoutX(150);
		txtSenha.setLayoutY(80);

		btEntrar.setLayoutX(150);
		btEntrar.setLayoutY(150);

		btSair.setLayoutX(btEntrar.getLayoutX() + 65);
		btSair.setLayoutY(150);
		
		pane.getChildren().addAll(lblLogin, txtLogin, lblSenha, txtSenha, btEntrar, btSair);
	}

	private void initListeners() {
		btSair.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				fecharAplicacao();
			}
		});

		btEntrar.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				logar();
			}
		});
	}

	//Metodos particulares
	public Stage getStage() {
		return stage;
	}

	private void fecharAplicacao() {
		System.exit(0);
	}

	private void logar() {
		if(txtLogin.getText().equals("admin") && txtSenha.getText().equals("admin")) {
			//TODO Abrir a tela VitrineApp
		}else {
			JOptionPane.showMessageDialog(null, "Login e/ou senha inválidos", "Erro", JOptionPane.ERROR_MESSAGE);
		}
	}
}
