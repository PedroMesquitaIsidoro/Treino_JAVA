import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = max(a, b, c);
		mostrarResultado(maior);
		sc.close();
	}
	
	public static int max(int x, int y, int z) {
		
		// essa funcao vai achar o maior valor entre 3 numeros
		
		if(x > y && x > z)
		{
			return x;
		}
		else if(y > z)
		{
			return y;
		}
		else {
			return z;
		}
	}
	
	public static void mostrarResultado(int x) {
		System.out.printf("O maior valor eh %d\n", x);
	}

}
