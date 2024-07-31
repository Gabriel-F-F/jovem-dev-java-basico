package aula3.tratamentoerros;

import javax.swing.JOptionPane;

public class Desafio {

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
		
		Venda v = new Venda();
		v.nomeCliente = JOptionPane.showInputDialog("Nome do Cliente");
		
	}
}