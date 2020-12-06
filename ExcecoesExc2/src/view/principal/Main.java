package view.principal;

import model.entidades.Conta;
import model.exceptions.ExceptionApp;
import model.ferramentas.Config;

public class Main {

	public static void main(String[] args) {
		
		Conta c1;
		
		try {
			
			System.out.println("Entre com os dados da conta: ");
			System.out.print("Conta: ");
			Integer numConta = Config.input.nextInt();
			
			System.out.print("Operador: ");
			Config.input.nextLine();
			String usuario = Config.input.nextLine();
			
			System.out.print("Deposito inicial: ");
			Double deposito = Config.input.nextDouble();
			
			System.out.print("Limite de saque: ");
			Double limite = Config.input.nextDouble();
			
			c1 = new Conta(numConta, usuario, deposito, limite);
			
			System.out.println("Entre com o valor que deseja sacar: ");
			Double montante = Config.input.nextDouble();
			c1.saque(montante);
			
			System.out.println("Novo deposito: ");
			Double valorDep = Config.input.nextDouble();
			c1.deposito(valorDep);
			
		}catch(ExceptionApp e) {
			System.out.println("Exceção: "+ e.getMessage());
		}catch(Exception e) {
			System.out.println("Ocorreu uma exceção");
		}finally {
			System.out.println("Fim da applicação");
		}
		
	}

}
