
public class Retangulo {

	private float altura;
	private float largura;
	
	public Retangulo()
	{
		altura = 0.0f;
		largura = 0.0f;
	}
	
	public Retangulo( float pAltura, float pLargura)
	{
		altura = pAltura;
		largura = pLargura;
	}
	
	public float CalculaArea()
	{
		float area;
		area = altura * largura;
		return area;
		// maneira mais simples:
		// return altura * largura;
	}
}
