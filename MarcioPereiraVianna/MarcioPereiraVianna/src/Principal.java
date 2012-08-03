import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

				Solucao n = new Solucao();
				Scanner leDado = new Scanner(System.in);
				int op;
				
				do {
					
					System.out.println("");
					System.out.println("Prova 2 de Algoritmos e Programação I");
					System.out.println("realizada por Marcio Vianna");
					System.out.println("=====================================");
					System.out.println("Neste menu abaixo, escolha alguma das");
					System.out.println("seguinte opções:");
					System.out.println("=====================================");
					System.out.println(" 1 - Exercício A");
					System.out.println(" 2 - Exercício B");
					System.out.println(" 3 - Sair do programa");
					System.out.println("=====================================");
					
					op = leDado.nextInt();
					
					switch (op) {
					
					case 1: 
						n.menu01();
						break;
					case 2: 
						n.menu02();
						break;
					case 3: 
						System.out.println("Fim do Programa");
						break;	

					default:
						System.out.println("Valor inválido!!!");
						System.out.println("Digite um valor de 1 a 3, conforme o menu !!!");
						
					} 
					
				} while (op != 3); 
				
			}
		}
		