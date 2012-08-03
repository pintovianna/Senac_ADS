import java.util.Scanner;

public class MDC {

	/**
	 * @param args
	 * 
	 * 4.	Calcular o máximo divisor comum (MDC) entre dois inteiros
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 0;
		int n2 = 0;
		int n3;
		
		System.out.println("Exercicio 4");
		
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
				n3 = n1 % n2;
				n1 = n2;
				n2 = n3;
			} 
			while (n3 != 0);
			System.out.println("o MDC é: " + n1);
			
		}
		else
			System.out.println(" **** O programa só calcula se incluir o maior inteiro inicialmente! ****");
		
	}
		
}
