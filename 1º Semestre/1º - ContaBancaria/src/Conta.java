// -----------------------//
//  cabeçalho da classe   //
//----------------------- //

// classe é <public> pois deve ser vista por outras classes
public class Conta {
	
	//------------------------------------ //
	// atributos ou variáveis de instância //
	//------------------------------------ //
	
	// saldo vai ser <private> para ser encapsulado
	private float saldo;
	private Pessoa pessoa1;
	private Pessoa pessoa2;

	//------------------------------------ //
	// 				construtor			   //
	//------------------------------------ //
	public Conta()
	{
		saldo = 0.0f;
	}

	//------------------------------------ //
	// 	  métodos - getters e setters      //
	//------------------------------------ //
	
	// getter
	// tipo de retorno: <float>
	public float getSaldo() 
	{
		return saldo;
	}

	// setter
	// tipo de retorno: <void>
	public void setSaldo(float pSaldo) 
	{
		saldo = pSaldo;
	}
	
	public Pessoa getPessoa1() {
		return pessoa1;
	}

	public void setPessoa1(Pessoa vpessoa1) {
		pessoa1 = vpessoa1;
	}

	public Pessoa getPessoa2() {
		return pessoa2;
	}

	public void setPessoa2(Pessoa vpessoa2) {
		pessoa2 = vpessoa2;
	}


	//------------------------------------ //
	// 			métodos - outros		   //
	//------------------------------------ //

	// exposição do saldo como um inteiro
	// tipo de retorno = <int>
	public int leSaldoInteiro()
	{
		return Math.round(saldo);
	}
	
	
	// tipo de retorno: float
	// obs: decidimos retornar o saldo no método <depositar>
	// cabeçalho do método ou assinatura:
	public float depositar( float valorDeposito )
	//-----------------------^tipo do parâmetro (float)
	//-------------------------------^nome do parâmetro ou variável (valorDeposito)
	// corpo do método:
	{
		saldo = saldo + valorDeposito;
		return saldo;
	}

	// método <static>
	// retorna o nome do banco que desenvolveu o sistema
	public static String nomeDoBanco()
	{
		String str = new String("Banco da Praça");
		return str;
	}
	
// fim da classe
}
