package practica_7_ej18;

import java.util.ArrayList;

/**
 * 
 * 18. Definir la clase Estanteria, que permita mantener una serie de estantes, el cual cada
uno de ellos contiene varios libros numerados correlativamente. Cada libro se
caracteriza por poseer un nombre, un autor, una editorial y un año de publicación.
Se pueden agregar estantes, agregar libros en un estante, eliminar un libro y buscar
un libro, obteniendo si no existe, o en el caso de que exista, en qué estante se
encuentra y cuál es su número asociado.
 * @author IT-Pmurga
 *
 */
public class Estanteria {

	ArrayList<Estante> estantes;
	
	public void agregarEstante(Estante e){
		estantes.add(e);
	}
	
	public void buscarLibro(Libro l) {
		
		boolean existe = false;
		int pos = -1;
		
		for (Estante estante : estantes) {
			estante.buscarLibro(l, existe, pos);
		}
	}
	
	
}

