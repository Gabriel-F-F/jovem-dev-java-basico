package introducaoPOO;

public abstract class POOAnimal { //abstract não permite instanciar um objeto da classe-pai Animal
								  //ESTUDAR INTERFACE, Cachorro é um animal e pode andar
								  //				   Peixe é um animal mas não pode andar
								  //Interfaces são caracteristicas intermediadoras das Classes, ex: Andador ou Nadador
	public int tamanho;
	public int nome;
	
	protected void metodoProtected() {
		
	}
	
	public void andar() {
		System.out.println("Animal Andando");
	}
	
	public abstract void fazerBarulho(); 
}