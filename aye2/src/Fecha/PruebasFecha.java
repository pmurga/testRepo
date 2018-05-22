package Fecha;

public class PruebasFecha {

	public static void main(String[] args) 
	{
		
		Fecha F1 = new Fecha(20,4,1994);
		Fecha F2 = new Fecha(20,4,1994);
		Fecha F3 = new Fecha(20,12,1994);
		Fecha F4 = new Fecha(15,2,1994);
		Fecha F5 = new Fecha(5,7,2015);
		Fecha F6 = new Fecha(3,8,1985);
		Fecha F7= new Fecha(19,4,1994);

		
		System.out.println("Fecha 1: " + F1.toString());
		System.out.println("Fecha 2: " + F2.toString());
		System.out.println("Fecha 3: " + F3.toString());
		System.out.println("Fecha 4: " + F4.toString());
		System.out.println("Fecha 5: " + F5.toString());
		System.out.println("Fecha 6: " + F6.toString());
		System.out.println("Fecha 7: " + F7.toString());


		System.out.println("Es mayor Fecha 1 a 2?: " + F1.esMayor(F2));
		System.out.println("Es mayor Fecha 1 a 3?: " + F1.esMayor(F3));
		System.out.println("Es mayor Fecha 1 a 4?: " + F1.esMayor(F4));
		System.out.println("Es mayor Fecha 1 a 5?: " + F1.esMayor(F5));
		System.out.println("Es mayor Fecha 1 a 6?: " + F1.esMayor(F6));
		System.out.println("Es mayor Fecha 1 a 7?: " + F1.esMayor(F7));

	}

}
