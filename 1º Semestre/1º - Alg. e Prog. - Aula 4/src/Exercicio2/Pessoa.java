package Exercicio2;

public class Pessoa 
{
	private String nome;
	private int idade;
	boolean aniversario;
	
	public Pessoa()
	{	
	}
		public void setNome(String vNome)
		{
			nome = vNome;
		}
		
		public String getNome()
		{
			return nome;
		}
		
		public void setIdade(int vIdade)
		{
			idade = vIdade;
		}
		
		public int getIdade()
		{
			return idade;
		}
	
		public void facaAniversario()
		{
			aniversario = true;
		}
		
}
