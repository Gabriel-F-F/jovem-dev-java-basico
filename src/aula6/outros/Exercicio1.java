package aula6.outros;

public class Exercicio1 {

	public static void main(String[] args) {
		
		DiaSemanaEnum d = DiaSemanaEnum.SEGUNDA_FEIRA;
		System.out.printf(d.getNome() + ": " + d.isFimDeSemana() + "%n");
		d = DiaSemanaEnum.TERCA_FEIRA;
		System.out.printf(d.getNome() + ": " + d.isFimDeSemana() + "%n");
		d = DiaSemanaEnum.QUARTA_FEIRA;
		System.out.printf(d.getNome() + ": " + d.isFimDeSemana() + "%n");
		d = DiaSemanaEnum.QUINTA_FEIRA;
		System.out.printf(d.getNome() + ": " + d.isFimDeSemana() + "%n");
		d = DiaSemanaEnum.SEXTA_FEIRA;
		System.out.printf(d.getNome() + ": " + d.isFimDeSemana() + "%n");
		d = DiaSemanaEnum.SABADO;
		System.out.printf(d.getNome() + ": " + d.isFimDeSemana() + "%n");
		d = DiaSemanaEnum.DOMINGO;
		System.out.printf(d.getNome() + ": " + d.isFimDeSemana() + "%n");
		
	}
}