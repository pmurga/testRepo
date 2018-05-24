package Microondas;

public class Comida {

	private enum puntoCoccion
	{
		POCO,
		ALPUNTO,
		HECHO,
		COCIDO
	}
	
	puntoCoccion punto;
	String nombre;
	
	public Comida(String n)
	{
		this.nombre = n;
	}

}
