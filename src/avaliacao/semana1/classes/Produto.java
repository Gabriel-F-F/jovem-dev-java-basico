package avaliacao.semana1.classes;

public class Produto {

	public String nomeProduto;
	public double preco;
	public int quantidadeProduto;
	
	public Produto() {
	}
	
	public Produto(String nomeProduto, double preco, int quantidadeProduto) {
		this.nomeProduto = nomeProduto;
		this.preco = preco;
		this.quantidadeProduto = quantidadeProduto;
	}
	
	public String toString() {
		return " Nome do Produto:" + nomeProduto + ", R$" + preco;
	}
}