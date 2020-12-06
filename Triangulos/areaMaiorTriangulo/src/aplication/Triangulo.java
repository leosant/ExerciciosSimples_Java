package aplication;

public class Triangulo {
	private Double ladoA;
	private Double ladoB;
	private Double ladoC;
	
	public Triangulo() {
		
	}
	
	public Triangulo(Double ladoA, Double ladoB, Double ladoC) {
		this.setLadoA(ladoA);
		this.setLadoB(ladoB);
		this.setLadoC(ladoC);
	}
	
	public Double getLadoA() {
		return ladoA;
	}
	public void setLadoA(Double ladoA) {
		this.ladoA = ladoA;
	}
	public Double getLadoB() {
		return ladoB;
	}
	public void setLadoB(Double ladoB) {
		this.ladoB = ladoB;
	}
	public Double getLadoC() {
		return ladoC;
	}
	public void setLadoC(Double ladoC) {
		this.ladoC = ladoC;
	}
	
	public Double calculoArea() {
		Double p = (getLadoA() + getLadoB() + getLadoC())/2;
		Double area = Math.sqrt(p*(p-getLadoA())*(p-getLadoB())*(p-getLadoC()));
		return area;
	}
	
	public void compareteTriangulo(Triangulo triangulo1, Triangulo triangulo2) {
		
		if(triangulo1.calculoArea() > triangulo2.calculoArea()) {
			System.out.println("Triangulo 1 é maior");
		}else {
			System.out.println("Triangulo 2 é maior");
		}
		
	}
	
	
}
