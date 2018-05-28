package practica7;

import java.util.ArrayList;

public class SistemaEscuela {

	private final static int LONGITUD_ARREGLO = 5;
	
	public static void main(String[] args) {
		
		//Arreglo estatico de personas
		Persona[] aPersona = new Persona[LONGITUD_ARREGLO];
		
		aPersona[0] = new Empleado();
		aPersona[1] = new Alumno();
		
		for (int i = 0; i < aPersona.length; i++)
		{
			System.out.println(i + ":" + aPersona[i]);
		}
		
		//Arreglo dinamico
		ArrayList<Persona> aPersona2 = new ArrayList<>();
		
		aPersona2.add(new Empleado());
		aPersona2.add(new Empleado());
		aPersona2.add(new Alumno());
		
		for (int i = 0; i < aPersona2.size(); i++)
		{
			System.out.println(i + ": " + aPersona2.get(i));
		}
		
		for (Persona p : aPersona2)
		{
			System.out.println(p);
		}
		
		//Covarianza de tipos parametricos
		/* ASI NO
		ArrayList<Empleado> emp1 = new ArrayList<>();
		ArrayList<Persona> per1;
		*/
		
		//ASI SI
		ArrayList<Empleado> emp1 = new ArrayList<>();
		ArrayList<? extends Persona> per1;
		
		per1 = emp1; // se puede decir que ArrayList<Empleado> es subtipo de ArrayList<Persona>
		
		//RAW TYPES
		ArrayList listaRaw = new ArrayList();
		listaRaw.add(new Integer(10));
		listaRaw.add(new String("pepe"));
		
		for (Object x : listaRaw)
		{
			System.out.println(x);
		}
		
	
		
	}

}
