package Punto;

public class PruebasPunto {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Punto P1 = new Punto(3.4f,4.6f);
		
		P1.verCoordenadas();
		
		Punto P2 = new Punto(5.9f,3.0f);
		
		P2.verCoordenadas();

		Punto P3 = new Punto();
		
		P3 = P3.sumarPuntos(P1, P2);
		
		P3.verCoordenadas();
		
		System.out.println(P1.esIgual(P2));

		Punto P4 = new Punto(3.4f,4.6f);

		System.out.println(P1.esIgual(P4));

		
	}

}
