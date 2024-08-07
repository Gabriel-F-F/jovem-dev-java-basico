package aula6.outros;

public enum TipoDeEventoEnum {

	SOCIAL("SOCIAL", 1), LAZER("LAZER", 2), PROFISSIONAL("PROFISSIONAL", 3), OUTROS("OUTROS", 4);

	private String nome;
	private int codigo;
	
	private TipoDeEventoEnum(String nome, int codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public static TipoDeEventoEnum tipoEvento(int tipoEvento) {
		switch (tipoEvento) {
		case 1:
			return SOCIAL;
		case 2:
			return LAZER;
		case 3:
			return PROFISSIONAL;
		default:
			return OUTROS;
		}
	}
}