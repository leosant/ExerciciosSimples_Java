package com.tecleo.view;

import javax.swing.JOptionPane;

import com.tecleo.model.Produto;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class CarrinhoApp extends Application{
	
	private static Stage stage;
	private AnchorPane pane;
	private TableView<ItensProperty> tbCarrinho;
	private TableColumn<ItensProperty, String> columnProduto;
	private TableColumn<ItensProperty, Double> columnPreco;
	private Button btExcluirItem, btVoltarVitrine, btConfirmarCompra;
	private static ObservableList<ItensProperty> listItens = FXCollections
			.observableArrayList();;
	
	@Override
	public void start(Stage stageCarrinho) throws Exception {
		
		initComponents();
		initItens();
		initLayout();
		initListeners();
		Scene scene = new Scene(pane);
		stageCarrinho.setScene(scene);
		stageCarrinho.show();
		
		CarrinhoApp.stage = stageCarrinho;
		
	}
	
	private void initComponents() {
		pane = new AnchorPane();
		pane.setPrefSize(600, 600);
		pane.setStyle("-fx-background-color: linear-gradient(to right top, #5c5157, #6c5164, #795275, #825489, #8757a0, #8f66b1, "
				+ "#9676c1, #9e85d2, #b3a2dd, #c8bee7, #dfdbf0, #f8f8f8)");
		
		tbCarrinho = new TableView<ItensProperty>();
		tbCarrinho.setPrefSize(500, 500);
		tbCarrinho.setItems(listItens);
		
		columnProduto = new TableColumn<ItensProperty, String>("Produtos");
		columnPreco = new TableColumn<ItensProperty, Double>("Preços");
		
		columnProduto.setCellValueFactory(
				new PropertyValueFactory<ItensProperty, String>("produto"));
		columnPreco.setCellValueFactory(
				new PropertyValueFactory<ItensProperty, Double>("preco"));
		
		tbCarrinho.getColumns().addAll(columnProduto, columnPreco);
		
		btExcluirItem = new Button("Remover Item");
		btVoltarVitrine = new Button("Retornar");
		btConfirmarCompra = new Button("Confirmar compra");
		
		pane.getChildren().addAll(tbCarrinho, btExcluirItem, btVoltarVitrine, btConfirmarCompra);
	}
	
	private void initLayout() {
		tbCarrinho.setLayoutX(50);
		tbCarrinho.setLayoutY(5);
		
		btExcluirItem.setLayoutX(50);
		btExcluirItem.setLayoutY(510);
		
		btVoltarVitrine.setLayoutX(268);
		btVoltarVitrine.setLayoutY(510);
		
		btConfirmarCompra.setLayoutX(438);
		btConfirmarCompra.setLayoutY(510);
	}
	
	public class ItensProperty {
		private SimpleStringProperty produto;
		private SimpleDoubleProperty preco;

		public ItensProperty(String produto, double preco) {
			this.produto = new SimpleStringProperty(produto);
			this.preco = new SimpleDoubleProperty(preco);
		}

		public String getProduto() {
			return produto.get();
		}

		public void setProduto(String produto) {
			this.produto.set(produto);
		}

		public double getPreco() {
			return preco.get();
		}

		public void setPreco(double preco) {
			this.preco.set(preco);
		}

	}
	
	private void initItens() {
		
		for (Produto produto : VitrineApp.carrinho.getProdutos()) { 			
			listItens.add(new ItensProperty(produto.getProduto(), produto.getPreco()));
		}
			
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	private void initListeners() {
		btExcluirItem.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				VitrineApp.carrinho.removeProduto(new Produto(tbCarrinho
						.getSelectionModel().getSelectedItem().getProduto(),
						tbCarrinho.getSelectionModel().getSelectedItem().getPreco()));
				
				tbCarrinho.getItems().remove(tbCarrinho.getSelectionModel().getSelectedItem());
			}
		});
		
		btVoltarVitrine.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				CarrinhoApp.getStage().close();
				ItemApp.getStage().close();
			}
		});
		
		btConfirmarCompra.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Thread thread = new Thread() {
					public void run() {
						try {
							sleep(3000);
						} catch (Exception e) {
							e.printStackTrace();
						}
						JOptionPane.showMessageDialog(null, "Compra realizada com sucesso!");
						Platform.runLater(new Runnable() {

							@Override
							public void run() {
								CarrinhoApp.getStage().close();	
								ItemApp.getStage().close();
							}
						});
					};
				};
				
				thread.start();
			}
		});
		
		
	}

	public static Stage getStage() {
		return stage;
	}
	
	

}
