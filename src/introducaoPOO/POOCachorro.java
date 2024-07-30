package introducaoPOO;

public class POOCachorro extends POOAnimal {

	public POOCachorro() {
		metodoProtected();  //Apenas a Classe Animal e seus filhos herdam o metodoProtected.
	}

	public void fazerBarulho() {
		System.out.println("Au Au");
	}
}