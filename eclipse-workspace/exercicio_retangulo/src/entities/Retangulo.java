package entities;

public class Retangulo {
	public double altura;
	public double largura;
	
	public double area(){
		return altura * largura;
	}
	
	public double perimetro() {
		return (2*altura) + (2 * largura);
	}
	
	public double diagonal() {
		return Math.sqrt((largura*largura) + (altura * altura));
	}
	
	public String toString() {
		return "AREA = " + String.format("%.2f", area()) + "\n" + 
				"PERIMETER = " + String.format("%.2f", perimetro() ) + "\n" +
				"DIAGONAL = " + String.format("%.2f", diagonal()) + "\n";
	}

}
