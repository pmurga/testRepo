package practica8_VehiculoMotorizado;

import java.util.Scanner;

/**
 * Definir una clase VehiculoMotorizado que sirva como clase padre para vehículos de
tipo Motocicleta, Automóvil y Camión. Todos los vehículos poseen un fabricante,
modelo, año de fabricación y kilometraje. Los automóviles son de distintos estilos y
las motocicletas se dedican a usos determinados. A su vez, los camiones pueden
tener uno o varios remolques y tienen un nivel de seguridad dependiendo de si
sobrepasan o no el número máximo de pasajeros autorizados.
Definir también una interfaz llamada CapacidadLimite implementada por las clases
Automóvil y Camión. Esta interfaz debe incluir constantes para el límite de
pasajeros admitidos en automóviles y camiones. Los límites para automóviles deben
incluir límite de pasajeros para automóviles normales y para vans. Con esta
estructura de clases escriba un programa principal que usando una referencia
polimórfica construya un objeto de clase Automovil, Motocicleta o Camión según
decisión del usuario. El programa deberá imprimir la información del vehículo
considerado.
 *
 */
public abstract class VehiculoMotorizado {

	protected String fabricante;
	protected String modelo;
	protected Integer anio_fab;
	protected Integer km;
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Integer getAnio_fab() {
		return anio_fab;
	}
	public void setAnio_fab(Integer anio_fab) {
		this.anio_fab = anio_fab;
	}
	public Integer getKm() {
		return km;
	}
	public void setKm(Integer km) {
		this.km = km;
	}	
	
	public void setValoresVehiculo() {
		Scanner s2 = new Scanner(System.in);
		System.out.println("Ingrese fabricante: ");
		String f = s2.nextLine();
		System.out.println("Ingrese modelo: ");
		String m = s2.nextLine();
		System.out.println("Ingrese anio fabricacion: ");
		Integer a_f = s2.nextInt();
		System.out.println("Ingrese kilometraje: ");
		Integer k = s2.nextInt();
		
		this.fabricante = f;
		this.modelo = m;
		this.anio_fab = a_f;
		this.km = k;
		
		s2.close();
	}
	
}
