package Default;
import java.util.Scanner;

public class MaiorMenor3 {

	/**
	 * @param args
	 * 
	 * 2.	Calcular o maior e o menor número de três inteiros.
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 0 , n2 = 0 , n3 = 0;
		int maior;
		int menor;
		System.out.println("Exercicio 2");
		
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
		
		// carlular o maior numero
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
	
		// carlular o menor numero
				if (n1 < n2)
				{
					menor = n1;
				}
				else
				{
					menor = n2;
				}
				if (n3 < menor)
				{
					menor = n3;
				}
		
		System.out.printf("Maior número é = %d\n", maior);
		System.out.printf("Menor número é = %d\n", menor);
		
	}
		
}
