//importa classes para ser efetuada alteração da imagem da janela JoptionPane
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ImagemButton {// Classe Imagem.

	Juiz juiz = new Juiz();

	ImageIcon icon;

	Jogador jogador = new Jogador();

	private int result;

	private int result2;

	public void chamaJogo() {

		Object[] message = { "BEM VINDO AO: \n- PEDRA \n- PAPEL "
				+ "\n- TESOURA \n- LAGARTO \n- SPOCK \nCLIQUE NO BOTÃO DESEJADO." };
		String[] options = { "Jogar", "Sair", "Sobre" };

		icon = new ImageIcon(getClass().getResource("pptls.png"));

		result = JOptionPane.showOptionDialog(null, message,
				"PEDRA - PAPEL - TESOURA - LAGARTO - SPOCK", 0, 0, icon,
				options, options[2]);

	}

	public void chamaSobre() {

		String[] options2 = { "Retornar", "Sair" };
		Object[] message2 = { "Autores:\n- Guilherme Grezzana \n- Rodrigo Souza \n- Marcio Vianna" };
		result2 = JOptionPane.showOptionDialog(null, message2,
				"PEDRA - PAPEL - TESOURA - LAGARTO - SPOCK", 0, 0, icon,
				options2, options2[0]);

	}

	public void IniciaJogo() {

		chamaJogo();

		switch (result) {
		case 0:
			juiz.iniciaJogo();

			break;
		case 1:
			System.exit(0);

			break;

		case 2:

			chamaSobre();

		

				while (result2 == 0) {
					chamaJogo();
						switch (result) {
						case 0:
							juiz.iniciaJogo();
							break;
							
						case 1:
							System.exit(0);
							break;
							
						case 2:
							chamaSobre();
							
							

						default:
							break;
						}
					
				}

			

				System.exit(0);


			break;
		}
	}

}
