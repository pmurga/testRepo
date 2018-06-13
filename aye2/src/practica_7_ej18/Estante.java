package practica_7_ej18;

import java.util.ArrayList;

public class Estante {

	ArrayList<Libro> libros;
	
	public void agregarLibro(Libro l) {
		libros.add(l);
	}
	
	public void eliminarLibro(Libro l) {
		libros.remove(l);
	}
	
	//devuelve true/false si existe el libro - devuelve pos del objeto o -1 si no existe
	public void buscarLibro(Libro l, boolean existe, int pos)
	{
		existe = libros.contains(l);
		pos = libros.indexOf(l);

	}
	
}
