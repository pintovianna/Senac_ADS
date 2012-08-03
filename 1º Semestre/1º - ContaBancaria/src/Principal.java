
public class Principal {

	public static void main(String[] args) {
		testarConta();
	}
	
	// método private pois será usado apenas em Principal
	private static void testarConta()
	{
		// mensagem inicial
		System.out.println("Iniciando projeto ContaBancaria");
		// imprime o nome do banco, via método estático, 
		// antes de criar qualquer conta
		System.out.println(Conta.nomeDoBanco());
		
		// criar duas contas
		// ao criar os dois objetos abaixo, estarei ocupando espaço de memória
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		
		// alterando o saldo da conta1, através do setter, no caso do saldo anterior já ser positvo
		conta1.setSaldo(500);

		// imprimir saldo das contas
		// usando formatação do float com 2 casas depois da vírgula
		imprimeSaldos(conta1.getSaldo(),conta2.getSaldo());

		// realizar depósitos
		// usando novoSaldo1 como exemplo de uso do retorno de <depositar>
		float novoSaldo1 = conta1.depositar(1000);
		conta2.depositar(50.75f);
		// imprimir saldo das contas
		imprimeSaldos(novoSaldo1,conta2.getSaldo());
		
		// ler saldo como um inteiro
		System.out.printf("Saldo arredondado conta2=%d\n", conta2.leSaldoInteiro());
		
		// a linha abaixo não compila pois o saldo é encapsulado
		//float f = conta1.saldo;
		
		// criar duas pessoas
		Pessoa p1 = new Pessoa("João");
		Pessoa p2 = new Pessoa("Maria");
		
		// informar os correntistas da conta1
		// estou usando os setters de pessoa
		// mas também estou mandando uma mensagem setPessoa para o objeto conta1
		conta1.setPessoa1(p1);
		conta1.setPessoa2(p2);
		
		// imprimir de quem é a conta1
		
		System.out.printf( "Correntistas da conta1: %s e %s\n", conta1.getPessoa1().getNome(), p2.getNome());
	}

	// exemplo de reuso
	// imprime dois saldos
	// também poderia receber duas contas e usar o conta.getSaldo
	private static void imprimeSaldos( float saldo1, float saldo2 )
	{
		System.out.printf("Saldo conta1=%.2f conta2=%.2f \n", saldo1, saldo2);
	}

}
