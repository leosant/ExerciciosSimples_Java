package TreinandoThread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Teste {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public static void main(String[] args) {
		
			
		
			System.out.println("Relógio com thread: "+ sdf.format(new Date()));
			System.out.println();
			
			//ThreadMinuto tM = new ThreadMinuto();
			ThreadSegundos tS = new ThreadSegundos();
			//System.out.println(tS.run());
		
	}
}
