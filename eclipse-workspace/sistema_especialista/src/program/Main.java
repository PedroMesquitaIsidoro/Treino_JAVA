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
		int C = 1;
		int D = 1;
		int E = 1;
		int G = 1;
		int H = 1;
		int K = 1;
		listaBaseVerdadeiro.add(A);
		listaBaseVerdadeiro.add(C);
		listaBaseVerdadeiro.add(D);
		listaBaseVerdadeiro.add(E);
		listaBaseVerdadeiro.add(G);
		listaBaseVerdadeiro.add(H);
		listaBaseVerdadeiro.add(K);
		
		int B = 0;
		int F = 0;
		int I = 0;
		int J = 0;
		int L = 0;
		int M = 0;
		int N = 0;
		int O = 0;
		int P = 0;
		int R = 0;
		int S = 0;
		
		int Q = 0;
		
		System.out.printf("REGRAS:\n"
				+ "REGRA 1 - (K & L & M) -> I\n"
				+ "REGRA 2 - (I & L & J) -> Q\n"
				+ "REGRA 3 - (C & D & E) -> B\n"
				+ "REGRA 4 - ( A & B ) -> Q\n"
				+ "REGRA 5 - (L & N & O & P ) -> Q\n"
				+ "REGRA 6 - (C & H) -> R\n"
				+ "REGRA 7 - (R & J & M) -> S\n"
				+ "REGRA 8 - (F & H ) -> B \n"
				+ "REGRA 9 - G -> F \n");
		
		System.out.printf("BASE DE FATOS:\n"
				+ "A\n"
				+ "C\n"
				+ "D\n"
				+ "E\n"
				+ "G\n"
				+ "H\n"
				+ "K\n");
		
		while(Q == 0) {
			
			// REGRAS
			if(verifica(K , L, M, listaBaseVerdadeiro) == 1) { // REGRA 1
				System.out.println("---------entrei na regra 1----------\n");
				System.out.println("----------REGRA 1 - (K & L & M) -> I---------\n");
				I = 1;
				listaBaseVerdadeiro.add(I);
			}
			
			if(verifica(I , L, J, listaBaseVerdadeiro) == 1) { // REGRA 2
				System.out.println("---------entrei na regra 2----------\n");
				System.out.println("----------REGRA 2 - (I & L & J) -> Q---------\n");
				Q = 1;
				listaBaseVerdadeiro.add(Q);
			}
			
			if(verifica(C , D, E, listaBaseVerdadeiro) == 1) { // REGRA 3
				System.out.println("---------entrei na regra 3----------\n");
				System.out.println("----------REGRA 3 - (C & D & E) -> B---------\n");
				B = 1;
				listaBaseVerdadeiro.add(B);
			}
			
			if(verifica2(A , B, listaBaseVerdadeiro) == 1) {   //  REGRA 4
				System.out.println("---------entrei na regra 4----------\n");
				System.out.println("----------REGRA 4 - ( A & B ) -> Q---------\n");
				Q = 1;
				listaBaseVerdadeiro.add(Q);
				System.out.println("---------Q EH VERDADEIRO----------\n");
				break;
			}
			
			if(verifica3(L , N, O, P, listaBaseVerdadeiro) == 1) {   //  REGRA 5
				System.out.println("---------entrei na regra 5----------\n");
				System.out.println("----------REGRA 5 - (L & N & O & P ) -> Q---------\n");
				Q = 1;
				listaBaseVerdadeiro.add(Q);
				System.out.println("---------Q EH VERDADEIRO----------\n");
				break;
			}
			
			if(verifica2(C , H, listaBaseVerdadeiro) == 1) {   //  REGRA 6
				System.out.println("---------entrei na regra 6----------\n");
				System.out.println("----------REGRA 6 - (C & H) -> R---------\n");
				R = 1;
				listaBaseVerdadeiro.add(R);
			}
			
			if(verifica(R , J, M, listaBaseVerdadeiro) == 1) {   //  REGRA 7
				System.out.println("---------entrei na regra 7----------\n");
				System.out.println("----------REGRA 7 - (R & J & M) -> S---------\n");
				S = 1;
				listaBaseVerdadeiro.add(S);
			}
			
			if(verifica2(F , H, listaBaseVerdadeiro) == 1) {   //  REGRA 8
				System.out.println("---------entrei na regra 8----------\n");
				System.out.println("----------REGRA 8 - (F & H ) -> B ---------\n");
				B = 1;
				listaBaseVerdadeiro.add(S);
			}
			
			if(verifica4(G, listaBaseVerdadeiro) == 1) {   //  REGRA 9
				System.out.println("---------entrei na regra 9----------\n");
				System.out.println("----------REGRA 9 - G -> F---------\n");
				F = 1;
				listaBaseVerdadeiro.add(F);
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
