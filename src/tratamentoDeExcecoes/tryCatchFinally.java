package tratamentoDeExcecoes;

import javax.swing.JOptionPane;

public class tryCatchFinally {

//	O try permite executar um bloco de
//	Código que pode dar errado

//	O catch permite capturar o que deu
//	errado e fazer o tratamento adequado
//	● Catch
//	● Encadeamento de catch
//	● Multicatch
	
//	O finally permite executar um
//	bloco de código incondicionalmente,
//	ocorrendo uma exceção ou não
//
//	● Exibir uma mensagem de processo finalizado
//	● Fechar/liberar um recurso
//	● Necessita que a variável esteja no mesmo escopo, o que
//	pode gerar más práticas

	public static void main(String[] args) {

		new tryCatchFinally();
	}

	public tryCatchFinally() {

		try {
			double d = Double.parseDouble(JOptionPane.showInputDialog("Digite um número")); // caso digite "abc"
			System.out.println(d);

			// ENCADEAMENTO DE CATCH

//		} catch (NumberFormatException e) {						-> sempre fazer o Catch do mais específico para o mais genérico;
//			System.err.println("O valor digitado é inválido!");
//		} catch (NullPointerException e) {
//			System.err.println("Valor nulo");
//			e.printStackTrace();

			// PIPELINE

//		} catch (NumberFormatException | NullPointerException e) {
//			System.err.println("O valor digitado é inválido!");
//			e.printStackTrace();
//		}

			// MULTICATCH
			
		} catch (RuntimeException e) {							
			System.err.println("O valor digitado é inválido!"); //NumberFormatException e NullPointerException herdam de RuntimeException;
		}
		
		catch (Exception e) {
			System.err.println("O valor digitado é inválido!"); //Posteriormente, RuntimeException herdam de Exception (garantia de que caia pelo menos aqui).
			e.printStackTrace();
			
			
		} finally {  //Serve para encerrar ações após cairem nos tratamentos de exceções, como close();
			System.out.println("Bloco Finally");
		}
		
		System.out.println("Terminando o Programa");
	}
}
