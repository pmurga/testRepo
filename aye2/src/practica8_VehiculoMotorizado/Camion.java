package practica8_VehiculoMotorizado;

public class Camion extends VehiculoMotorizado implements CapacidadLimite {

	private Integer pasajeros;	
	private Integer nro_remolques;
	private enum nivel_seguridad{
		BAJO,
		NORMAL
	}
	private nivel_seguridad nivel_seg;
	
	
	public Camion(Integer pasajeros , Integer remolques) {
		
		this.pasajeros = pasajeros;
		this.nro_remolques = remolques;
		
		validar_pasajeros();
	}
	
	private void validar_pasajeros() {
		
		if (pasajeros > limite_pasajeros_camion) {
			this.nivel_seg = nivel_seguridad.BAJO;
		}else {
			this.nivel_seg = nivel_seguridad.NORMAL;
		}		
	}
	
}
