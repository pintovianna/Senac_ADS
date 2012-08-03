package Default;
import java.util.Scanner;

public class Soma2Maiores {

	/**
	 * @param args
	 * 
	 * 3.	Dados três números inteiros, calcular a soma dos dois maiores.
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 0 , n2 = 0 , n3 = 0;
		int maior;
		int segundomaior;
		int soma;
		System.out.println("Exercicio 3");
		
		// ler 3 números
		Scanner scanner = new Scanner(System.in);
		String str;
		try // verifica se existe erro
		{
			System.out.println("Digite o primeiro numero");
			str = scanner.nextLine();
			n1 = Integer.parseInt(str);
			System.out.println("Digite o segundo numero");
			str = scanner.nextLine();
			n2 = Integer.parseInt(str);
			System.out.println("Digite o terceiro numero");
			str = scanner.nextLine();
			n3 = Integer.parseInt(str);
		}
		catch (NumberFormatException e) // se aparecer um erro vai tratar o erro na mensagem
		{
			System.out.println("Voce digitou um numero errado"); 
		}
		
		// calcular o maior numero
				if (n1 > n2)
				{
					maior = n1;
				}
				else
				{
					maior = n2;
				}
				if (n3 > maior)
				{
					maior = n3;
				}
	
		// calcular o 2o maior numero
				if (n1 > n2)
				{
					segundomaior = n1;
				}
				else
				{
					segundomaior = n2;
				}
				if (n3 < segundomaior)
				{
					segundomaior = n3;
				}
		
				// calcular a soma dos 2 maiores numeros
				soma = maior + segundomaior;
				
				
		System.out.printf("Maior número é = %d\n", maior);
		System.out.printf("Segundo Maior número é = %d\n", segundomaior);
		System.out.printf("Soma dos dois maiores é = %d\n", soma);
		
	}
		
}
