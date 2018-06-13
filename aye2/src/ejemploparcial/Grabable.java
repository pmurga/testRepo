package ejemploparcial;

public interface Grabable {

	void setAlicuota(float alicuota) throws AlicuotaInvalidaException;
	float getAlicuota();
	float calcularImpuesto();
}
