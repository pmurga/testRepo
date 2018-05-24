package Microondas;

//now(); --> timer 
// now() - timer = tiempo de coccion

// while condiciones cocinar hasta que condiciones cambian 

public class Microondas 
{

	private enum hayComida
	{
		SI, 
		NO
	}
	
	protected hayComida hay;
	protected Integer nivel;
	
	public Microondas()
	{
		//inicializar comida en NO 
		this.hay = hayComida.NO;

	}
	
	public hayComida getHayComida()
	{
		return this.hay;
	}
	
	public void iniciarCoccion( Integer intensidad , Integer segundos)
	{
		
	}
	
	
	public char getComida()
	{
		if (this.hay == hayComida.SI)
		{
			return 'S';
		}else
		{
			return 'N';
		}
	}
	
}
