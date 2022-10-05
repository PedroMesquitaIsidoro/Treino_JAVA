import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 0;
		while(n != 0)
		{
			k = (n-1)/2;
			System.out.printf("%d - %d%n", ((k+1)*(k+1)), (k*k) );
			n = sc.nextInt();
		}
		sc.close();

	}

}
