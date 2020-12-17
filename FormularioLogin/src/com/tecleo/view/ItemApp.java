package com.tecleo.view;

import com.tecleo.model.Produto;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ItemApp extends Application{
	
	private AnchorPane pane;
	private ImageView imgItem;
	private Label lbPreco, lbDescricao;
	private Button btAddCarrinho;
	private static Stage stage;
	private static Produto produto;
	private static int index;
	private static String[] images = {"https://static.netshoes.com.br/produtos/bola-de-futebol-campo-topper-slick-ii-19-exclusiva/58/D30-1942-058/D30-1942-058_zoom1.jpg?ts=1569327838",
			  "https://static.netshoes.com.br/produtos/luva-umbro-pro-training/06/D21-5374-006/D21-5374-006_zoom1.jpg?ts=1587418546",
			  "https://static.netshoes.com.br/produtos/camiseta-nike-dri-fit-breathe-run-masculina/06/HZM-2977-006/HZM-2977-006_zoom1.jpg?ts=1586336888",
			  "https://static.netshoes.com.br/produtos/chuteira-futsal-nike-beco-2/58/HZM-0953-058/HZM-0953-058_zoom1.jpg?ts=1581955376",
			  "https://static.netshoes.com.br/produtos/caneleira-futebol-adidas-everclub/26/COL-3396-026/COL-3396-026_zoom1.jpg?ts=1565966642"};
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stageItem) throws Exception {
		initComponets();
		Scene scene = new Scene(pane);
		stageItem.setScene(scene);
		stageItem.show();
		initLayout();
		ItemApp.stage = stageItem;
	}
	
	private void initComponets() {
		
		pane = new AnchorPane();
		pane.setPrefSize(600, 400);
		pane.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%," 
				+ " blue 0%, silver 100%)");
		
		imgItem = new ImageView(new Image(images[index], 213, 213, false, false));
		
		pane.getChildren().addAll(imgItem);
	}
	
	private void initLayout() { 
		imgItem.setLayoutX(10);
		imgItem.setLayoutY(10);
	}
	
	public static Produto getProduto() {
		return produto;
	}

	public static void setProduto(Produto produto) {
		ItemApp.produto = produto;
	}

	public static Stage getStage() {
		return stage;
	}

	public static int getIndex() {
		return index;
	}

	public static void setIndex(int index) {
		ItemApp.index = index;
	}
}
