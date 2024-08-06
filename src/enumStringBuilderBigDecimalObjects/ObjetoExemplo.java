package enumStringBuilderBigDecimalObjects;

import java.util.Objects;

public class ObjetoExemplo {

	public static void main(String[] args) {
		
		new ObjetoExemplo();
	}
	
	public ObjetoExemplo() {
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1.equals(s2));
		
		String s3 = null;
		String s4 = "abc";
	  //System.out.println(s3.equals(s4)); -> java.lang.NullPointerException
		
		String s5 = null;
		String s6 = "abc";
		System.out.println(Objects.equals(s5, s6));
	}
}