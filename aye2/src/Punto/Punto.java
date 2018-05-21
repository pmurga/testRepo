package Punto;
import java.util.*;
import java.lang.*;

/**
 * 
 * 8) Implemente la clase Punto (pares de coordenadas de tipo float x, y). Defina
constructores y métodos para asignar valores a las coordenadas de los puntos,
retornar el valor de cada coordenada, y sumar dos puntos, retornando su resultado.
Definir un método booleano de igualdad entre dos puntos.
 *
 * 
 */

public class Punto
{
	private float x;
	private float y;

	public Punto(float a, float b)
	{
		x = a;
		y = b;
	}
	
	public Punto()
	{
		x = 0f;
		y = 0f;
	}
	
	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	public Punto sumarPuntos(Punto p1, Punto p2)
	{
		
		Punto p3 = new Punto(p1.getX()+p2.getX(), p1.getY()+p2.getY());
				
		return p3 ;
		
	}
	
	
	public boolean esIgual(Punto p2)
	{
		if (x == p2.getX())
		{
			if (y == p2.getY())
			{
				return true;
			}else
			{
				return false;
			}
		}else
		{
			return false;
		}
	}
	
	public void verCoordenadas()
	{	
	System.out.println("El par ordenado (x,y) es: " + "(" + getX() + "," + getY() + ")" );
	}
		
}
