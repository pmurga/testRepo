package Hora;
/**
 * 
 * 
6.
a) Implemente la clase Hora que contenga miembros datos separados para
almacenar horas, minutos y segundos. Un constructor inicializará estos datos en
0 y otro a valores dados. Una función miembro deberá visualizar la hora en
formato hh:mm:ss. Otra función miembro sumará dos objetos de tipo hora,
retornando la hora resultante. Realizar otra versión de la suma que asigne el
resultado de la suma en el primer objeto hora.
b) Programar un procedimiento main(), que cree dos horas inicializadas y uno que
no lo esté. Se deberán sumar los dos objetos inicializados, dejando el resultado
en el objeto no inicializado. Por último, se pide visualizar el valor resultante.
 *
*/

public class Hora 
{

	Integer hr;
	Integer min;
	Integer seg;

	public Hora() 
	{
		
	}
	
	
	public void initHora() 
	{
		
		hr = 00;
		min = 00;
		seg = 00;
		
	}
	
	public void initHora(Integer x, Integer y, Integer z) 
	{
	
		hr = x;
		min = y;
		seg = z;
		corregirHora();	
		
	/*	
		Boolean error = true;
		
		if (x <= 23 && x >= 0 ) 
		{
		
			if (y >= 0 && y <= 59)
			{
				if (z >= 0 && y <= 59) 
				{
					
						hr = x;
						min = y;
						seg = z;
						error = false;
						
				}
				
			}		
		 }
		
		if (error == true)
		{
			System.out.println("Valores validos: HR(0-23), MIN(0-59), SEG(0-59)");
			corregirHora();
		}
	*/	
	}
    
	private void corregirHora()
	{
		if (seg < 0)
		{
			seg = 0;
		} else 
		{
			if (seg > 59) 
			{
				seg -= 60;
				min += 1;
			}
		}
		
		if (min < 0)
		{
			min = 0;
		} else {
			if (min > 59)
			{
				min -= 60;
				hr += 1;
			}
		}
		
		if (hr < 0)
		{
			hr = 0;
		} else
		{
			if (hr > 23)
			{
				hr = hr - 24;
			}
		}
		
		
	}
	
	private String formatoHR(Integer x, Integer y, Integer z)
	{
		String mensaje;
		
		
		if (x <= 9)
		{
			mensaje = "0" + x + ":";
		}else
		{
			mensaje = Integer.toString(x) + ":";
		}
		
		if (y <= 9)
		{
			mensaje = mensaje + "0" + y + ":";
		}else
		{
			mensaje = mensaje + y + ":";
		}
		
		if (z <= 9)
		{
			mensaje = mensaje + "0" + z;
		}else
		{
			mensaje = mensaje + z;
		}
		
		return mensaje;
	}
	
	
	public void getHora() 
	{
		
		String output = formatoHR(hr, min, seg); 
		
		System.out.println(output);
		
	} 
		
	/*
	 * @Override --> Sobrecarga de un metodo heredado de super clase Object
	 * public String toString()
	 * {
	 * 
	 * 		return "Hora " + String.format("%02d, hr) + ":" + min + ":" + seg;
	 * 
	 * }
	 * 
	*/
	
	public void sumar(Hora h2)
	{
		seg += h2.seg;
		min += h2.min;
		hr += h2.hr;
		corregirHora();
	}
	
	
	public static Hora sumar(Hora h1, Hora h2)
	{
		Hora h3 = new Hora();
		h3.clone(h1);
		h3.sumar(h2);
		
		return h3;
		
	}
	
	public void clone(Hora h)
	{
		seg = h.seg;
		min = h.min;
		hr = h.hr;
	}
	
}

