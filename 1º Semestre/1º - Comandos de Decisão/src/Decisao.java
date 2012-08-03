import java.util.Scanner;

public class Decisao {

	public Decisao() {
		System.out.println("Exexmplos de Comandos de Decisão");
		System.out.println("=================================");
	}

	public void decisaoIf() {
		int valor = 0;

		System.out.println("Programa que lê um valor do teclado e averigua se "
				+ " é par ou ímpar.");

		Scanner entrada;
		entrada = new Scanner(System.in);

		System.out.println("Qual Numero ?");
		valor = entrada.nextInt();

		if ((valor % 2) == 0) {
			System.out.printf("%d é par. \n", valor);
		} else {
			System.out.printf("%d é ímpar. \n", valor);
		}

		System.out.println("Fim do programa");

	}

	public void decisaoSwitch() {

		System.out.println("Códigos:");
		System.out.println("1 - Caderno");
		System.out.println("2 - Lápis");
		System.out.println("3 - Borracha");

		System.out.println("Digite o código : ");
		Scanner entrada = new Scanner(System.in);
		int opcao = entrada.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Caderno");
			break;
		case 2:
			System.out.println("Lápis");
			break;
		case 3:
			System.out.println("Borracha");
			break;
		default:
			System.out.println("Código inválido");
		}
		
		System.out.println("Fim do programa");
	}
}
