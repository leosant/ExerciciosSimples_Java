package com.tecleo.view;

import com.tecleo.controller.Carrinho;
import com.tecleo.controller.Vitrine;
import com.tecleo.model.Produto;

import javafx.application.Application;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class VitrineApp extends Application {
	private static Stage stage;
	private AnchorPane pane;
	private TextField txPesquisa;
	private TableView<ItensProperty> tbVitrine;
	private TableColumn<ItensProperty, String> columnProduto;
	private TableColumn<ItensProperty, Double> columnPreco;
	private static ObservableList<ItensProperty> listItens = FXCollections
			.observableArrayList();
	private static Carrinho carrinho;

	public static void memoriaConsumida() {

		final int MB = 1024 * 1024;

		Runtime runtime = Runtime.getRuntime();

		System.out.println((runtime.totalMemory() - runtime.freeMemory())/MB);

	}

	public static void main(String[] args) {

		launch(args);
	}

	@Override
	public void start(Stage stageVitrine) throws Exception {
		System.out.println("Inicio");
		memoriaConsumida();

		initComponents();
		initListeners();
		initItens();

		Scene scene = new Scene(pane);
		stageVitrine.setScene(scene);

		stageVitrine.show();
		initLayout();
		VitrineApp.stage = stageVitrine;

		Runtime.getRuntime().runFinalization();
		Runtime.getRuntime().gc();
		memoriaConsumida();
	}

	private void initComponents() {

		pane = new AnchorPane();
		pane.setPrefSize(800, 600);
		pane.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%,"
				+ " blue 0%, silver 100%);");

		txPesquisa = new TextField();
		txPesquisa.setPromptText("Digite o item para pesquisa");

		tbVitrine = new TableView<ItensProperty>();
		tbVitrine.setPrefSize(780, 550);
		tbVitrine.setItems(listItens);

		columnProduto = new TableColumn<ItensProperty, String>("Produto");
		columnPreco = new TableColumn<ItensProperty, Double>("Preço");

		tbVitrine.getColumns().addAll(columnProduto, columnPreco);

		pane.getChildren().addAll(txPesquisa, tbVitrine);

		columnProduto.setCellValueFactory(
				new PropertyValueFactory<ItensProperty, String>("produto"));
		columnPreco.setCellValueFactory(
				new PropertyValueFactory<ItensProperty, Double>("preco"));

		carrinho = new Carrinho();
	}

	private void initLayout() { 

		txPesquisa.setLayoutX(600);

		tbVitrine.setLayoutX(10);
		tbVitrine.setLayoutY(25);

	}

	private void initItens() {

		Vitrine v = new Vitrine();

		v.addProdutos(new Produto("Bola Topper", 15.00), new Produto("Luvas Umbro", 9.00),
				new Produto("Camisa Esportiva", 40.00), new Produto("Chuteira Nike Mercurial", 199.00),
				new  Produto("Caneleira Topper", 10.00));

		for(Produto p : v.getProdutos()) {
			listItens.add(new ItensProperty(p.getProduto(), p.getPreco()));
		}
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

	private ObservableList<ItensProperty> findItems() {

		ObservableList<ItensProperty> itensEncontrados = FXCollections.observableArrayList();

		for(ItensProperty itens : listItens) {
			if(itens.getProduto().contains(txPesquisa.getText())) {
				itensEncontrados.add(itens);
			}
		}
		return itensEncontrados;
	}

	private void initListeners() {

		txPesquisa.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if(!txPesquisa.getText().equals("")) {
					tbVitrine.setItems(findItems());
				} else {
					tbVitrine.setItems(listItens);
				}
			}
		});
	}
}