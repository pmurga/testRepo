package practica9.matricula;

/*
 * 3.
a) Implemente una clase MatriculaAuto (matrícula de automóvil) que va a estar
formada por dos atributos letra y número. En el método main se deberán crear
objetos matrículas, a partir de sus componentes. La matrícula se considerará
valida si la letra introducida es igual a la letra ‘A’ o ‘B’, y si el número tiene
ocho dígitos. Si la matrícula fuera correcta se creará un objeto matrícula y se
mostrarán por pantalla los valores de sus atributos. En caso de que la letra sea
incorrecta o el número de matrícula no tuviera ocho dígitos, se lanzará una
excepción. El método llamador deberá mostrar un mensaje ante la excepción
recibida indicando que la letra es errónea o el formato es erróneo, dependiendo
de la situación ocurrida.
b) Dado que está desestimado que un constructor de una clase lance una
excepción, ¿cómo cambiaría el punto anterior para que el constructor no lance
la excepción sugerida?
 */

public class MatriculaAuto {

	private char letra;
	private int numero;
	private boolean esValido;
	
	public MatriculaAuto(char letra, String digitos) throws MatriculaAutoException {
		
		if(letra != 'A' && letra != 'B') {
			throw new LetraInvalidaException("La letra (" + letra + ") es invalida");
		}
		
		if (digitos.length() != 8) {
			throw new CantidadDigitosInvalida("La cantidad de digitos (" + digitos.length() + ") es invalida");
		}
		
		numero = Integer.parseInt(digitos);
		this.letra = letra;
		
	}
	
	public MatriculaAuto() {
		esValido = true;
	}
	
	public void setLetra(char letra){
		try {
			if(letra != 'A' && letra != 'B') {
				throw new LetraInvalidaException("La letra (" + letra + ") es invalida");
			}
			this.letra = letra;
		}catch (LetraInvalidaException e) {
			System.out.println("Letra Invalida");
			this.letra = '_';
			esValido = false;
		}
	}
	
	public void setNumero(String digitos) {
		try {
			if (digitos.length() != 8) {
				throw new CantidadDigitosInvalida("La cantidad de digitos (" + digitos.length() + ") es invalida");
			}
			numero = Integer.parseInt(digitos);
			this.letra = letra;
		}catch (CantidadDigitosInvalida e) {
			System.out.println("El numero es invalido");
			esValido = false;
		}catch (NumberFormatException e) {
			System.out.println("Error en formato numero");
			esValido = false;
		}
	}
	
	@Override
	public String toString() {
		return "Matricula Auto: " + letra + "-" + numero;
	}
	
	public boolean esValido() {
		return this.esValido;
	}
	
	public static void main(String[] args) {

		MatriculaAuto mat;
		
		try {
			mat = new MatriculaAuto('A', "12345678");
			System.out.println(mat);
		} catch (MatriculaAutoException e) {
			
			System.out.println("Error de instanciacion :" + e);
			//e.printStackTrace();
		}catch (NumberFormatException e) {
			System.out.println("Error en formato numero");
		}
		
		System.out.println("termina ok");
		
		// Version con validacion por metodos
		
		MatriculaAuto mat2 = new MatriculaAuto();
		mat2.setLetra('A');
		mat2.setNumero("87654321");
		
		if (mat2.esValido()) {
			System.out.println(mat2);
		}
		System.out.println("termina ok 2");
	}
	

}
