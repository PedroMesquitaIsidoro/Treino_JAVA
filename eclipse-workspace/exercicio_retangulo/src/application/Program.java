package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Retangulo retangulo = new Retangulo();
		System.out.printf("Enter rectangle width and height\n");
		Scanner sc = new Scanner(System.in);
		
		retangulo.altura = sc.nextDouble();
		retangulo.largura = sc.nextDouble();
		
		System.out.println(retangulo.toString());
		sc.close();
	}

}
