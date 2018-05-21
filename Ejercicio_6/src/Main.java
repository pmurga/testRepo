import java.util.*;

public class Main {

	public static void main(String[] args) {

		Hora HR1 = new Hora();
		
		HR1.initHora(24, 76, 56);
		
		HR1.getHora();
		
		Hora HR2 = new Hora();
		
		HR2.initHora(3, 32, 1);
		
		HR2.getHora();
		
		HR1.sumar(HR2);
		
		HR1.getHora();
		
	}

}
