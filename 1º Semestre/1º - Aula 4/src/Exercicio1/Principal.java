package Exercicio1;

/**
 * 
 * @author Consultoria
 * 
 * Continuação do Exemplo 1:
 * Com a implementação da classe Porta execute os seguintes comandos:
 * 
 * 1. Crie um objeto porta de nome porta1;
 * 2. Especifique a cor branca para a porta1;
 * 3. Especifique a altura da porta em 2,30;
 * 4. Abra a porta;
 * 5. Feche a porta;
 * 6. Crie uma segunda porta de nome porta2;
 * 7. Especifique a cor verde para a porta2.
 * 
 */

public class Principal {

	public static void main(String[] args) 
	{
		Porta p1 = new Porta();
		p1.setCor("branca");
		p1.setAltura(2.30);
		System.out.println("A porta 1 é da cor/altura : " + p1.getCor() + " / " + p1.getAltura());
		p1.Aberta();
		System.out.printf("Abrir a porta 1: = %b\n", p1.aberta);
		p1.Fechada();
		System.out.printf("Fechar a porta 1: = %b\n", p1.fechada);

		System.out.println();
		
		Porta p2 = new Porta();
		p2.setCor("verde");
		System.out.println("Cor da porta 2 é: " + p2.getCor());
	
	}	
	
}
