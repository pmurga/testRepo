package CuentaCorriente;

public class cuentaCorriente {

	private float S;
	private int cantOps;
	private int extInv;
	
	public cuentaCorriente()
	{
		S = 0f;
		cantOps = 0;
		extInv = 0;
	}
	
	public float saldo()
	{
		return this.S; 
	}
	
	public void deposito(float imp)
	{
		this.S = this.S + imp;
		cantOps += 1;
	}
	
	public void extraccion(float imp)
	{
		if (this.S >= imp)
		{
			this.S = this.S - imp;
			cantOps += 1;
		}else
		{
			extInv += 1;
		}
		
	}

	public int getCantOps() {
		return cantOps;
	}

	public void setCantOps(int cantOps) {
		this.cantOps = cantOps;
	}

	public int getExtInv() {
		return extInv;
	}

	public void setExtInv(int extInv) {
		this.extInv = extInv;
	}
	
	
	
}
