package avaliacao.semana1.classes;

import javax.swing.JOptionPane;

public class ItemVenda extends Produto {

	public String metodoPagamento() {

		int metodoPagamento = Integer.parseInt(JOptionPane.showInputDialog(
				"Método de Pagamento: \n(1) - Cartão de Crédito\n(2) - Cartão de Débito\n(3) - Dinheiro"));
		String retorno = null;
		switch (metodoPagamento) {
		case 1:
			retorno = "Cartão de Crédito";
			break;
		case 2:
			retorno = "Cartão de Débito";
			break;
		case 3:
			retorno = "Dinheiro";
			break;
		}
		return retorno;
	};
}