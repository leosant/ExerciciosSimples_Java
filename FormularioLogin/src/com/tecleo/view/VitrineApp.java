package com.tecleo.view;

import com.tecleo.controller.Carrinho;
import com.tecleo.controller.Vitrine;
import com.tecleo.model.Produto;

import javafx.application.Application;
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
	
	private AnchorPane pane;
	private TextField txPesquisa;
	private TableView<ItensProperty> tbVitrine;
	private TableColumn<ItensProperty, String> columnProduto;
	private TableColumn<ItensProperty, Double> columnPreco;
	private static ObservableList<ItensProperty> listItens = FXCollections
	.observableArrayList();
	private static Carrinho carrinho;

	public static void main(String[] args) {
		
		

	}

	@Override
	public void start(Stage stageVitrine) throws Exception {
		
		initComponents();
		initLayout();
		initItens();
		initListeners();
		
		Scene scene = new Scene(pane);
		
		stageVitrine.setScene(scene);
		stageVitrine.setResizable(true);
		stageVitrine.setTitle("Vitrine - GOLFX");
		stageVitrine.show();
	}
	
	
	private void initComponents() {
		
		pane = new AnchorPane();
		pane.setPrefSize(800, 600);
		
		txPesquisa = new TextField();
		txPesquisa.setPromptText("Digite o item para pesquisa");
		
		tbVitrine = new TableView<ItensProperty>();
		tbVitrine.setPrefSize(700, 550);
		
		columnProduto = new TableColumn<ItensProperty, String>();
		columnPreco = new TableColumn<ItensProperty, Double>();
		tbVitrine.getColumns().addAll(columnProduto, columnPreco);
		
		columnProduto.setCellValueFactory(
				new PropertyValueFactory<ItensProperty, String>("Produto"));
		columnPreco.setCellValueFactory(
				new PropertyValueFactory<ItensProperty, Double>("Preço"));
		
		pane.getChildren().addAll(txPesquisa, tbVitrine);
		
		carrinho = new Carrinho();
	}
	
	private void initLayout() { 
		txPesquisa.setLayoutX(550);
	}
	
	private void initItens() {
		
		Vitrine v = new Vitrine();
		v.addProdutors(new Produto("Bola Topper", 15.00), new Produto("Luvas Umbro", 9.00),
				new Produto("Camisa Esportiva", 40.00), new Produto("Chuteira Nike Mercurial", 199.00),
				new  Produto("Caneleira Topper", 10.00));
		
		for(Produto p : v.getProdutos()) {
			listItens.add(new ItensProperty(p.getProduto(), p.getPreco()));
		}
		
		tbVitrine.setItems(listItens);
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
