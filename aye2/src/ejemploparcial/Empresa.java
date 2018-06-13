package ejemploparcial;

import java.util.ArrayList;

public class Empresa {

	private String nombre;
	private ArrayList<Bien> bienes;
	private static Empresa instancia = null;
	
	private Empresa() {
		nombre = "Empresa Unica";
		bienes = new ArrayList<>();
		
	}
	
	private static Empresa getInstancia() {
		if (instancia == null) {
			instancia = new Empresa();
		}
		return instancia;
	}
	
	public void agregarBien(Bien b) throws BienExistenteException {
		for (Bien x : bienes) {
			if(x.equals(b)) {
				throw new BienExistenteException();
			}
		}
		bienes.add(b);
	}
	
	public void quitarBien(Bien b) throws BienInexistenteException{
		boolean encontrado = false;
		if(!(bienes.remove(b))) {
			throw new BienInexistenteException();
		}
	}

	public static void notificarTransferencia(Titular titular, int codigo) throws EmailNotSentException{
		
		System.out.println("Se envia un mail a " + titular.getNombre() + "por la transferencia del bien con codigo: " + codigo);
		
	}
	
	public void mostrarBienes(Titular titular) {
		System.out.println("Los bienes de " + titular + ":");
		for (Bien x : bienes) {
			if (x.getTitular().equals(titular)) {
				System.out.println(" - " + x);
			}
		}
	}
	
	public static void main(String[] args) {
		
		Empresa empresa;
		Empresa empresa2;
		
		empresa = Empresa.getInstancia();
		empresa2 = Empresa.getInstancia();
		
		System.out.println("Instancia empresa:" + empresa);
		System.out.println("Instancia empresa 2:" + empresa2);

		Titular titular1 = new Titular("Juan", "Perez");
		Titular titular2 = new Titular("Soledad", "Gonzalez");

		Automotor auto = new Automotor();
		auto.asignarTitular(titular1);
		Cuenta cuenta = new Cuenta(titular2);
		
		auto.setValorFiscal(100);
		auto.setValorMercado(500);
		
		try {
			auto.setAlicuota((float) 1.5);
			empresa.agregarBien(auto);
			empresa.agregarBien(cuenta);
			
			empresa.mostrarBienes(titular1);

			auto.transferir(titular2);
			System.out.println("El impuesto del " + auto + "es: " + auto.calcularImpuesto() ); 

			
		}catch (BienExistenteException e) {
			System.out.println("El bien ya existe");
		}catch (TransferenciaInvalidaException e) {
			System.out.println("La transferencia fue invalida");
		} catch (AlicuotaInvalidaException e) {
			System.out.println("La alicuota es invalida");
		}
		empresa.mostrarBienes(titular1);
		empresa.mostrarBienes(titular2);
	
	}
	

}
