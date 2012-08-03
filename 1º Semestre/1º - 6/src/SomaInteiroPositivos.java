
public class SomaInteiroPositivos 
{
	public static void main(String[] args)
	{
		int soma = 0;
		
			for (int n = 0; n <= 1000; n = n + 2)
			{
				soma = soma + n;
			}
			System.out.println("Resultado da soma é: " + soma);
	}
}
