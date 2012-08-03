
public class Quadrado {

	private float lado;
	
	public Quadrado()
	{
		lado = 0.0f;
	}
	
	public Quadrado( float pLado )
	{
		lado = pLado;
	}
	
	public float CalculaArea()
	{
		return lado * lado;
	}
}
