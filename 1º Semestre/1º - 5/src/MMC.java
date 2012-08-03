
import java.util.Scanner;

public class MMC {

	/**
	 * @param args
	 * 
	 * 5.	Calcular o mínimo múltiplo comum (MMC) de dois números inteiros.
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 0;
		int n2 = 0;
		int n3;
		int mmc;
		int mdc;
						
		System.out.println("Exercicio 5");
		
		// ler 3 números
		Scanner scanner = new Scanner(System.in);
		String str;
		try // verifica se existe erro
		{
			System.out.println("Digite primeiro o maior numero inteiro");
			str = scanner.nextLine();
			n1 = Integer.parseInt(str);
			System.out.println("Digite o segundo maior numero inteiro");
			str = scanner.nextLine();
			n2 = Integer.parseInt(str);
			
		}
		catch (NumberFormatException e) // se aparecer um erro vai tratar o erro na mensagem
		{
			System.out.println("Voce digitou um numero errado"); 
		}
		
		// calcular o MDC entre os dois inteiros
		if (n1 >= n2)
		{
			do 
			{
				mmc = (n1 % mdc) * n2;
			
			} 
			while (n1 != 0);
			System.out.println("o MDC é: " + mdc);
			System.out.println("o MMC é: " + mmc);
			
		}
		else
			System.out.println(" **** O programa só calcula se incluir o maior inteiro inicialmente! ****");
		
		}
		
}
