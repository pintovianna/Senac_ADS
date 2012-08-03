package carro;

public class Carro {
	
	// todos atributos devem ser "private", 99% das vezes
	private String cor;
	private double volumeDoTanque;
	
	// "void" serve para não retornar nenhum valor
	public void setCor(String vCor) {
		cor = vCor;
	}
	
	// um metodo "get" sempre retorna alguma coisa
	public String getCor() {
		return cor;
	}
	
}
