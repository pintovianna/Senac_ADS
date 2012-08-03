package Carro;

public class Principal 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.out.println("Olá Carro");
		Carro meuCarro = new Carro();
		Carro carro2 = new Carro(2010,Cor.PRETO);
		carro2.Ligar(); // comando para ligar o carro, Ligar ou Desligar
		System.out.printf("Novo carro fabricado em %d cor = %s ligado = %b\n", meuCarro.anoDeFabricacao, meuCarro.cor, meuCarro.ligado);
		System.out.printf("Novo carro fabricado em %d cor = %s ligado = %b\n", carro2.anoDeFabricacao, carro2.cor, carro2.ligado);
		System.out.println("Fim do programa");

	}

}
