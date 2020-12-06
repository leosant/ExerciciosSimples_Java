package aplication;

public class Main {

	public static void main(String[] args) {

		
		Triangulo triangulo1 = new Triangulo(10.0, 10.0, 5.0);
		Triangulo triangulo2 = new Triangulo(10.0, 8.0, 7.0);
		Triangulo printTriangulo = new Triangulo();
		
		System.out.println("Triangulo 1 "+ triangulo1.calculoArea());
		System.out.println("Triangulo 2 "+ triangulo2.calculoArea());
		
		printTriangulo.compareteTriangulo(triangulo1, triangulo2);
		
	}

}
