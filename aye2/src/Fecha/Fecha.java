package Fecha;

public class Fecha {
	
	int d;
	int m;
	int a;
	
	public Fecha(int D, int M, int A) 
	{
		if (fechaValida(D,M,A)) 
		{	
			d = D;
			m = M;
			a = A;		
		}
	}	

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public boolean esMayor(Fecha fAux)
	{
		if (this.a > fAux.getA())
		{
			return true;
		} else if (this.a < fAux.getA())
			{
				return false;
			}else
			{
				if (this.m > fAux.getM())
				{
					return true;
				}else if (this.m < fAux.getM())
					{
						return false;
					}else
						{
							if (this.d > fAux.getD())
							{
								return true;
							}else if (this.d < fAux.getD())
								{
									return false;
								}else
									{
										return false;
									}
						}
			}
	}
	
	private boolean fechaValida(int D, int M, int A)
	{
		if (anioValido(A))
		{
			if (mesValido(M))
			{
				if (diaValido(D,M))
				{
					return true;
				}else
				{
					return false;
				}
			}else
			{
				return false;
			}
		}else
		{
			return false;
		}
	}
	
	private boolean anioValido(int A)
	{
		if (A > 0 && A < 2018)
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	private boolean mesValido(int M)
	{
		if (M > 0 && M < 13)
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	private boolean diaValido(int D, int M)
	{
	
		if (D >= 1 && D <= 31)
		{
			//febrero
			if (M == 2)
			{
				//dias febrero
				if (D > 28)
				{
					return false;
				}else 
				{
					return true;
				}	
			// 30 dias trae Noviembre, con Abril , Junio y Septiembre
			}else if (M == 11 || M == 4 || M == 6 || M == 9)
			{
				 if (D > 30)
				 {
					 return false;
				 }else
				 {
					 return true;
				 }
			}else
			{
				return true;
			}
		}else
		{
			return false;
		}
	}
	
	@Override
	public String toString()
	{
		return getD() + "/" + getM() + "/" + getA();

	}
	
}
