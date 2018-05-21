package Empleado;

public class Empleado {

	private int numero;
	private String nombre;
	
	public Empleado(int n, String nombre)
	{
		numero =n;
		this.nombre = nombre;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void verDatos()
	{
		System.out.println("Numero: " + numero + " // " + "Nombre: " + nombre);
	}
	
	
}
