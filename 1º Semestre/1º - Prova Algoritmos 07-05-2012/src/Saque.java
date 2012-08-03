import java.util.Scanner;

public class Saque {
	
	public int senha;
	public double saldo;
	public double saque;
	public boolean senhaCorreta;
	public String nomeCompleto;
	public int i;
	
	public Saque() {
		senha = 111;
		saldo = 1000.00;
		senhaCorreta = true;
	}
	
	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isSenhaCorreta() {
		return senhaCorreta;
	}

	public void setSenhaCorreta(boolean senhaCorreta) {
		this.senhaCorreta = senhaCorreta;
	}

	// MENU 01
	public void menu01() {
		
		System.out.println("");
		System.out.println("========================================");
		System.out.println("       MENU 01 - DIGITE SUA SENHA");
		System.out.println("========================================");
		
		Scanner entrada = new Scanner(System.in);   
		System.out.println("Digite sua senha: ");
		
		while (senha == 111) {   
			  			
            senha = entrada.nextInt(); 
            System.out.println("Senha correta."); 
                  
            if (senha != 111){  
                System.out.println("Senha incorreta. Digite Novamente."); 
                                         
            } 
            else{
            	// ???? 
            }
            return;
            		
        }
		
		System.out.println("");
		System.out.println("Fim do menu 01 !!!");
	}
	
	public void depositar(double quantia) {
		saldo = saldo + quantia;
	}
	
	public void retirar(double quantia) {
		saldo = saldo - quantia;
	}
	
	// MENU 02
	public void menu02() {
		System.out.println("");
		System.out.println("========================================");
		System.out.println("    MENU 02 - DIGITE O VALOR DE SAQUE   ");
		System.out.println("========================================");
		
		Saque x1 = new Saque();
		System.out.println("Saldo Atual: " + saldo);
		
		Scanner entrada = new Scanner(System.in);   
		System.out.println("Digite o valor que deseja sacar: ");
		
		while (saque < saldo) {   
  			
			saque = entrada.nextInt(); 
						
		    if (saque > saldo){ 
            	System.out.println("Saque não permitido.");      	
            }
            else{
            	System.out.println("Retire o dinheiro.");
            	x1.retirar(saque);
    			System.out.println("Saldo Atual: " + x1.saldo);
            }
		    return;
		}
		
		System.out.println("");
		System.out.println("Fim do menu 02 !!!");
		
	}
	
	// MENU 03
	public void menu03() {
		
		System.out.println("========================================");
		System.out.println("        MENU 03 - SALDO DA CONTA   ");
		System.out.println("========================================");
		
		System.out.println("Saldo Atual: " + saldo);        
        
        System.out.println("");
        System.out.println("Fim do menu 03 !!!");
		
	}
	
	// MENU 04
	public void menu04() {
		
		System.out.println("========================================");
		System.out.println("           MENU 04 - EXERCÍCIO   ");
		System.out.println("========================================");

		for (int i=0; i<5; i++) // 5 é o número de repetições   
			  System.out.println(nomeCompleto = "marcio pereira vianna");   
					   
		System.out.println("");
		System.out.println("Fim do menu 04 !!!");
		} 		
}