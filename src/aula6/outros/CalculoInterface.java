package aula6.outros;

interface CalculoInterface {

	public abstract class CalculoInterfaceFuncional  {
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
}