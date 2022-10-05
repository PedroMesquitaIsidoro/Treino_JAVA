package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Funcionario funcionario = new Funcionario();
		System.out.printf("Nome: ");
		Scanner sc = new Scanner(System.in);
		funcionario.nome = sc.nextLine();
		
		System.out.printf("Salario Bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		
		System.out.printf("Imposto: ");
		funcionario.imposto = sc.nextDouble();
		
		System.out.println(funcionario.toString());
		
		System.out.printf("Quanto de porcentagem incrementar no salario?: ");
		double taxa = sc.nextDouble();
		funcionario.incrementoSalario(taxa);
		
		System.out.println("atualizacao: " +funcionario.toString());	
		
		sc.close();
	}

}
