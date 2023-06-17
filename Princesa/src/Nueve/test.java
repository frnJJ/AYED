package Nueve;

public class test {

	public static void main(String[] args) {
		ArbolGeneral<Character> A = new ArbolGeneral<Character>('A');
		ArbolGeneral<Character> B = new ArbolGeneral<Character>('B');
		ArbolGeneral<Character> C = new ArbolGeneral<Character>('C');
		ArbolGeneral<Character> D = new ArbolGeneral<Character>('D');
		ArbolGeneral<Character> E = new ArbolGeneral<Character>('E');
		ArbolGeneral<Character> F = new ArbolGeneral<Character>('F');
		ArbolGeneral<Character> G = new ArbolGeneral<Character>('G');
		ArbolGeneral<Character> H = new ArbolGeneral<Character>('H');
		ArbolGeneral<Character> I = new ArbolGeneral<Character>('I');
		
		
		
		A.agregarHijo(B);
		A.agregarHijo(C);
		A.agregarHijo(D);
		
		B.agregarHijo(E);
		
		C.agregarHijo(F);
		C.agregarHijo(G);
		
		F.agregarHijo(H);
		F.agregarHijo(I);
		
		
		Parcial p = new Parcial();
		
		
		System.out.println(p.caminosPares(A));
		

	}

}
