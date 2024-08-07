package aula6.outros;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Desafio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Evento> listaEventos = new ArrayList<>();

		System.out.println("Descrição Evento 1");
		String desc = sc.nextLine();
		System.out.println("Data Evento 1: Ano/Mês/Dia/Hora/Minuto");
		LocalDateTime data = LocalDateTime.of(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		System.out.println("Digite o Tipo do Evento 1: SOCIAL, LAZER, PROFISSIONAL ou OUTROS");
		int tipo = sc.nextInt();
		TipoDeEventoEnum e = TipoDeEventoEnum.tipoEvento(tipo);
		Evento evento1 = new Evento(desc, data, e);
		listaEventos.add(evento1);

		Scanner sc2 = new Scanner(System.in);

		System.out.println("Descrição Evento 2");
		desc = sc2.nextLine();
		System.out.println("Data Evento 2: Ano/Mês/Dia/Hora/Minuto");
		data = LocalDateTime.of(sc2.nextInt(), sc2.nextInt(), sc2.nextInt(), sc2.nextInt(), sc2.nextInt());
		System.out.println("Digite o Tipo do Evento 2: SOCIAL, LAZER, PROFISSIONAL ou OUTROS");
		tipo = sc2.nextInt();
		e = TipoDeEventoEnum.tipoEvento(tipo);
		Evento evento2 = new Evento(desc, data, e);
		listaEventos.add(evento2);

		Scanner sc3 = new Scanner(System.in);

		System.out.println("Descrição Evento 3");
		desc = sc3.nextLine();
		System.out.println("Data Evento 3: Ano/Mês/Dia/Hora/Minuto");
		data = LocalDateTime.of(sc3.nextInt(), sc3.nextInt(), sc3.nextInt(), sc3.nextInt(), sc3.nextInt());
		System.out.println("Digite o Tipo do Evento 3: SOCIAL, LAZER, PROFISSIONAL ou OUTROS");
		tipo = sc3.nextInt();
		e = TipoDeEventoEnum.tipoEvento(tipo);
		Evento evento3 = new Evento(desc, data, e);
		listaEventos.add(evento3);

		Scanner sc4 = new Scanner(System.in);

		System.out.println("Digite um evento");
		String evento = sc4.nextLine();
		TipoDeEventoEnum tipoBusca = TipoDeEventoEnum.valueOf(evento);

		Map<Boolean, List<Evento>> mapa = listaEventos.stream().filter(t -> t.getTipoDeEvento().equals(tipoBusca))
				.collect(Collectors.groupingBy(t -> t.getDataHora().isBefore(LocalDateTime.now())));

		System.out.println("Eventos já ocorridos:");
		System.out.println(mapa.get(true));

		System.out.println("Eventos que ainda não ocorreram:");
		System.out.println(mapa.get(false));

		sc.close();
		sc2.close();
		sc3.close();
		sc4.close();
	}
}