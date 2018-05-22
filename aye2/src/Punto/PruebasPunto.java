package Punto;

public class PruebasPunto {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("");
		System.out.println("Punto(x,y)");
		System.out.println("");
		
		Punto P1 = new Punto(3.4f,4.6f);
		P1.verCoordenadas();
		
		Punto P2 = new Punto(5.9f,3.0f);
		P2.verCoordenadas();

		Punto P3 = new Punto(3.4f,4.6f);
		P3.verCoordenadas();

		Punto P4 = new Punto();
		P4 = P4.sumarPuntos(P1, P2);
		
		
		System.out.println("______________________");
		System.out.println("Suma de P1 y P2:");
		P4.verCoordenadas();
		
		System.out.println("______________________");
		System.out.println("es igual el par ordenado 1 al 2?");
		System.out.println(P1.esIgual(P2));

		
		System.out.println("______________________");
		System.out.println("es igual el par ordenado 1 al 3?");
		System.out.println(P1.esIgual(P3));
		
		System.out.println("");
		System.out.println("Punto3d(x,y,z)");
		System.out.println("");
		
		Punto3d P5 = new Punto3d(1.5f,4.3f,2.5f);
		P5.verCoordenadas3d();
		
		Punto3d P6 = new Punto3d(0.5f,2.5f,5.7f);
		P6.verCoordenadas3d();

		Punto3d P7 = new Punto3d(1.5f,4.3f,2.5f);
		P7.verCoordenadas3d();

		System.out.println("______________________");
		System.out.println("es igual el vector 3d 1 al 2?");
		System.out.println(P5.esIgual(P6));
		
		System.out.println("______________________");
		System.out.println("es igual el vector 3d 1 al 3?");
		System.out.println(P5.esIgual(P7));
		
		Punto3d P8 = new Punto3d();
		P8 = P8.sumarPuntos(P5, P6);
		
		System.out.println("______________________");
		System.out.println("Suma de vector 3d 1 y 2:");
		P8.verCoordenadas3d();
		
		
		
	}

}
