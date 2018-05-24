package Punto;

/**
 * 
 * 9. Implemente la clase Vector3D (ternas de coordenadas de tipo float x, y, z). 
 * Defina constructores y métodos para asignar valores a las coordenadas de los vectores3D, 
 * retornar el valor de cada coordenada, y sumar dos vectores3D, retornando su resultado. 
 * Definir un método booleano de igualdad entre dos vectores3D. 
 * Implementar esta clase a partir de la implementación de la clase Punto.
 */

public class Punto3d extends Punto {
	
	private float z;
	
	public Punto3d(float a, float b, float c)
	{
		//x = a;
		//y = b;
		super(a,b);
		z = c;
	}
	
	public Punto3d()
	{
		this(0f, 0f, 0f);
	}
	
	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}
	
	public boolean esIgual(Punto3d p2)
	{
		if (x == p2.getX())
		{
			if (y == p2.getY())
			{
				if (z == p2.getZ())
				{
					return true;
				}
			}
		}
		return false;
	}
	
	public Punto3d sumarPuntos(Punto3d p1, Punto3d p2)
	{
		
		Punto3d p3 = new Punto3d(p1.getX()+p2.getX(), p1.getY()+p2.getY(),p1.getZ()+p2.getZ());
				
		return p3 ;
		
	}
	
	public void verCoordenadas3d()
	{
		System.out.println("El par ordenado (x,y,z) es: " + "(" + getX() + "," + getY() + "," + getZ() + ")" );

	}
	
}
