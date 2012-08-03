package carro;

public class Principal {

	// para comentar varias linhas é só colocar como exemplo abaixo
	/*
	 * @param args
	 * teste
	 * teste
	 * 
	 * teste
	 * teste
	 * 
	 */
	
	// tarefas a realizar, como o exemplo abaixo "tasks"
	// TODO Auto-generated method stub
	
	public static void main(String[] args) {
		Carro c1 = new Carro();
		c1.setCor("azul");
		System.out.println("O carro c1 é: " + c1.getCor()); // atalho: syso e Ctrl+Space
		
		Carro c2 = new Carro();
		c2.setCor("vermelho");
		System.out.println("O carro c2 é: " + c2.getCor());
		
	}

}
