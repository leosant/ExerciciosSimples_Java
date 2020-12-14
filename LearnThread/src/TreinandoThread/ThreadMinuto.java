package TreinandoThread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadMinuto extends Thread{
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("mm");
	
	public ThreadMinuto() {
		start();
	}
	
	public void run() {
		try {
			for(int i = 0; i < 60; i++) {
				System.out.print(sdf.format(new Date()));
				
				System.out.println();
				Thread.sleep(60000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Fim da execução da Thread de minutos");
		}
	}

}
