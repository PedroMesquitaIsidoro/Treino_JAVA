package application;

import java.util.Locale;
import java.util.Scanner;

import entitites.Products;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Products product = new Products();
		
		System.out.printf("Entre com os dados do produto:\n");
		System.out.printf("Nome: ");
		product.name = sc.nextLine();
		System.out.printf("Preco: ");
		product.price = sc.nextDouble();
		System.out.printf("Quantidade em estoque: ");
		product.quantity = sc.nextInt();
		System.out.println();
		System.out.println("Dados do produto: " + product.toString());
		
		System.out.println("Entre com o número de produtos pra ser adicionado no estoque:");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Dados atualizados: " + product.toString());
		
		System.out.println("Entre com o número de produtos pra ser removido no estoque:");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Dados atualizados: " + product.toString());
		
		
		
		
		sc.close();
	}

}
