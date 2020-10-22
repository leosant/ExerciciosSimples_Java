package br.com.ferramentas;
import java.util.Scanner;

/*Está classe serve como suporte para aplicações que necessitem de valores
de entrada do usuário*/
public class Leitor {
	
    protected static Scanner scanner = new Scanner(System.in);

	public static String lerString(String msg) {
        System.out.println(msg);
        return lerString();
    }

    public static String lerString() {
		return scanner.next();
    }

    public static char lerCaracter(String msg) {
        System.out.println(msg);
        return lerCaracter();
    }

    public static char lerCaracter() {
        return scanner.next().charAt(0);
    }

    public static int lerInt(String msg) {
        System.out.println(msg);
        return lerInt();
    }

    public static int lerInt() {
        return scanner.nextInt();
    }

    public static double lerDoubles(String msg) {
        System.out.println(msg);
        return lerDoubles();
    }

    public static double lerDoubles() {
        return scanner.nextDouble();
    }
}
