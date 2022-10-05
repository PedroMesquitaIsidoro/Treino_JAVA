package application;

import java.util.Locale;
import java.util.Scanner;

import util.ConverterMoeda;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual eh o valor do dolar?");
		double dolar = sc.nextDouble();
		System.out.println("Qual quantida vc vai comprar?");
		double qtd = sc.nextDouble();
		
		System.out.printf("VOCE VAI PAGAR %.2f em reais\n", ConverterMoeda.converte(dolar, qtd));
		
		sc.close();

	}

}
