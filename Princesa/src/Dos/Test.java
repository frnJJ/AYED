package Dos;

public class Test {

	public static void main(String[] args) {
		
		ArbolGeneral<Integer> CERO = new ArbolGeneral<Integer>(0);
		ArbolGeneral<Integer> A = new ArbolGeneral<Integer>(50);
		ArbolGeneral<Integer> C= new ArbolGeneral<Integer>(12);
		ArbolGeneral<Integer> N = new ArbolGeneral<Integer>(10);
		ArbolGeneral<Integer> M = new ArbolGeneral<Integer>(40);
		ArbolGeneral<Integer> N0 = new ArbolGeneral<Integer>(10);
		ArbolGeneral<Integer> A0 = new ArbolGeneral<Integer>(50);
		ArbolGeneral<Integer> O = new ArbolGeneral<Integer>(80);
		ArbolGeneral<Integer> A1 = new ArbolGeneral<Integer>(50);
		ArbolGeneral<Integer> A2 = new ArbolGeneral<Integer>(50);
		ArbolGeneral<Integer> S = new ArbolGeneral<Integer>(5);
		ArbolGeneral<Integer> E = new ArbolGeneral<Integer>(20);
		ArbolGeneral<Integer> L = new ArbolGeneral<Integer>(30);
		ArbolGeneral<Integer> N1 = new ArbolGeneral<Integer>(10);
		ArbolGeneral<Integer> F = new ArbolGeneral<Integer>(35);
		ArbolGeneral<Integer> T = new ArbolGeneral<Integer>(5);
		ArbolGeneral<Integer> A3 = new ArbolGeneral<Integer>(50);
		ArbolGeneral<Integer> A4 = new ArbolGeneral<Integer>(50);
		ArbolGeneral<Integer> S0 = new ArbolGeneral<Integer>(22);
	
		
		CERO.agregarHijo(A);
		CERO.agregarHijo(C);
		CERO.agregarHijo(N);
		CERO.agregarHijo(M);
		
		A.agregarHijo(N0);
		
		N0.agregarHijo(A1);
		N0.agregarHijo(A2);
		
		A2.agregarHijo(L);
		L.agregarHijo(T);
		
		T.agregarHijo(A4);
		C.agregarHijo(A0);
		
		A0.agregarHijo(S);
		
		S.agregarHijo(N1);
		
		S.agregarHijo(F);
		
		F.agregarHijo(A3);
		
		A3.agregarHijo(S0);
		
		N.agregarHijo(O);
		
		O.agregarHijo(E);
	
		
		
		
		
		
		/*
		ListaGenerica<ArbolGeneral<Integer>> h= new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();
		h.agregarFinal(A);
		h.agregarFinal(C);
		h.agregarFinal(N);
		h.agregarFinal(M);
		
		CERO.setHijos(h);
		
		
		ListaGenerica<ArbolGeneral<Integer>> h2= new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();
		
		h2.agregarFinal(N0);
		
		
		A.setHijos(h2);
		
		
		ListaGenerica<ArbolGeneral<Integer>> h3= new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();
		
		h3.agregarFinal(A1);
		h3.agregarFinal(A2);
		
		N0.setHijos(h3);
		
		ListaGenerica<ArbolGeneral<Integer>> h4= new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();
		
		h4.agregarFinal(L);
		
		A0.setHijos(h4);
		
		ListaGenerica<ArbolGeneral<Integer>> h5= new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();
		
		h5.agregarFinal(T);
		
		L.setHijos(h5);
		
		ListaGenerica<ArbolGeneral<Integer>> h6= new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();
		
		h6.agregarFinal(A3);
		
		T.setHijos(h6);
		
		ListaGenerica<ArbolGeneral<Integer>> h7= new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();
		
		h7.agregarFinal(A0);
		
		C.setHijos(h7);
		
		ListaGenerica<ArbolGeneral<Integer>> h8= new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();
		
		h8.agregarFinal(S);
		
		A0.setHijos(h8);
		
		ListaGenerica<ArbolGeneral<Integer>> h9= new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();
		
		h9.agregarFinal(N1);
		h9.agregarFinal(F);
		
		S.setHijos(h9);
		
		ListaGenerica<ArbolGeneral<Integer>> hA= new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();
		hA.agregarFinal(A3);
		
		F.setHijos(hA);
		
		ListaGenerica<ArbolGeneral<Integer>> hB= new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();
		
		hB.agregarFinal(S0);
		
		A3.setHijos(hB);
		
		ListaGenerica<ArbolGeneral<Integer>> hC= new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();
		
		hC.agregarFinal(O);
		
		N.setHijos(hC);
		
		ListaGenerica<ArbolGeneral<Integer>> hD= new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();
		
		hD.agregarFinal(E);
		
		O.setHijos(hD);
		
		*/
		
		Parcial tst = new Parcial();
		System.out.println(tst.contar1(CERO, 110));
		
		
		
		
		

	}

}
