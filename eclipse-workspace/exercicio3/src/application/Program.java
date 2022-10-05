package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Estudante;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Estudante estudante = new Estudante();
		
		estudante.nome = sc.nextLine();
		estudante.nota1 = sc.nextDouble();
		estudante.nota2 = sc.nextDouble();
		estudante.nota3 = sc.nextDouble();
		
		System.out.println(estudante.aprovacao());
			
		sc.close();
	}
}
