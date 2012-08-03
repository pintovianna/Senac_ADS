import java.util.Scanner;

public class ExerciciosLucia {
	
	public void exer1() {
		System.out.println("");
		System.out.println("Exercício 1");
		System.out.println("---------------------------------------");
		System.out.println("teste exercício 1 .... xxxxxxxxxxxxxxxx");
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.println("=======================================");
		System.out.println("................. Fim do programa" + " 1 " + "!!!");
	}
	
	public void exer2() {
		System.out.println("");
		System.out.println("Exercício 2");
		System.out.println("---------------------------------------");
		System.out.println("teste exercício 2 .... yyyyyyyyyyyyyyyy");
		System.out.println("yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy");
		System.out.println("=======================================");
		System.out.println("................. Fim do programa" + " 2 " + "!!!");
	}
	
	public void exer3() {
		
	int valor;
	int cont = 0;
	int contTotal = 0;
	
	Scanner leDado = new Scanner(System.in);
	
	System.out.println("");
	System.out.println("Exercício 3");
	System.out.println("Digite um valor inteiro ou zero para sair");
	System.out.println("-----------------------------------------");
	valor = leDado.nextInt();		
	
	// != é igual a diferente
	// loop até chegar ao fim do programa
	while (valor != 0){
		contTotal++; // variavel "contadora"
		if ((valor >= 10) && (valor <= 20)) {
			// variavel "contadora"
			cont++; // incremente a variavel em mais uma unidade
		}
		
		System.out.println("Agora digite um valor inteiro ou zero para sair");
		valor = leDado.nextInt();
		
	} // fim do while
	
	System.out.println("");
	System.out.println("=========================================");
	System.out.println("Quantidade de valores digitados = " + contTotal);
	System.out.println("Quantidade de valores entre 10 e 20 = " + cont);
	System.out.println("=========================================");
	System.out.println("................... Fim do programa" + " 3 " + "!!!");
	}
}
