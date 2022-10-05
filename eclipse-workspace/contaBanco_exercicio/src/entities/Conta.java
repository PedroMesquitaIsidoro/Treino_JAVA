package entities;

public class Conta {
	
	private int numeroDaConta;
	private String nome;
	private double saldo;
	
	public Conta() {
		
	}
	
	
	public Conta(int numeroDaConta, String nome) {
		this.numeroDaConta = numeroDaConta;
		this.nome = nome;
	}
	
	public Conta(int numeroDaConta, String nome, double saldo) {
		this.numeroDaConta = numeroDaConta;
		this.nome = nome;
		this.saldo = saldo;
	}


	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getsaldo() {
		return saldo;
	}
	
	public void addValor(double deposito) {
		saldo = saldo + deposito;
	}
	
	public void retValor(double saque) {
		saldo = saldo - saque - 5.00;
	}
	
	public String toString() {
		return numeroDaConta + ", Holder: " + nome + ", Balance: $ " + String.format("%.2f", saldo) + "\n";
	}

}


