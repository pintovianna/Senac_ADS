import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		ExerciciosLucia e = new ExerciciosLucia();
		Scanner leDado = new Scanner(System.in);
		int op;
		
		do {
			
			System.out.println(""); 
			System.out.println("=======================");
			System.out.println(" 1 - Exercício 1");
			System.out.println(" 2 - Exercício 2");
			System.out.println(" 3 - Exercício 3");
			System.out.println(" 0 - Sair do programa");
			System.out.println("=======================");
			
			op = leDado.nextInt();
			
			switch (op) {
			
			case 1: 
				e.exer1();
				break;
			case 2: 
				e.exer2();
				break;
			
			case 3: 
				e.exer3();
				break;	
				
			case 0: 
				System.out.println("Fim do Programa");
				break;
				
			default:
				System.out.println("Valor inválido!!!");
				
			} // fim di switch
			
		} while (op != 0); // fim do while
		
	}
}
