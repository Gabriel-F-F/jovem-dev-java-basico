package aula2.poo.desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		new Principal();
	}

	public Principal() {

		Map<Integer, String> mapa = new HashMap<>();
		List<Integer> anoCarro = new ArrayList<>();

		String fim = "";

		do {
			Carro c = new Carro();
			c.modelo = JOptionPane.showInputDialog("Modelo do Carro:\nDigite (fim) para parar");
			fim = c.modelo;
			if (fim.equalsIgnoreCase("fim")) {
				break;
			}
			c.ano = Integer.parseInt(JOptionPane.showInputDialog("Ano do Carro:"));
			anoCarro.add(c.ano);
			mapa.put(c.ano, c.modelo);
		} while (fim != "fim");
		
		Collections.sort(anoCarro);
		mapa.get(anoCarro);

		System.out.println(anoCarro);
		System.out.println(mapa);
	}

}