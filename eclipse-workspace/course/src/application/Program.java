package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x,y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.printf("Entre com os lados do triangulo x:\n");
		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
	
		System.out.printf("Entre com os lados do triangulo y:\n");
		
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("AREA X: %.4f\n", areaX);
		System.out.printf("AREA Y: %.4f\n", areaY);
		
		if(areaX > areaY)
		{
			System.out.printf("O triangulo X tem area maior\n");
		}
		else if(areaX == areaY)
		{
			System.out.printf("Os dois triangulos tem areas iguais\n");
		}
		else
		{
			System.out.printf("O triangulo Y tem area maior\n");
		}
		
		sc.close();

	}

}
