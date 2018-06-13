package ejemploparcial;

public abstract class Bien {

	protected Titular titular;
	protected float valorMercado;
	protected float valorFiscal;
	protected int codigo;
	
	private static int proximoCodigo = 0 ;
	
	public Bien() {
		codigo = proximoCodigo;
		proximoCodigo++;
	}
	
	public Bien(Titular titular) {
		this();
		this.titular = titular;
	}
	
	public void setValorMercado(float valor) throws ValorMercadoInvalidoException{
		if(valor < 0) {
			throw new ValorMercadoInvalidoException();
		}
		valorMercado = valor;
	}
	
	public void setValorFiscal(float valor) throws ValorFiscalInvalidoException{
		if(valor < 0) {
			throw new ValorFiscalInvalidoException();
		}
		valorFiscal = valor;
	}

	public float getValorMercado() {
		return valorMercado;
	}

	public float getValorFiscal() {
		return valorFiscal;
	}
	public void asignarTitular(Titular titular) {
		this.titular = titular;
	}
	
	
	public boolean equals(Bien bien2) {
		return codigo == bien2.getCodigo();
	}
	public int getCodigo() {
		return codigo;
	}

	public Titular getTitular() {
		return titular;
	}
}
