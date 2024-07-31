package introducaoPOO;

public class PrincipalHeranca {

	public static void main(String[] args) {
	
		new PrincipalHeranca();
	}
	
	public PrincipalHeranca() {
		POOCachorro c = new POOCachorro();
		c.andar();
		c.metodoProtected();
		
//		POOAnimal a = new POOAnimal();	//abstract não permite instanciar um objeto da classe-pai Animal
//		a.andar();
		
		POOCachorroSalsicha a = new POOCachorroSalsicha();
		a.andar();
		a.fazerBarulho();
	}
}