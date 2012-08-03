package Default;
import java.util.Scanner;

public class Maior3 {

	/**
	 * @param args
	 * 
	 * 1.	Calcular o maior de três números inteiros.
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 0 , n2 = 0 , n3 = 0;
		int maior;
		System.out.println("Exercicio 1");
		
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
	
		System.out.printf("Maior número é = %d\n", maior);
		
	}
		
}
