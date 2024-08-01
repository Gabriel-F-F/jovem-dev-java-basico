package aula3.tratamentoerros;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Venda extends Item {

	String nomeCliente;
	List<Item> itens = new ArrayList<>(); // nome e preço
	
	public String toString() {
		return "Nome do Produto: " + nome + ", Preço: " + preco;
		
	}
	
	public double arrumaPreco(double valor) {
		boolean confirmaPreco = false;
		do {
			double precoCorreto = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor correto para o Produto!"));
			if (precoCorreto > 0) {
				return precoCorreto;
			}
		} while (confirmaPreco != true);
		return -1;
	}
}