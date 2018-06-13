package practica_7_ej18;

/*
 * Cada libro se
caracteriza por poseer un nombre, un autor, una editorial y un año de publicación.
 */
public class Libro {
	
	private String nombre;
	private String autor;
	private String editorial;
	private String anio_publicacion;

	public Libro(String nombre, String autor, String editorial , String anio){
		this.nombre = nombre;
		this.autor = autor;
		this.editorial = editorial;
		this.anio_publicacion = anio;
	}
	
}
