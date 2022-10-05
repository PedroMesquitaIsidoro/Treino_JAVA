package entities;

public class Funcionario {
	
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void incrementoSalario(double taxa) {
		salarioBruto = (salarioBruto *((taxa/100)+1));
	}
	
	public String toString() {
		return "Funcionario: " + nome + ", $ " + String.format("%.2f", salarioLiquido() );
	}

}
