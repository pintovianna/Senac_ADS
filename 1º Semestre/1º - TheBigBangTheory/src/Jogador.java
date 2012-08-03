// Importa classe swing
import javax.swing.*;

public class Jogador { // Classe Jogador
	
	private String nome1; // variavel nome1
	private String nome2; // variavel nome2
	
	
	public void leNome1(){ // Metodo lenome1 le o nome do jogador
	
		nome1 = "Informe o nome do jogador1: ";
		nome1 = JOptionPane.showInputDialog(null, nome1);
	}
	
	public void leNome2(){ // Metodo lenome2 le o nome do jogador
		
		nome2 = "Informe o nome do jogador2: ";
		nome2 = JOptionPane.showInputDialog(null, nome2);
	
	}

	public String getNome() { // Metodo getnome() busca o nome do jogador
	
		return nome1;
	}

	public String getNome2() { // Metodo getnome2 busca o nome do jogador
		
		return nome2;
	}
	

}
