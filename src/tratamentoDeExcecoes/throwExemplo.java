package tratamentoDeExcecoes;

import javax.swing.JOptionPane;

public class throwExemplo {
 
	public static void main(String[] args) {
		
		new throwExemplo();
	}
	
	//	Você pode disparar uma exceção!
	//	Para isso, basta utilizar o throw
	
	public throwExemplo() {
		
		try {
		double d = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota"));
		
		if (d < 0) {
			throw new IllegalArgumentException("Nota menor que 0"); //Define a descrição do Erro dentro do Exception IllegalArgument
		}
		
		if (d > 10) {
			throw new NotaMaiorQue10Exception("Nota maior que 10"); 	// -> Exception criada, herdando de IllegalArgumentException
																		// -> Agora herda Exception
		}
		
		System.out.println(d);
		
		} catch (IllegalArgumentException | NullPointerException e) { //(NumberFormatException | NullPointerException | IllegalArgumentException)
			System.out.println("Digite um valor válido!");			  // detalhe: NumberFormatException herda de IllegalArgumentException
			e.printStackTrace();
		} catch (NotaMaiorQue10Exception e) {
			System.err.println("Nota maior que 10");
			e.printStackTrace();
		}
		System.out.println("Continuando o Programa");
	}
}