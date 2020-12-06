package view.principal;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import model.entidades.Reserva;
import model.excecao.DominioExcecao;

public class Main {

	private static Scanner teclado;

	public static void main(String[] args) {

		teclado = new Scanner(System.in);
		Reserva res = null;

		try {
			System.out.println("Número do quarto: ");
			Integer numQuarto = teclado.nextInt();
			System.out.println("Check-in date (dd/MM/yyyy)");
			teclado.nextLine();
			Date checkin = Reserva.format.parse(teclado.nextLine());
			System.out.println("Check-out date (dd/MM/yyyy)");
			Date checkout = Reserva.format.parse(teclado.nextLine());

			res = new Reserva(numQuarto);
			res.atulizarDatas(checkin, checkout);

			System.out.println(res.toString());

		} catch (NullPointerException e) {
			System.out.println("(IO)Exceção ocorreu pontos nulos");
		} catch (ParseException e) {
			System.out.println("Data Inválida");
		} catch (DominioExcecao e) {
			System.out.println("Exceção na regra de negócio: "+ e.getMessage());
		}catch (Exception e) {
			System.out.println("Error inesperado!");
		}
		finally {
			System.out.println("Fim\n\n");
		}
	}

}
