package Monedero;

public class Monedero {

	private double guita;
	
	public Monedero()
	{
		
		this.guita = 0;
	
	}
	
	public Monedero (double plata)
	{
		this.guita = plata;
	}
	
	public void ponerPlata (double plata)
	{
		this.guita += plata;
	}
	
	public void sacarPlata (double plata)
	{
		if (this.guita >= plata)
		{
			this.guita -= plata;
		}
	}
	
	public double verDisponible()
	{
		return this.guita;
	}
	
}
