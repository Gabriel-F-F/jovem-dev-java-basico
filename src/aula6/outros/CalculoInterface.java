package aula6.outros;

@FunctionalInterface
public interface CalculoInterface {

	int calcula();
}

public abstract class CalculoInterfaceFuncional {
	public int calcula(int x, int y, int escolha) {
		if (escolha == 1) {
			escolha = x + y;
		}
		if (escolha == 2) {
			escolha = x - y;
		}
		if (escolha == 3) {
			escolha = x * y;
		}
		if (escolha == 4) {
			escolha = x / y;
		}
		return escolha;
	}
}

//https://medium.com/@mvalho/java-8-functional-interfaces-tornando-o-java-mais-legal-72401462d0e2
