package application;

import java.util.Date;

import entities.Produto;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Produto produto = new Produto(15, OrderStatus.Entregue );
		
		System.out.println(produto);
		
	}

}
