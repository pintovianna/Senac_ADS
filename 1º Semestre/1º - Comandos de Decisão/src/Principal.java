import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Decisao se = new Decisao();
		se.decisaoIf();
		
		System.out.println("=================================");
		System.out.println("Pressione ENTER para continuar");
		input.nextLine();
		
		se.decisaoSwitch();
	}

}
