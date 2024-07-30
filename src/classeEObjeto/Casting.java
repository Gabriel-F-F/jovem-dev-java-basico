package classeEObjeto;

public class Casting {

	public static void main(String[] args) {
		
		double d1 = 5;
		
		System.out.println(d1);  // -> 5.0
		
		int i1 = (int) d1;
		
		System.out.println(i1); // -> 5
		
		float f1 = 5.6858f;

		System.out.println(f1);  // -> 5.6858
		
		int i2 = (int) f1;
		
		System.out.println(i2);  // -> 5
	}
}