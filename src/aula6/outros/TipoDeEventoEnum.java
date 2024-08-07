package aula6.outros;

public enum TipoDeEventoEnum {

	SOCIAL(1),
	LAZER(2),
	PROFISSIONAL(3),
	OUTROS(4);
	
	private int codigo;
	
	private TipoDeEventoEnum(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}
}