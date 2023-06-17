package Tres;

public class Test {

	public static void main(String[] args) {
		
		
		ArbolGeneral<Integer> M = new ArbolGeneral<Integer>(2);
		ArbolGeneral<Integer> J = new ArbolGeneral<Integer>(1);
		ArbolGeneral<Integer> K= new ArbolGeneral<Integer>(12);
		ArbolGeneral<Integer> L = new ArbolGeneral<Integer>(14);
		ArbolGeneral<Integer> A = new ArbolGeneral<Integer>(5);
		ArbolGeneral<Integer> B = new ArbolGeneral<Integer>(4);
		ArbolGeneral<Integer> C = new ArbolGeneral<Integer>(8);
		ArbolGeneral<Integer> D = new ArbolGeneral<Integer>(4);
		ArbolGeneral<Integer> E = new ArbolGeneral<Integer>(7);
		ArbolGeneral<Integer> F = new ArbolGeneral<Integer>(9);
		ArbolGeneral<Integer> G = new ArbolGeneral<Integer>(10);
		ArbolGeneral<Integer> H = new ArbolGeneral<Integer>(5);
		ArbolGeneral<Integer> I = new ArbolGeneral<Integer>(3);
		ArbolGeneral<Integer> Z = new ArbolGeneral<Integer>(13);
	
		K.agregarHijo(I);
		
		E.agregarHijo(Z);
		B.agregarHijo(F);
		B.agregarHijo(G);
		B.agregarHijo(H);
		
		
		C.agregarHijo(I);
		ListaGenerica<ArbolGeneral<Integer>> h= new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();
		h.agregarFinal(J);
		h.agregarFinal(K);
		h.agregarFinal(L);
		
		
		
		ListaGenerica<ArbolGeneral<Integer>> h2= new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();
		
		h2.agregarFinal(A);
		h2.agregarFinal(B);
		
		
		J.setHijos(h2);
		
		
		ListaGenerica<ArbolGeneral<Integer>> h3= new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();
		
		h3.agregarFinal(C);
		h3.agregarFinal(D);
		h3.agregarFinal(E);
		
		K.setHijos(h3);
		
		
		
		M.setHijos(h);
		
		
		Parcial p = new Parcial();
		p.setArbol(M);
		ListaGenerica<Integer> l = p.resolver();
		
		
		
		l.comenzar();
		while (! l.fin()) {
			System.out.println(l.proximo());
		}
		
	}

}
