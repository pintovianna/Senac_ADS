package Exercicio1;

/**
 * 
 * 1. fazer uma classe que receba várias alturas de pessoas 
 * que estão em uma fila e mostre a maior altura.
 * 
 */

public class Principal 
{

	public static void main(String[] args) 
	{
		OutraClasse p1 = new OutraClasse();
		p1.setCor("branca");
		p1.setAltura(2.30);
		System.out.println("A porta 1 é da cor/altura : " + p1.getCor() + " / " + p1.getAltura());
		p1.Aberta();
		System.out.printf("Abrir a porta 1: = %b\n", p1.aberta);
		p1.Fechada();

		OutraClasse p2 = new OutraClasse();
		p2.setCor("verde");
		System.out.println("Cor da porta 2 é: " + p2.getCor());
	
	}	
	
}
