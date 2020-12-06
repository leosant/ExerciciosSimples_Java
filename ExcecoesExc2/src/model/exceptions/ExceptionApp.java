package model.exceptions;

//Tratamento de exceção estendida com runTime, não apresenta erros em tempo de compilação
public class ExceptionApp extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public ExceptionApp(String msg) {
		super(msg);
	}
}
