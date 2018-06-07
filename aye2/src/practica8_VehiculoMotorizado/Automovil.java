package practica8_VehiculoMotorizado;

public class Automovil extends VehiculoMotorizado implements CapacidadLimite{

	private Integer pasajeros;	
	private enum tipo_auto{
		COMPACTO,
		COUPE,
		SEDAN,
		VAN
	}
	private tipo_auto tipo;
	
	public Automovil(String tipo_automovil, Integer pasajeros ) {
		
		validarTipoAuto(tipo_automovil);
		this.pasajeros = pasajeros;		
		validarPasajeros();	
	}
	
	private void validarPasajeros() {
		
		if(tipo == tipo_auto.VAN) {
			if(pasajeros > limite_pasajeros_van) {
				alertar_nro_pasajeros(this);
			}
		}else {
			if(pasajeros > limite_pasajeros_auto) {
				alertar_nro_pasajeros(this);
			}
		}
	}
	
	public tipo_auto getTipo() {
		return tipo;
	}

	public void setTipo(String t_a) {
		if (t_a == "compacto") {
			tipo = tipo_auto.COMPACTO;
		}else if(t_a == "coupe") {
			tipo = tipo_auto.COUPE;
		}else if(t_a == "sedan") {
			tipo = tipo_auto.SEDAN;
		}else if(t_a == "van") {
			tipo = tipo_auto.VAN;
		}else {
			System.out.println("El tipo de auto no es valido, por favor ingrese un nuevo tipo de auto.");
		}	
		System.out.println(tipo);
	}

	private void validarTipoAuto(String t_a)
	{
		setTipo(t_a);
	}
	
	private void alertar_nro_pasajeros(Automovil a) {
		
		if (a.getTipo() == tipo_auto.VAN) {
			System.out.println("Reduzca el nro de Pasajeros. El limite permitido es: " + limite_pasajeros_van);
		}else {
			System.out.println("Reduzca el nro de Pasajeros. El limite permitido es: " + limite_pasajeros_auto);
		}	
	}
	
	@Override
	public String toString() {
		
		return "Fabricante: "+ fabricante + " Modelo: " +  modelo + " Anio de Fabricacion: " + anio_fab + " Kilometraje: " + km;
	}
}
