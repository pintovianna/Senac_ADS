import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

				Saque n = new Saque();
				Scanner leDado = new Scanner(System.in);
				int op;
				
				do {
					
					System.out.println("");
					System.out.println("Prova de Algoritmos e Programação 1");
					System.out.println("realizada por Marcio Vianna");
					System.out.println("=====================================");
					System.out.println("Neste menu abaixo, escolha alguma das");
					System.out.println("seguinte opções:");
					System.out.println("=====================================");
					System.out.println(" 1 - Digitar a senha");
					System.out.println(" 2 - Digitar o valor do saque");
					System.out.println(" 3 - Saldo da conta");
					System.out.println(" 4 - Exercício");
					System.out.println(" 5 - Sair do programa");
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
						n.menu03();
						break;	
					case 4: 
						n.menu04();
						break;
						
					case 5: 
						System.out.println("Fim do Programa");
						break;
						
					default:
						System.out.println("Valor inválido!!!");
						System.out.println("Digite um valor de 1 a 5, conforme o menu !!!");
						
					} 
					
				} while (op != 5); 
				
			}
		}
		