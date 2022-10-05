package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		System.out.println("---------Sistema especialista----------\n");
		System.out.println("---------USANDO MODUS PONES----------\n");
		List<Integer> listaBaseVerdadeiro = new ArrayList<>();
		//BASE DE FATOS
		int A = 1;
		int B = 1;
		int F = 1;
		listaBaseVerdadeiro.add(A);
		listaBaseVerdadeiro.add(B);
		listaBaseVerdadeiro.add(F);
		
		int C = 0;
		int D = 0;
		int E = 0;
		int G = 0;
		int H = 0;
		int I = 0;
		
		System.out.printf("REGRAS:\n"
				+ "REGRA 1 - A ^ B -> C\n"
				+ "REGRA 2 - A -> D\n"
				+ "REGRA 3 - C ^ D -> E\n"
				+ "REGRA 4 - B ^ E ^ F -> G\n"
				+ "REGRA 5 - A ^ E -> H\n"
				+ "REGRA 6 - D ^ E ^ H -> I\n");
		
		System.out.printf("BASE DE FATOS:\n"
				+ "A\n"
				+ "B\n"
				+ "F\n");
		
		while(H == 0) {
			
			// REGRAS
			if(verifica2(A , B, listaBaseVerdadeiro) == 1) { // REGRA 1
				System.out.println("---------entrei na regra 1----------\n");
				System.out.println("----------REGRA 1 - A ^ B -> C---------\n");
				C = 1;
				listaBaseVerdadeiro.add(C);
			}
			
			if(verifica4(A, listaBaseVerdadeiro) == 1) { // REGRA 2
				System.out.println("---------entrei na regra 2----------\n");
				System.out.println("----------REGRA 2 - A -> D---------\n");
				D = 1;
				listaBaseVerdadeiro.add(D);
			}
			
			if(verifica2(C , D, listaBaseVerdadeiro) == 1) { // REGRA 3
				System.out.println("---------entrei na regra 3----------\n");
				System.out.println("----------REGRA 3 - C ^ D -> E---------\n");
				E = 1;
				listaBaseVerdadeiro.add(E);
			}
			
			if(verifica(B , E, F, listaBaseVerdadeiro) == 1) {   //  REGRA 4
				System.out.println("---------entrei na regra 4----------\n");
				System.out.println("----------REGRA 4 - B ^ E ^ F -> G---------\n");
				G = 1;
				listaBaseVerdadeiro.add(G);
			}
			
			if(verifica2(A, E, listaBaseVerdadeiro) == 1) {   //  REGRA 5
				System.out.println("---------entrei na regra 5----------\n");
				System.out.println("----------REGRA 5 - A ^ E -> H---------\n");
				H = 1;
				listaBaseVerdadeiro.add(H);
				System.out.println("---------H EH VERDADEIRO----------\n");
				break;
			}
			
			if(verifica(D , E, H, listaBaseVerdadeiro) == 1) {   //  REGRA 6
				System.out.println("---------entrei na regra 6----------\n");
				System.out.println("----------REGRA 6 - D ^ E ^ H -> I---------\n");
				I = 1;
				listaBaseVerdadeiro.add(I);
			}
		}
		}
			
	
	// ######################################## Metodo para tres elementos no lado esquerdo
	public static int verifica(int K, int L, int M, List<Integer> listaBaseVerdadeiro) {
		int cont = 0;
		for(int i = 0; i < listaBaseVerdadeiro.size(); i++) {
			if(listaBaseVerdadeiro.get(i) == K) {
				cont = cont + 1;
				K = 0;
			}
			if(listaBaseVerdadeiro.get(i) == L) {
				cont = cont + 1;
				L = 0;
			}
			if(listaBaseVerdadeiro.get(i) == M) {
				cont = cont + 1;
				M = 0;
			}
		}
		if(cont == 3) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	// ############################################# FIM DO METODO PARA TRES ELEMENTOS
	// ######################################## Metodo para DOIS elementos no lado esquerdo
	public static int verifica2(int K, int L, List<Integer> listaBaseVerdadeiro) {
		int cont = 0;
		for(int i = 0; i < listaBaseVerdadeiro.size(); i++) {
			if(listaBaseVerdadeiro.get(i) == K) {
				cont = cont + 1;
				K = 0;
			}
			if(listaBaseVerdadeiro.get(i) == L) {
				cont = cont + 1;
				L = 0;
			}
		}
		if(cont == 2) {
			return 1;
		}
		else {
			return 0;
		}
	}
	// ############################################# FIM DO METODO PARA DOIS ELEMENTOS
	// ######################################## Metodo para QUATRO elementos no lado esquerdo
	public static int verifica3(int K, int L, int M, int Z, List<Integer> listaBaseVerdadeiro) {
		int cont = 0;
		for(int i = 0; i < listaBaseVerdadeiro.size(); i++) {
			if(listaBaseVerdadeiro.get(i) == K) {
				cont = cont + 1;
				K = 0;
			}
			if(listaBaseVerdadeiro.get(i) == L) {
				cont = cont + 1;
				L = 0;
			}
			if(listaBaseVerdadeiro.get(i) == M) {
				cont = cont + 1;
				M = 0;
			}
			if(listaBaseVerdadeiro.get(i) == Z) {
				cont = cont + 1;
				Z = 0;
			}
		}
		if(cont == 4) {
			return 1;
		}
		else {
			return 0;
		}
	}
	// ############################################# FIM DO METODO PARA QUATRO ELEMENTOS
	// ######################################## Metodo para um elemento no lado esquerdo
	public static int verifica4(int G, List<Integer> listaBaseVerdadeiro) {
		int cont = 0;
		for(int i = 0; i < listaBaseVerdadeiro.size(); i++) {
			if(listaBaseVerdadeiro.get(i) == G) {
				cont = cont + 1;
				G = 0;
			}
		}
		if(cont == 1) {
			return 1;
		}
		else {
			return 0;
		}
	}
	// ############################################# FIM DO METODO PARA um ELEMENTO

}
