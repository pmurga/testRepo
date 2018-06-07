package practica8_VehiculoMotorizado;

import java.util.Scanner;

public class VehiculosMain implements CapacidadLimite{

	public static void main(String[] args) {

		
		VehiculoMotorizado vm;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese tipo de vehiculo(auto / moto / camion: ");
		String vehiculo = s.next();
		
		
		//if (vehiculo == "auto") {
			
			System.out.println("Ingrese tipo de auto(1)compacto 2)coupe 3)sedan 4)van)");
			Integer autito = s.nextInt();
			System.out.println(autito);
			
			String a;
			switch (autito) {
			
			case 1: a = "compacto" ;break;
			case 2: a = "coupe";break;
			case 3: a = "sedan";break;
			case 4: a = "van";break;
			default: a = "compacto";
			
			}
			
			System.out.println("Limite de pasajeros: ");
			System.out.println("Van: "+ limite_pasajeros_van);
			System.out.println("Resto de tipos de autos: "+ limite_pasajeros_auto);
			System.out.println("Ingrese numero de pasajeros: ");
			Integer pasajeros = s.nextInt();
			//VEHICULO MOTORIZADO ES UN AUTO
			vm = new Automovil(a, pasajeros);
			
			vm.setValoresVehiculo();

			
			
//		}else if(vehiculo == "motocicleta"){
			
	//	}
		
		
		System.out.println(vm.toString());
	}

}
