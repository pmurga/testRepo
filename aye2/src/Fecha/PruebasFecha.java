package Fecha;

public class PruebasFecha {

	public static void main(String[] args) 
	{
		
		Fecha f1 = new Fecha(20,4,1994);
		
		System.out.println(f1.fechaValida());
		
		
		Fecha f2 = new Fecha(20,4,1994);
		Fecha f3 = new Fecha(20,12,1994);
		Fecha f4 = new Fecha(15,2,1994);
		Fecha f5 = new Fecha(5,7,2015);
		Fecha f6 = new Fecha(3,8,1985);
		Fecha f7= new Fecha(19,4,1994);

		
		System.out.println("Fecha 1: " + f1.toString());
		System.out.println("Fecha 2: " + f2.toString());
		System.out.println("Fecha 3: " +f3.toString());
		System.out.println("Fecha 4: " + f4.toString());
		System.out.println("Fecha 5: " + f5.toString());
		System.out.println("Fecha 6: " + f6.toString());
		System.out.println("Fecha 7: " + f7.toString());


		System.out.println("Es mayor Fecha 1 a 2?: " + f1.esMayor(f2));
		System.out.println("Es mayor Fecha 1 a 3?: " + f1.esMayor(f3));
		System.out.println("Es mayor Fecha 1 a 4?: " + f1.esMayor(f4));
		System.out.println("Es mayor Fecha 1 a 5?: " + f1.esMayor(f5));
		System.out.println("Es mayor Fecha 1 a 6?: " + f1.esMayor(f6));
		System.out.println("Es mayor Fecha 1 a 7?: " + f1.esMayor(f7));

	}

}
