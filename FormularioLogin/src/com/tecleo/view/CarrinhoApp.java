package com.tecleo.view;

import com.tecleo.model.Produto;

import javafx.application.Application;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class CarrinhoApp extends Application{
	
	private AnchorPane pane;
	private TableView<ItensProperty> tbCarrinho;
	private TableColumn<ItensProperty, String> columnProduto;
	private TableColumn<ItensProperty, Double> columnPreco;
	private Button btExcluirItem, btVoltarVitrine, btConfirmarCompra;
	private static ObservableList<ItensProperty> listItens;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stageCarrinho) throws Exception {
		
		initComponents();
		Scene scene = new Scene(pane);
		stageCarrinho.setScene(scene);
		stageCarrinho.show();
		
	}
	
	private void initComponents() {
		pane = new AnchorPane();
		pane.setPrefSize(600, 800);
		
		pane.getChildren().addAll();
	}
	
	private void initLayout() {
		
	}
	
	private void initItens() {
		
		for(Produto p : VitrineApp.getCarrinho().getProdutos())
			listItens.add(new ItensProperty(p.getProduto(), p.getPreco()));
	}
	
	private void initListeners() {
		
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
			System.out.println("ItensProperty de preco");
			return preco.get();
		}

		public void setPreco(double preco) {
			this.preco.set(preco);
		}

	}

}
