package aula3.tratamentoerros;

import javax.swing.JOptionPane;

import aula3.tratamentoerros.exceptions.PrecoIncorretoException;
import aula3.tratamentoerros.exceptions.VendaException;

public class Desafio extends Venda {

//	Crie duas exceções: VendaException (exceção verificada) e PrecoIncorretoException (exceção não verificada). 
//	Crie uma classe Venda com atributos nomeCliente e itens (será uma lista de Item, uma classe com nome e preco).
//	Na classe Desafio, crie uma venda e peça para o usuário digitar o nome do cliente e a quantidade de itens. 
//	Se ele digitar um númeroenor que 1 ou maior que 10, dispare VendaException e encerre o programa mostrando uma mensagem. 
//	Ele deve digitar a quantidade deitens que escolheu (nome e preço). 
//	Se digitar preço menor ou igual a zero, dispare PrecoIncorretoException e peça para digitar novamente.

	public static void main(String[] args) {

		new Desafio();
	}

	public Desafio() {

		try {

			int quantidadeItens = 1;

			Venda v = new Venda();
			v.nomeCliente = JOptionPane.showInputDialog("Nome do Cliente:");
			quantidadeItens = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Itens:"));

			if (quantidadeItens < 1 || quantidadeItens > 10) {
				throw new VendaException("A quantidade de Itens deve ser entre 1 e 10!");
			}

			for (int i = 0; i < quantidadeItens; i++) {
				v.nome = JOptionPane.showInputDialog("Nome do Produto:");
				v.preco = Double.parseDouble(JOptionPane.showInputDialog("Nome do Produto:"));
				v.itens.add(v);
				
				if (v.preco <= 0) {
					throw new PrecoIncorretoException();
				}
			}

		} catch (VendaException e) {
			JOptionPane.showMessageDialog(null, "A quantidade de Itens deve ser entre 1 e 10!");
			e.printStackTrace();
		}
	}
}
