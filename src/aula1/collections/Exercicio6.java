package aula1.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void main(String[] args) {

		new Exercicio6();
	}
	
	public Exercicio6() {
		
		Map<String, List<Double>> mapaAluno = new HashMap<>();
		String nome;
		List<Double> nota = null;
		
		for(int i = 0; i < 2; i++) {
			
			nome = JOptionPane.showInputDialog("Nome do Aluno: ");
			
			for(int j = 0; j < 3; j++) {
				nota.add(Double.parseDouble(JOptionPane.showInputDialog("Nota " + (j + 1))));
			
			}
			mapaAluno.put(nome, nota);
		}
		
		System.out.println(mapaAluno);
	}
}