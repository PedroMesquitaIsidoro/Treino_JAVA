package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
				
		Scanner sc = new Scanner(System.in);
		
		Conta conta;
		
		System.out.print("Enter account number: ");
		int numeroDaConta = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)?");
	    char caractere = sc.next().charAt(0);		
		if(caractere == 'y') {
			System.out.print("Enter initial deposit value:");
			double saldo = sc.nextDouble();
			conta = new Conta(numeroDaConta, nome, saldo);
		}
		else{
			conta = new Conta(numeroDaConta, nome);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println("Account: " + conta);
		
		System.out.print("Enter a deposit value: ");
		double deposito = sc.nextDouble();
		conta.addValor(deposito);
		
		System.out.println();
		System.out.println("Update Account data:");
		System.out.println("Update Account: " + conta);
		
		System.out.print("Enter a withdraw value: ");
		double saque = sc.nextDouble();
		conta.retValor(saque);
		
		System.out.println();
		System.out.println("Update Account data:");
		System.out.println("Update Account: " + conta);
	
	}

}
