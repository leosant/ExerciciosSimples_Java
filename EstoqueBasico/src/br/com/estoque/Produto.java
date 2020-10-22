package br.com.estoque;

public class Produto {
	
	private String pNome;
	private Double precoProduto;
	private int quantidadeProduto;
	
	public Produto() {
		
	}
	
	public Produto(String Nome, Double preco, int quantidade) {
		this.setpNome(Nome);
		this.setPrecoProduto(preco);
		this.setQuantidadeProduto(quantidade);
	}
	
	public Double totalEstoque() {
		return getPrecoProduto() * getQuantidadeProduto();
	}
	
	public String getpNome() {
		return pNome;
	}

	public void setpNome(String pNome) {
		this.pNome = pNome;
	}

	public Double getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(Double precoProduto) {
		this.precoProduto = precoProduto;
	}

	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}

	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}
	
}
