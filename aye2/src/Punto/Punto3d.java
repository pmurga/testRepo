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
	
	float z;
	
	public Punto3d(float a, float b, float c)
	{
		x = a;
		y = b;
		z = c;
	}
	
	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}
	
	public void verCoordenadas3d()
	{
		System.out.println("El par ordenado (x,y,z) es: " + "(" + getX() + "," + getY() + "," + getZ() + ")" );

	}
	
}
