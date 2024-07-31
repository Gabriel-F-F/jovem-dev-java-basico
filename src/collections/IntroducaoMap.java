package collections;

import java.util.HashMap;
import java.util.Map;

public class IntroducaoMap {

	public static void main(String[] args) {
		new IntroducaoMap();
	}

	public IntroducaoMap() {
		
		Map<Integer, String> mapa = new HashMap<>();
		
		mapa.put(20, "José");
		mapa.put(35, "Maria");
		System.out.println(mapa.get(35));
//		System.out.println(mapa.get(200)); -> retorna null
		
		mapa.put(35, "Claudia");			//ja no map, chaves iguais se sobreescrevem
		System.out.println(mapa.get(35));
		
		mapa.remove(20);					//remove a chave 20 e valor no mapa
		mapa.remove(35, "Claudia");				//remove a chave 35 e o valor especifico em questao
		System.out.println(mapa.isEmpty());
		
	}
	
}