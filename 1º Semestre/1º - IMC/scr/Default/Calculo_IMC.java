public class Calculo_IMC {
	private String nome;
	private String sexo;
	private int idade;
	private double peso;
	private double altura;
	private double imc;// * OBS *//

	public Calculo_IMC(double peso, double altura) {// * OBS *//
		this.peso = peso;// * OBS *//
		this.altura = altura;// * OBS *//

	}

	public void imc() {
		imc = peso / (altura * altura);
	}

	public double getImc() {
		return imc;
	}

	public void setNome(String Nome) {
		nome = Nome;
	}

	public void setSexo(String Sexo) {
		sexo = Sexo;
	}

	public void setIdade(int i) {
		idade = i;
	}

	public void setPeso(int p) {
		peso = p;
	}

	public void setAltura(int pAltura) {
		altura = pAltura;
	}

	public String getNome() {
		return nome;
	}

	public String getSexo() {
		return sexo;
	}

	public int getIdade() {
		return idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setAltura(double a) {
		altura = a;
	}

	public double getAltura() {
		return altura;
	}

	public static void main(String[] args) {
		Calculo_IMC c1 = new Calculo_IMC(2, 2);// * OBS *////* OBS *////* OBS
												// *////* OBS *//
		c1.setNome("Leonardo");
		System.out.println("Nome : " + c1.getNome());
		c1.setSexo("Masculino");
		System.out.println("Sexo : " + c1.getSexo());
		c1.setIdade(19);
		System.out.println("Idade : " + c1.getIdade());
		c1.setPeso(75);
		System.out.println("Peso : " + c1.getPeso());
		c1.setAltura(1.79);
		System.out.println("Altura : " + c1.getAltura());
		System.out.println("Calculo do IMC :" + c1.getImc());

	}
}
