package TreinandoThread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadSegundos extends Thread{
	
	private ThreadMinuto tM = new ThreadMinuto();
	public static SimpleDateFormat sdf = new SimpleDateFormat("ss");
	
	public ThreadSegundos() {
		start();
	}
	
	public void run() {
		//Interação de um minuto
		try {
			for(int i = 0; i < 100; i++) {
				sdf.format(new Date());
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}
	}
}
