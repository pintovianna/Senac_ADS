import java.util.Scanner;


public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String str;
		
		System.out.println("Numero A");
		str = scanner.nextLine();
		int numeroA = Integer.parseInt(str);

		System.out.println("Numero B");
		str = scanner.nextLine();
		int numeroB = Integer.parseInt(str);

		int maior;
		if (numeroA > numeroB)
		{
			maior = numeroA;
		} else {
			maior = numeroB;
		}

		System.out.printf("O maior nœmero Ž = %d\n", maior);
		System.out.printf("Fim!");

	}

}
