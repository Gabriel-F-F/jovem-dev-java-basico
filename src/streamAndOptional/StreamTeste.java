package streamAndOptional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamTeste {

	public static void main(String[] args) {

//		Stream + Collections
//		● lista.stream()
//		● conjunto.stream()
//		● mapa.entrySet().stream()

		new StreamTeste();
	}

	// TIPOS DE OPERAÇÕES:

	// 1- Operação intermediária: Recebe uma stream e retorna outra stream

	// 1.1 - map(Function<T, R>) - converte um tipo de variável em outro
	public StreamTeste() {
		List<String> list = new ArrayList<>();
		list.add("adalbeto");
		list.add("antonio");
		list.add("basilio");
		list.add("claudio");
		list.add("denis");

		list.stream().map(String::toUpperCase).forEach(System.out::println);
		list.stream().map(String::length).forEach(System.out::println);

		// 1.2 - filter(Predicate<T>) - remove os elementos que não satisfazem a condição
		List<String> list2 = new ArrayList<>();
		System.err.println();
		list2.add("adalbeto");
		list2.add("antonio");
		list2.add("basilio");
		list2.add("claudio");
		list2.add("denis");

		list2.stream().filter(elemento -> elemento.startsWith("a")).forEach(System.out::println);

		// OBS:. É possível combiná-los, para uma alteração mais específica
		list2.stream().filter(elemento -> elemento.startsWith("a")).map(String::toUpperCase)
				.forEach(System.out::println);

		// 1.3 - distinct() - remove os elementos repetidos (equals)
		List<String> list3 = new ArrayList<>();
		System.out.println();
		list3.add("adalbeto");
		list3.add("antonio");
		list3.add("antonio");
		list3.add("basilio");
		list3.add("basilio");
		list3.add("claudio");
		list3.add("denis");

		list3.stream().distinct().forEach(System.out::println);

		// 1.4 - sorted() - ordena o stream
		List<String> list4 = new ArrayList<>();
		System.err.println();
		list4.add("adalbeto");
		list4.add("antonio");
		list4.add("basilio");
		list4.add("claudio");
		list4.add("denis");

		list4.stream().sorted().forEach(System.out::println);

		// 1.5 - limit(long) - limita a quantidade de elementos
		List<String> list5 = new ArrayList<>();
		System.err.println();
		list5.add("adalbeto");
		list5.add("antonio");
		list5.add("basilio");
		list5.add("claudio");
		list5.add("denis");

		list5.stream().filter(elemento -> elemento.startsWith("a")).map(String::toUpperCase)
				.forEach(System.out::println);

		// 1.6 - peek - serve para mapear o meio da transformação do fluxo de dados
		List<String> list6 = new ArrayList<>();
		System.err.println();
		list6.add("adalbeto");
		list6.add("antonio");
		list6.add("basilio");
		list6.add("claudio");
		list6.add("denis");

		list6.stream().filter(elemento -> elemento.startsWith("a")).peek(el -> System.out.println("[peek]" + el))
				.map(String::toUpperCase).peek(el -> System.out.println("[peek 2]" + el)).forEach(System.out::println);

		// 2 - Operação terminal: Recebe uma stream e retorna um resultado (ou void)

		// 2.1 - forEach() - iterar sobre a stream
		
		// 2.2 - count() - conta o número de elementos
		List<String> listT1 = new ArrayList<>();
		System.err.println();
		listT1.add("adalbeto");
		listT1.add("antonio");
		listT1.add("basilio");
		listT1.add("claudio");
		listT1.add("denis");

		System.out.println(
		listT1.stream().filter(elemento -> elemento.startsWith("a")).map(String::toUpperCase).count()
		);
		
		// 2.3 - findFirst()
		List<String> listT2 = new ArrayList<>();
		System.err.println();
		listT2.add("adalbeto");
		listT2.add("antonio");
		listT2.add("basilio");
		listT2.add("claudio");
		listT2.add("denis");

		System.out.println(
		listT2.stream().filter(elemento -> elemento.startsWith("x")).map(String::toUpperCase).findFirst()
		);
		
		// 2.4- findAny()
		List<String> listT3 = new ArrayList<>();
		System.err.println();
		listT3.add("adalbeto");
		listT3.add("antonio");
		listT3.add("basilio");
		listT3.add("claudio");
		listT3.add("denis");
			
																	//findAny() é Optional de String, podendo utilizar seus métodos
		System.out.println(
		listT3.stream().filter(elemento -> elemento.startsWith("x")).map(String::toUpperCase).findAny().orElse("Não Encontrado!")
		);
		
		// 2.5 - IntStream, DoubleStream, LongStream -> max(), min(), average()
		List<String> listT4 = new ArrayList<>();
		System.err.println();
		listT4.add("adalbeto");
		listT4.add("antonio");
		listT4.add("basilio");
		listT4.add("claudio");
		listT4.add("denis");
		
		System.out.println(
				listT4.stream().filter(elemento -> elemento.startsWith("a")).mapToInt(String::length).average()
				);
		System.out.println(
				listT4.stream().filter(elemento -> elemento.startsWith("a")).mapToInt(String::length).max()
				);
		System.out.println(
				listT4.stream().filter(elemento -> elemento.startsWith("a")).mapToInt(String::length).min()
				);
		
		// 2.6 - collect() - Não altera a lista original, apenas criando um novo fluxo contendo as alterações
		List<String> listT5 = new ArrayList<>();
		System.err.println();
		listT5.add("adalbeto");
		listT5.add("antonio");
		listT5.add("basilio");
		listT5.add("claudio");
		listT5.add("denis");
		
		List<String> nomeFiltrados = listT5.stream().filter(elemento -> elemento.startsWith("a")).collect(Collectors.toList());
		System.out.println(listT5);
		System.out.println(nomeFiltrados);
		
		// Transformando List para Map
		List<String> listT6 = new ArrayList<>();
		System.err.println();
		listT6.add("adalbeto");
		listT6.add("antonio");
		listT6.add("basilio");
		listT6.add("claudio");
		listT6.add(null);
		listT6.add("denis");
		
		Map<Integer, String> nomeFiltrados2 = listT5.stream().filter(elemento -> elemento.startsWith("a")).collect(Collectors.toMap(String::length, s -> s));
		// no groupingBy, agrupa todos as Strings com a mesma quantidade dentro da chave length
		Map<Integer, List<String>> nomeFiltrados3 = listT5.stream().collect(Collectors.groupingBy(String::length));
		// junta as strings em uma linha, podendo ser formatada
		String nomesFiltrados4 = list6.stream().filter(Objects::nonNull).filter(s -> s.startsWith("a")).collect(Collectors.joining(", ", "{","}"));
		
		System.out.println(listT6);
		System.out.println(nomeFiltrados2);
		System.out.println(nomeFiltrados3);
		System.out.println(nomesFiltrados4);
	}
}