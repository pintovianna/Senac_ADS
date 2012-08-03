import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class Juiz { // Inicia classe Juiz aonde o jogo é iniciado e julgado

	private String jogada1, jogada2, st, s; // declara variaveis String
											// utilizadas na classe
	int j1 = 0, j2 = 0; // Declara variaveis Inteiras para fazer o
						// placar
	private int r = 0;
	
	ImageIcon icon = new ImageIcon(getClass().getResource("pptls.png"));
	ImageIcon icon2 = new ImageIcon(getClass().getResource("bazinga.png"));

	Jogador jogador = new Jogador(); // Cria objeto jogador
	Pedra pedra = new Pedra(); // Cria objeto pedra
	Papel papel = new Papel(); // Cria objeto papel
	Tesoura tesoura = new Tesoura(); // Cria objeto tesoura
	Spock spock = new Spock(); // Cria objeto spock
	Lagarto lagarto = new Lagarto(); // Cria objeto lagarto

	public void iniciaJogo() {
		jogador.leNome1();

		jogador.leNome2();

		while (j1 < 3 && j2 < 3) {
			jogada1 = "- Pedra; \n- Tesoura; \n- Papel; \n- Lagarto; \n- Spock; \n"
					+ "Informe a jogada do " + jogador.getNome();
			jogada1 = JOptionPane.showInputDialog(null, jogada1);

			jogada2 = "- Pedra; \n- Tesoura; \n- Papel; \n- Lagarto; \n- Spock; \n"
					+ "Informe a jogada do " + jogador.getNome2();
			jogada2 = JOptionPane.showInputDialog(null, jogada2, null);
			

			r++;

			avaliaJogo();
			
			

		}

		chamaTelaFinal();
		
		

	}

	public void chamaTelaFinal() {

		if (j1 == 3) {
			int result;

			Object[] message = { jogador.getNome() + " é o vencedor!" };
			String[] options = { "Inicio", "Sair" };
			
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font ("Arial", Font.BOLD, 18)));
			result = JOptionPane.showOptionDialog(null, message,
					"PEDRA - PAPEL - TESOURA - LAGARTO - SPOCK", 0, 0, icon2,
					options, options[1]);

			switch (result) {
			case 0:
				j1 = 0;
				j2 = 0;
				r = 0;
				iniciaJogo();
				avaliaJogo();
				break;
			case 1:
				System.exit(0);
				break;

			default:
				break;
			}

		} else {

			int result;

			Object[] message = { jogador.getNome2() + " é o vencedor!" };
			String[] options = { "Inicio", "Sair" };
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font ("Arial", Font.BOLD, 18)));
			result = JOptionPane.showOptionDialog(null, message,
					"PEDRA - PAPEL - TESOURA - LAGARTO - SPOCK", 0, 0, icon2,
					options, options[1]);

			switch (result) {
			case 0:
				iniciaJogo();
				break;
			case 1:
				System.exit(0);
				break;

			default:
				break;
			}

		}

	}

	public void avaliaJogo() { // metodo que avalia as opções escolhidas pelos
								// jogadores e informa quem ganhou a rodada.

		// Os comandos if a seguir fazem a verificação de qual jogador ganhou a

		if ((jogada1.equalsIgnoreCase("Pedra"))
				&& (jogada2.equalsIgnoreCase("Pedra"))) {

			st = "Empate " + (j1 + " x " + j2);
			JOptionPane.showMessageDialog(null, st, "Mensagem", 1, icon);

		}

		if ((jogada1.equalsIgnoreCase("Tesoura"))
				&& (jogada2.equalsIgnoreCase("Tesoura"))) {

			st = "Empate " + (j1 + " x " + j2);
			JOptionPane.showMessageDialog(null, st, "Mensagem", 1, icon);

		}

		if ((jogada1.equalsIgnoreCase("Papel"))
				&& (jogada2.equalsIgnoreCase("Papel"))) {

			st = "Empate " + (j1 + " x " + j2);
			JOptionPane.showMessageDialog(null, st, "Mensagem", 1, icon);

		}

		if ((jogada1.equalsIgnoreCase("Spock"))
				&& (jogada2.equalsIgnoreCase("Spock"))) {

			st = "Empate " + (j1 + " x " + j2);
			JOptionPane.showMessageDialog(null, st, "Mensagem", 1, icon);

			
		}

		if ((jogada1.equalsIgnoreCase("Lagarto"))
				&& (jogada2.equalsIgnoreCase("Lagarto"))) {

			st = "Empate " + (j1 + " x " + j2);
			JOptionPane.showMessageDialog(null, st, "Mensagem", 1, icon);


		}

		if ((jogada1.equalsIgnoreCase("Tesoura"))
				&& (jogada2.equalsIgnoreCase("Pedra"))) {

			j2++; // se o jogador 2 ganhou a rodada comando implementa a
					// variavel j2 para verificar quem ganhou a partida no final
			s = "Vencedor da rodada " + r + " - " + jogador.getNome2() + "!\n "
					+ pedra.retornaPedra() + " Vence! \nResultado "
					+ (j1 + " x " + j2);
			JOptionPane.showMessageDialog(null, s, "Mensagem", 1, icon);

		}

		if ((jogada1.equalsIgnoreCase("Tesoura"))
				&& (jogada2.equalsIgnoreCase("Papel"))) {

			j1++; // se o jogador 1 ganhou a rodada comando implementa a
					// variavel j1 para verificar quem ganhou a partida no final
			s = "Vencedor da rodada " + r + " - " + jogador.getNome() + "!\n "
					+ tesoura.retornaTesoura() + " Vence! \nResultado "
					+ (j1 + " x " + j2);
			JOptionPane.showMessageDialog(null, s, "Mensagem", 1, icon);
		}

		if ((jogada1.equalsIgnoreCase("Tesoura"))
				&& (jogada2.equalsIgnoreCase("Lagarto"))) {

			j1++;
			s = "Vencedor da rodada " + r + " - " + jogador.getNome() + "!\n "
					+ tesoura.retornaTesoura() + " Vence! \nResultado "
					+ (j1 + " x " + j2);
			JOptionPane.showMessageDialog(null, s, "Mensagem", 1, icon);

		}

		if ((jogada1.equalsIgnoreCase("Tesoura"))
				&& (jogada2.equalsIgnoreCase("Spock"))) {

			j2++;
			s = "Vencedor da rodada " + r + " - " + jogador.getNome2() + "!\n "
					+ spock.retornaSpock() + " Vence! \nResultado "
					+ (j1 + " x " + j2);
			JOptionPane.showMessageDialog(null, s, "Mensagem", 1, icon);

		}

		if ((jogada1.equalsIgnoreCase("Papel"))
				&& (jogada2.equalsIgnoreCase("Pedra"))) {

			j1++;
			s = "Vencedor da rodada " + r + " - " + jogador.getNome() + "!\n "
					+ papel.retonaPapel() + " Vence! \nResultado "
					+ (j1 + " x " + j2);
			JOptionPane.showMessageDialog(null, s, "Mensagem", 1, icon);

		}

		if ((jogada1.equalsIgnoreCase("Papel"))
				&& (jogada2.equalsIgnoreCase("Tesoura"))) {

			j2++;
			s = "Vencedor da rodada " + r + " - " + jogador.getNome2() + "!\n "
					+ tesoura.retornaTesoura() + " Vence! \nResultado "
					+ (j1 + " x " + j2);
			JOptionPane.showMessageDialog(null, s, "Mensagem", 1, icon);

		}

		if ((jogada1.equalsIgnoreCase("Papel"))
				&& (jogada2.equalsIgnoreCase("Lagarto"))) {

			j2++;
			s = "Vencedor da rodada " + r + " - " + jogador.getNome2() + "!\n "
					+ lagarto.retonaLagarto() + "Lagarto Vence! \nResultado "
					+ (j1 + " x " + j2);
			JOptionPane.showMessageDialog(null, s, "Mensagem", 1, icon);

		}

		if ((jogada1.equalsIgnoreCase("Papel"))
				&& (jogada2.equalsIgnoreCase("Spock"))) {

			j1++;
			s = "Vencedor da rodada " + r + " - " + jogador.getNome() + "!\n "
					+ papel.retonaPapel() + " Vence! \nResultado "
					+ (j1 + " x " + j2);
			JOptionPane.showMessageDialog(null, s, "Mensagem", 1, icon);

		}

		if ((jogada1.equalsIgnoreCase("Pedra"))
				&& (jogada2.equalsIgnoreCase("Papel"))) {

			j2++;
			s = "Vencedor da rodada " + r + " - " + jogador.getNome2() + "!\n "
					+ papel.retonaPapel() + " Vence! \nResultado "
					+ (j1 + " x " + j2);
			JOptionPane.showMessageDialog(null, s, "Mensagem", 1, icon);

		}

		if ((jogada1.equalsIgnoreCase("Pedra"))
				&& (jogada2.equalsIgnoreCase("Tesoura"))) {

			j1++;
			s = "Vencedor da rodada " + r + " - " + jogador.getNome() + "!\n "
					+ pedra.retornaPedra() + " Vence! \nResultado "
					+ (j1 + " x " + j2);
			JOptionPane.showMessageDialog(null, s, "Mensagem", 1, icon);

		}

		if ((jogada1.equalsIgnoreCase("Pedra"))
				&& (jogada2.equalsIgnoreCase("Lagarto"))) {

			j1++;
			s = "Vencedor da rodada " + r + " - " + jogador.getNome() + "!\n "
					+ pedra.retornaPedra() + " Vence! \nResultado "
					+ (j1 + " x " + j2);
			JOptionPane.showMessageDialog(null, s, "Mensagem", 1, icon);

		}

		if ((jogada1.equalsIgnoreCase("Pedra"))
				&& (jogada2.equalsIgnoreCase("Spock"))) {

			j2++;
			s = "Vencedor da rodada " + r + " - " + jogador.getNome2() + "!\n "
					+ spock.retornaSpock() + " Vence! \nResultado "
					+ (j1 + " x " + j2);
			JOptionPane.showMessageDialog(null, s, "Mensagem", 1, icon);

		}

		if ((jogada1.equalsIgnoreCase("Lagarto"))
				&& (jogada2.equalsIgnoreCase("Tesoura"))) {

			j2++;
			s = "Vencedor da rodada " + r + " - " + jogador.getNome2() + "!\n "
					+ tesoura.retornaTesoura() + " Vence! \nResultado "
					+ (j1 + " x " + j2);
			JOptionPane.showMessageDialog(null, s, "Mensagem", 1, icon);

		}

		if ((jogada1.equalsIgnoreCase("Lagarto"))
				&& (jogada2.equalsIgnoreCase("Pedra"))) {

			j2++;
			s = "Vencedor da rodada " + r + " - " + jogador.getNome2() + "!\n "
					+ pedra.retornaPedra() + " Vence! \nResultado "
					+ (j1 + " x " + j2);
			JOptionPane.showMessageDialog(null, s, "Mensagem", 1, icon);

		}

		if ((jogada1.equalsIgnoreCase("Lagarto"))
				&& (jogada2.equalsIgnoreCase("Papel"))) {

			j1++;
			s = "Vencedor da rodada " + r + " - " + jogador.getNome() + "!\n "
					+ lagarto.retonaLagarto() + " Vence! \nResultado "
					+ (j1 + " x " + j2);
			JOptionPane.showMessageDialog(null, s, "Mensagem", 1, icon);

		}

		if ((jogada1.equalsIgnoreCase("Lagarto"))
				&& (jogada2.equalsIgnoreCase("Spock"))) {

			j1++;
			s = "Vencedor da rodada " + r + " - " + jogador.getNome() + "!\n "
					+ lagarto.retonaLagarto() + " Vence! \nResultado "
					+ (j1 + " x " + j2);
			JOptionPane.showMessageDialog(null, s, "Mensagem", 1, icon);

		}

		if ((jogada1.equalsIgnoreCase("Spock"))
				&& (jogada2.equalsIgnoreCase("Tesoura"))) {

			j1++;
			s = "Vencedor da rodada " + r + " - " + jogador.getNome() + "!\n "
					+ spock.retornaSpock() + " Vence! \nResultado "
					+ (j1 + " x " + j2);
			JOptionPane.showMessageDialog(null, s, "Mensagem", 1, icon);

		}

		if ((jogada1.equalsIgnoreCase("Spock"))
				&& (jogada2.equalsIgnoreCase("Pedra"))) {

			j1++;
			s = "Vencedor da rodada " + r + " - " + jogador.getNome() + "!\n "
					+ spock.retornaSpock() + " Vence! \nResultado "
					+ (j1 + " x " + j2);
			JOptionPane.showMessageDialog(null, s, "Mensagem", 1, icon);

		}

		if ((jogada1.equalsIgnoreCase("Spock"))
				&& (jogada2.equalsIgnoreCase("Papel"))) {

			j2++;
			s = "Vencedor da rodada " + r + " - " + jogador.getNome2() + "!\n "
					+ papel.retonaPapel() + " Vence! \nResultado "
					+ (j1 + " x " + j2);
			JOptionPane.showMessageDialog(null, s, "Mensagem", 1, icon);

		}

		if ((jogada1.equalsIgnoreCase("Spock"))
				&& (jogada2.equalsIgnoreCase("Lagarto"))) {

			j2++;
			s = "Vencedor da rodada " + r + " - " + jogador.getNome2() + "!\n "
					+ lagarto.retonaLagarto() + " Vence! \nResultado "
					+ (j1 + " x " + j2);
			JOptionPane.showMessageDialog(null, s, "Mensagem", 1, icon);


		}

	}
}
