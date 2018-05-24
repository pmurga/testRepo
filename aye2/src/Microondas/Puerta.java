package Microondas;

public class Puerta extends Microondas{
	
	private enum estadoPuerta
	{
		ABIERTA, 
		CERRADA
	}

	protected estadoPuerta status;
	
	public Puerta()
	{
		this.status = estadoPuerta.CERRADA;
	}
	
	public void setEstadoPuerta(char OP)
	{
		if (OP == 'A')
		{
			this.status = estadoPuerta.ABIERTA;
		}else if (OP == 'C')
		{
			this.status = estadoPuerta.CERRADA;
		}
	}
	
	public char getEstadoPuerta()
	{
		if (this.status == estadoPuerta.ABIERTA)
		{
			return 'A';
		}else 
		{
			return 'C';
		}
	}
}
