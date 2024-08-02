package avaliacao.semana1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import avaliacao.semana1.classes.Cliente;
import avaliacao.semana1.classes.ClientePremium;
import avaliacao.semana1.classes.ItemVenda;
import avaliacao.semana1.classes.Produto;
import avaliacao.semana1.classes.Venda;
import avaliacao.semana1.exceptions.ClienteZeroException;
import avaliacao.semana1.exceptions.ProdutoZeroException;
import avaliacao.semana1.exceptions.QuantidadeDiferenteException;

public class Principal {

	public static void main(String[] args) {

		List<Cliente> clienteList = new ArrayList<>();
		List<Produto> produtoList = new ArrayList<>();

		Cliente c = new Cliente();
		try {
			c.nomeCliente = JOptionPane.showInputDialog("Nome do Cliente:");
			if (c.nomeCliente.equals(null)) {
				throw new ClienteZeroException();
			}
			if (c.nomeCliente.toUpperCase().equals("Thiago")) {

				ClientePremium cp = new ClientePremium();
				cp.descontoPremium = 20;
			}

			c.dataNascimento = LocalDate.parse(JOptionPane.showInputDialog("Data de Nascimento (dd/mm/aaaa)"),
					DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			clienteList.add(c);
		} catch (ClienteZeroException e) {
			e.printStackTrace();
		}

		Produto p = new Produto();

		do {
			try {
				p.nomeProduto = JOptionPane.showInputDialog("Nome do Produto:");
				if (p.nomeProduto.equals(null)) {
					throw new ProdutoZeroException();
				}
				if (p.nomeProduto.toUpperCase().equals("FIM")) {
					break;
				} else {
					if (p.nomeProduto.toUpperCase() != "FIM") {
						p.preco = Double.parseDouble(JOptionPane.showInputDialog("Valor da Unidade:"));

						p.quantidadeProduto = Integer.parseInt(JOptionPane.showInputDialog("Valor da Unidade:"));
						if (p.quantidadeProduto < 0 || p.quantidadeProduto > 50) {
							JOptionPane.showMessageDialog(null, "A quantidade deve ser Maior que 0 e Menor que 50");
							throw new QuantidadeDiferenteException("A quantidade deve ser Maior que 0 e Menor que 50");
						}

					}
				}
			} catch (ProdutoZeroException | QuantidadeDiferenteException e) {
				e.printStackTrace();
			}

			produtoList.add(p);

		} while (p.nomeProduto != "FIM");

		System.out.println(clienteList);
		System.out.println(produtoList);

		ItemVenda mtdPag = new ItemVenda();
		mtdPag.metodoPagamento();

		System.out.println("*********** CUPOM: ***********");
		String nomeApos = c.nomeCliente.substring(1);
		String nomeLGPD = nomeApos.replace(c.nomeCliente, "*");
		System.out.println(c.nomeCliente.substring(0) + nomeLGPD);
		produtoList.forEach(s -> {
			System.out.println(s.nomeProduto + ", R$" + s.preco + "\n");
		});

		
		//Faltou a maioria por conta que comecei a fazer as variáveis das Classes em private, porém não consegui criar listas e uní-las no final.
		//gostaria de ter feito private, pra já ir adequando o código pra realidade, porem n tenho muita prática com esse método =/
	}
}