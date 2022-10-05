
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String original = "Pedro hEnRique MesQUITA isidOro";
		String s1 = original.toLowerCase(); // deixa tudo minúsculo
		System.out.printf("%s\n", s1);
		
		String s2 = original.toUpperCase(); // deixa tudo maiusculo
		System.out.printf("%s\n", s2);
		
		String[] vect = s2.split(" "); // split permite cortar as palavras de uma string em um vetor
		System.out.printf("%s\n", vect[0]);
		System.out.printf("%s\n", vect[1]);
		System.out.printf("%s\n", vect[2]);

	}

}
