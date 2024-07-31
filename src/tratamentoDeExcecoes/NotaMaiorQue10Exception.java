package tratamentoDeExcecoes;

public class NotaMaiorQue10Exception extends Exception {

//Você pode criar sua própria exceção!
//
// A classe pai definirá se ela será verificada ou não!
	
	public NotaMaiorQue10Exception() {
		super("A nota não pode ser maior que 10!");
	}
	public NotaMaiorQue10Exception (String mensagem) {
		super(mensagem); // chama o construtor de IllegalArgumentException
						 // no caso, chama de uma classe Exception acima
	}
}