package thread;

import java.util.ArrayList;
import java.util.List;

public class TesteInterface {

	public static void main(String[] args) {
		
		new TesteInterface();
	}
	
	public TesteInterface() {
		
//		FuncionalInterfaceCalculadora c1 = (v1, v2) -> v1 * v2;
//		FuncionalInterfaceCalculadora c2 = (v1, v2) -> v1 / v2;
//		FuncionalInterfaceCalculadora c3 = (v1, v2) -> Math.pow(v1, v2);
//		
//		FuncionalInterfaceCalculadora c3 = Math::pow;		//chama o objeto quando a classe for estatica
		
//		System.out.println(c1.calcula(2.0, 5.0));
//		System.out.println(c2.calcula(2.0, 5.0));
//		System.out.println(c3.calcula(2.0, 5.0));
		
		List<String> lista = new ArrayList<String>();
		lista.add("abc");
		lista.add("abcd");
		lista.add("abce");
		lista.add("abcf");
		lista.add("abcg");
		lista.add("abch");
		
		String filtro = "abc";
		lista.removeIf(filtro::equals);		
		System.out.println(lista);
	}
}