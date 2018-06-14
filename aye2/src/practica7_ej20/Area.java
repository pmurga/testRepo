package practica7_ej20;

import java.util.ArrayList;

public class Area extends Empresa {

	private ArrayList<Empleado> empleados;
	
	public Area() {
		
	}
	
	public void agregarEmpleado(Empleado e) {
		
		empleados.add(e);
		e.setArea(this);
		
	}
	public boolean existeEmpleado(Empleado e) {
	
		return empleados.contains(e);
	
	}
	
	public Area obtenerArea(Empleado e) {
		
		return e.getArea();
		
	}
	public void borrarEmpleado(Empleado e) {
		empleados.remove(e);
	}
}
