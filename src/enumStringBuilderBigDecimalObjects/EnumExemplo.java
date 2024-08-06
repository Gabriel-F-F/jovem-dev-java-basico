package enumStringBuilderBigDecimalObjects;

public class EnumExemplo {

	public static void main(String[] args) {
		
		System.out.println(FormaPagamento.CARTAO_DE_CREDITO);
		System.out.println(FormaPagamento.CARTAO_DE_CREDITO.getCodigo());
		System.out.println(FormaPagamento.CARTAO_DE_CREDITO.getDescricao());
		
		System.out.println();
		System.out.println(FormaPagamento.CARTAO_DE_DEBITO);
		System.out.println(FormaPagamento.CARTAO_DE_DEBITO.getCodigo());
		System.out.println(FormaPagamento.CARTAO_DE_DEBITO.getDescricao());
		
		System.out.println();
		System.out.println(FormaPagamento.DINHEIRO);
		System.out.println(FormaPagamento.DINHEIRO.getCodigo());
		System.out.println(FormaPagamento.DINHEIRO.getDescricao());
		
		new EnumExemplo();
	}
	
	public EnumExemplo() {
		
// 		Percorrer os Enums
		
//		System.out.println();
//		for(FormaPagamento f : FormaPagamento.values()) {
//			System.out.println(f.getCodigo() + " - " + f.getDescricao());
//		}
//		
//		System.out.println(FormaPagamento.valueOf("CARTAO_DE_CREDITO").getCodigo());
		
//		Comparando Enums
		
		FormaPagamento p = FormaPagamento.PIX;
		
		double valorOriginal = 100.00;
		double valorDesconto = p.getDesconto().apply(valorOriginal);
		System.out.println(valorDesconto);
		
		switch (p) {
		case CARTAO_DE_CREDITO:
			System.out.println(p.getCodigo());
			break;

		case CARTAO_DE_DEBITO:
			System.out.println(p.getCodigo());
			break;
		
		default:
			System.out.println(p.getCodigo());
			break;
		}
		
		System.out.println();
		FormaPagamento d = FormaPagamento.DINHEIRO;
		if(d == FormaPagamento.DINHEIRO) {
			System.out.println("Aplicar desconto");
	
		}
	}
}