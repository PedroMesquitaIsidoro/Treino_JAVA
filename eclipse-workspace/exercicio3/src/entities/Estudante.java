package entities;

public class Estudante {
	
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public String aprovacao() {
		if(nota1 + nota2 + nota3 >= 60) {
			return "NOTA FINAL = " +  String.format("%.2f", notaFinal() ) + "\nAPROVADO";
		}
		else
		{
			return "NOTA FINAL = " +  String.format("%.2f", notaFinal() ) + "\nREPROVADO\n" +
					"Precisa de: " + String.format("%.2f", 60.00 - notaFinal() );
		}
	}

}
