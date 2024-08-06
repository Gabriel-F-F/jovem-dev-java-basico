package enumStringBuilderBigDecimalObjects;

public class StringBuilderExemplo {

	public static void main(String[] args) {
		
		new StringBuilderExemplo();
	}
	
	public StringBuilderExemplo() {
		String nome = "João";
		StringBuilder sb = new StringBuilder();
		sb.append("O nome do usuário é ");
		sb.append(nome);
		sb.append(" e ele tem ");
		sb.append(18);
		sb.append(" anos");
		
		System.out.println(sb.toString());
		System.out.println(String.format("Nome: %s", nome));
		System.out.println(String.format("Usuário: %1$s %nBem-vindo, %1$s", nome));
	}
}