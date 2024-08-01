package thread;

public class IntroducaoThread {

	public static void main(String[] args) {
		
		new IntroducaoThread();
	}
	
	public IntroducaoThread() {
		
		//Classe Anônima
		Runnable r = new Runnable() {	//Runneble é um interface funcional, é obrigado a implementar seu método padrão: run();
			
			@Override								//1
			public void run() {						//Classe Anônima
				for(int i = 0; i < 100; i++) {		//Interface Funcional: Possui apenas um método (run()) em sua implementação
					System.out.println(i);
				}
				
			}
		};
													//2
		Runnable rLambda = () -> {					//Função Anônima serve para reduzir a implementação de interfaces funcionais
//						   () são os parâmetros
//						   -> { é o bloco de comandos, que podem ou não retornar
			for(int i = 0; i < 100; i++) {			
				System.out.println(i);
			}
		};
		
		Thread t = new Thread(rLambda);
		System.out.println("Iniciando a Thread");
		t.start();
		
		System.out.println("Terminou o Método Thread");
	}
}