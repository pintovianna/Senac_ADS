package Exercicio1;

public class Porta 
{
	private String cor;
	private double altura;
	boolean aberta;
	boolean fechada;
	
	public Porta()
	{
		aberta = false;
		fechada = true;
	}
	
		public void setCor(String vCor)
		{
			cor = vCor;
		}
		
		public String getCor()
		{
			return cor;
		}
		
		public void setAltura(double vAltura)
		{
			altura = vAltura;
		}
		
		public double getAltura()
		{
			return altura;
		}
		
		public void Aberta()
		{
			aberta = true;
			
		}
		
		public void Fechada()
		{
			fechada = false;
		}
		
}
