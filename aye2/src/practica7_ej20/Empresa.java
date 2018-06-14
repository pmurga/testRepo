package practica7_ej20;

import java.util.ArrayList;

/**
 * 20. Definir la clase Empresa, que permita contener empleados de distintas áreas de una
empresa. Los empleados se caracterizan por poseer un nombre, apellido y número
de empleado. Considere a la empresa como una lista de áreas (se puede buscar por
nombre o código de área). Definir métodos de obtención del área a la que pertenece
una empleado, de registro de un nuevo empleado, de transferencia de un empleado
de su área a otra área de la empresa, y de baja de un empleado de la empresa
 * @author IT-Pmurga
 *
 */
public class Empresa {

	private ArrayList<Area> areas;
	
	public void agregarEmpleado(Area a, Empleado e) throws AreaInexistenteException{
		
		if(this.existeArea(a)){
			a.agregarEmpleado(e);
		}else {
			throw new AreaInexistenteException();
		}
	}
	public void borrarEmpleado(Area a, Empleado e) throws EmpleadoInexistenteException {
		if(a.existeEmpleado(e)) {
			a.borrarEmpleado(e);
		}else {
			throw new EmpleadoInexistenteException();
		}
	}
	
	public void transferirEmpleado(Empleado e, Area a) throws NoTransferidoException {
		
		try {
			this.agregarEmpleado(a,e);
			this.borrarEmpleado(a,e);
		}catch (AreaInexistenteException exc) {
			throw new NoTransferidoException();
		}catch (EmpleadoInexistenteException exc) {
			throw new NoTransferidoException();
		}
		
	}
	public void buscarEmpleado(Empleado e, Area a) throws EmpleadoInexistenteException {
				
			for (Area area : areas) {
				try {
				a = area.obtenerArea(e);		
				}catch (NullPointerException exc){
					throw new EmpleadoInexistenteException();
				}
			}	
	}
	public boolean existeEmpleado(Empleado e) {
		
		boolean existe = false; 
		
		for (Area area : areas) {
			
			if (area.existeEmpleado(e)) {
				existe = true;
			}
		}
		return existe;
	}
	public boolean existeArea(Area a) {
		
		return areas.contains(a);
	}
	
}
