package practica7;
import java.util.Date;
import java.util.Optional;

public abstract class Persona 
{
	protected String nombre;
	protected int dni;
	protected Date fechaNacimiento;
	protected Persona pareja;
	protected Optional<Persona> pareja2; // Maybe(Persona)
	
	public Persona()
	{
		nombre = new String ("");
		fechaNacimiento = new Date();
		pareja2 = Optional.empty(); //Nothing
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/*
	public boolean tienePareja()
	{
		return pareja != null;
	}
	 */
	
	public boolean tienePareja()
	{
		return pareja2.isPresent(); // isJust()
	}
	
	public boolean getPareja(Persona p) 
	{
		if (tienePareja()) {
			//p.clone(pareja);
			p = pareja2.get();
			return true;
		} else {
				return false;
		}
	}
	
	/* Forma de implementar extension de clone
	public Persona clone(Persona p)
	{
		Persona p2 = new Persona();
		p2.dni = p.dni;
		p2.nombre = p.nombre;
		return p2;
	}
	*/
	
	public abstract int getIngresos();
}

