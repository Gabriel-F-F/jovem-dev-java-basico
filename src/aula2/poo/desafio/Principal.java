package aula2.poo.desafio;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		new Principal();
	}

	public Principal() {

		Map<Integer, String> mapa = new HashMap<>();

		int opcao = 0;

		do {

			opcao = Integer.parseInt(JOptionPane.showInputDialog(""));
			Carro c = new Carro();
			c.modelo = JOptionPane.showInputDialog("Modelo do Carro:");
			c.ano =Integer.parseInt(JOptionPane.showInputDialog("Ano do Carro:"));
			mapa.put(c.ano, c.modelo);

		} while (opcao != 1);
		
		Collections.checkedSortedMap(null, null, null);
		
		System.out.println(mapa);
	}

}