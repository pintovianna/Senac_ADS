import java.util.Scanner;


public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String str;
		
		// retangulo com constutor default
		
		System.out.println("Criando ret‰ngulo com construtor default");
		Retangulo retangulo1 = new Retangulo();
		System.out.printf( "çrea do ret‰ngulo = %f\n", retangulo1.CalculaArea());
		//sstr = scanner.nextLine();

		// retangulo
		
		System.out.println("Altura do ret‰ngulo");
		str = scanner.nextLine();
		float altura = Float.parseFloat(str);
		
		System.out.println("Largura do ret‰ngulo");
		str = scanner.nextLine();
		float largura = Float.parseFloat(str);

		Retangulo retangulo2 = new Retangulo( altura, largura );
		str = scanner.nextLine();
		System.out.printf( "çrea do ret‰ngulo = %f\n2", retangulo2.CalculaArea());
		
		// quadrado
		
		System.out.println("Lado do quadrado");
		str = scanner.nextLine();
		float lado = Float.parseFloat(str);

		Quadrado quadrado = new Quadrado( lado );
		System.out.printf( "çrea do quadrado = %f", quadrado .CalculaArea());

	}

}
