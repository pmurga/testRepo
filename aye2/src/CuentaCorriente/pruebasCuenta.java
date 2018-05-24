package CuentaCorriente;

public class pruebasCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cuentaCorriente c1 = new cuentaCorriente();
		
		System.out.println("El saldo actual de la cuenta es: $" + c1.saldo());
		
		c1.deposito(15345);
		
		System.out.println("El saldo actual de la cuenta es: $" + c1.saldo());
		System.out.println("Cant de Op Validas: " + c1.getCantOps());
		System.out.println("Cant de Op Invalidas: " + c1.getExtInv() );


		c1.extraccion(10000);
		
		System.out.println("El saldo actual de la cuenta es: $" + c1.saldo());
		System.out.println("Cant de Op Validas: " + c1.getCantOps());
		System.out.println("Cant de Op Invalidas: " + c1.getExtInv() );


		c1.extraccion(10000);
		System.out.println("El saldo actual de la cuenta es: $" + c1.saldo());
		System.out.println("Cant de Op Validas: " + c1.getCantOps());
		System.out.println("Cant de Op Invalidas: " + c1.getExtInv() );

		
		
	}

}
