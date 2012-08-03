import java.util.Scanner;


public class InteirosPositivosPares 
{
	public static void main(String[] args)
	{
		int soma = 0;
		int a1 = 0;
		
		// ler 3 números
				Scanner scanner = new Scanner(System.in);
				String str;
				try // verifica se existe erro
				{
					System.out.println("Digite o primeiro numero");
					str = scanner.nextLine();
					a1 = Integer.parseInt(str);

				}
				catch (NumberFormatException e) // se aparecer um erro vai tratar o erro na mensagem
				{
					System.out.println("Voce digitou um numero errado"); 
				}
				
				// carlular o maior numero
				if (a1  0)
				{
					for (int n = 0; n <= 1000; n = n + 2)
					{
						soma = soma + n;
					}
				}
				else
				{
					
				}
		
	}
}
