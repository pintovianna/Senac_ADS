import java.util.Scanner;

public class Solucao {

	private int[] a;
	private String[] b;
	private int media0, media1, media2, media3, media4, media5, media6, media7;
	private String palavra;
	private int cont;
	private int i;

	public Solucao() {
		a = new int[8];
		b = new String[5];
		cont = 0;
		palavra = "casa";
	}

	// MENU 01
	public void menu01() {

		System.out.println("");
		System.out.println("========================================");
		System.out.println("          MENU 02 - EXERCÍCIO A  ");
		System.out.println("========================================");

		System.out.println("o resultado aleatório de 8 valores");
		System.out.println("entre 2 e 15, no vetor 'a' são:");

		for (i = 0; i < 8; i++) {
			a[i] = 2 + (int) (Math.random() * (15));
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "]" + " = " + a[i]);
		}

		media0 = (a[0] + a[1]) / 2;
		media1 = (a[0] + a[1] + a[2]) / 3;
		media2 = (a[1] + a[2] + a[3]) / 3;
		media3 = (a[2] + a[3] + a[4]) / 3;
		media4 = (a[3] + a[4] + a[5]) / 3;
		media5 = (a[4] + a[5] + a[6]) / 3;
		media6 = (a[5] + a[6] + a[7]) / 3;
		media7 = (a[7] + a[6]) / 2;

		System.out.println("abaixo segue a média aritmética para:");
		System.out.println("- Obs.1: [0] = " + media0);
		System.out.println("         [1] = " + media1);
		System.out.println("         [2] = " + media2);
		System.out.println("         [3] = " + media3);
		System.out.println("         [4] = " + media4);
		System.out.println("         [5] = " + media5);
		System.out.println("         [6] = " + media6);
		System.out.println("- Obs.2: [7] = " + media7);

		System.out.println("========================================");
		System.out.println("Fim do exercício A!");

	}

	// MENU 02
	public void menu02() {

		System.out.println("========================================");
		System.out.println("          MENU 02 - EXERCÍCIO B  ");
		System.out.println("========================================");

		Scanner palavras = new Scanner(System.in);
		System.out.println("Digite 5 palavras, depois de");
		System.out.println("cada palavra aperte enter:");

		for (int i = 0; i < b.length; i++) {
			b[i] = palavras.nextLine();
		}

		System.out.println("o vetor 'b' ficou com as palavras:");
		for (int i = 0; i < b.length; i++) {

			System.out.println("b[" + i + "]" + " = " + b[i]);
		}
		
		for (int i = 0; i < b.length; i++)
			if (b[i].equals(palavra))
				cont++;

		System.out.println("O vetor b tem '" + cont + "' ocorrencias");
		System.out.println("com a palavra '" + palavra + "'");
		System.out.println("========================================");
		System.out.println("Fim do exercício B!");

	}

}