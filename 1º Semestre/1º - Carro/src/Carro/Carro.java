package Carro;

public class Carro 
{
	// declaração
	public int numeroDePneus;
	public int anoDeFabricacao;
	public float cilindrada;
	public float potencia;
	public String placa;
	public String marca;
	public String modelo;
	public boolean ligado;
	public boolean portaAberta;
	public Cor cor;
	
	// metodo construtor do carro
	public Carro()
	{
		// inicialização
		numeroDePneus = 4;
		anoDeFabricacao = 2012;
		cilindrada = 1.6f;
		potencia = 80.5f;
		placa = new String();
		marca = new String();
		modelo = new String();
		ligado = false;
		portaAberta = false;	
		cor = Cor.BRANCO;
				
	}
	
	public Carro(int pAno, Cor pCor)
	{
		anoDeFabricacao = pAno;
		cor = pCor;
	}
	
	public void Ligar()
	{
		ligado = true;
	}
	
	public void Desligar()
	{
		ligado = false;
	}
	
	/**
	 * @param args
	 */
}
