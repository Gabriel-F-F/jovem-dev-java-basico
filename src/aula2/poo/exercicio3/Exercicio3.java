package aula2.poo.exercicio3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {

		new Exercicio3();
	}

	public Exercicio3() {

		LocalDate ld = LocalDate.parse(JOptionPane.showInputDialog("Digite uma Data:"),
				DateTimeFormatter.ofPattern("dd/MM/yyyy"));

		DayOfWeek dia = ld.getDayOfWeek();

		switch (dia) {
		case MONDAY:
			JOptionPane.showMessageDialog(null, "Segunda-Feira");
			break;

		case TUESDAY:
			JOptionPane.showMessageDialog(null, "Terça-Feira");
			break;
			
		case WEDNESDAY:
			JOptionPane.showMessageDialog(null, "Quarta-Feira");
			break;

		case THURSDAY:
			JOptionPane.showMessageDialog(null, "Quinta-Feira");
			break;

		case FRIDAY:
			JOptionPane.showMessageDialog(null, "Sexta-Feira");
			break;

		case SATURDAY:
			JOptionPane.showMessageDialog(null, "Sábado");
			break;

		case SUNDAY:
			JOptionPane.showMessageDialog(null, "Domingo");
			break;
		}
	}
}