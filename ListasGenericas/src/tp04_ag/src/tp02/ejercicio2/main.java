package tp04_ag.src.tp02.ejercicio2;

import Tp3.ArbolBinario;

public class main {

	public static void main(String[] args) {
		
	/*	AreaEmpresa e1 = new AreaEmpresa(14,"a");
		AreaEmpresa e2 = new AreaEmpresa(13,"a");
		AreaEmpresa e3 = new AreaEmpresa(25,"a");
		AreaEmpresa e4 = new AreaEmpresa(10,"a");
		AreaEmpresa e5 = new AreaEmpresa(4,"a");
		AreaEmpresa e6 = new AreaEmpresa(7,"a");
		AreaEmpresa e7 = new AreaEmpresa(5,"a");
		AreaEmpresa e8 = new AreaEmpresa(6,"a");
		AreaEmpresa e9 = new AreaEmpresa(10,"a");
		AreaEmpresa e10 = new AreaEmpresa(18,"a");
		AreaEmpresa e11 = new AreaEmpresa(9,"a");
		AreaEmpresa e12 = new AreaEmpresa(12,"a");
		AreaEmpresa e13 = new AreaEmpresa(19,"a");
	*/	
		ArbolBinario<Integer> aux = new ArbolBinario<Integer>(10);
		ArbolBinario<Integer> aux1 = new ArbolBinario<Integer>(1);
		ArbolBinario<Integer> aux2 = new ArbolBinario<Integer>(2);
		ArbolBinario<Integer> aux3 = new ArbolBinario<Integer>(3);
		ArbolBinario<Integer> aux4 = new ArbolBinario<Integer>(4);
		ArbolBinario<Integer> aux5 = new ArbolBinario<Integer>(5);
		ArbolBinario<Integer> aux6 = new ArbolBinario<Integer>(6);
		
		aux.agregarHijoDerecho(aux1);
		aux.agregarHijoIzquierdo(aux2);
		aux2.agregarHijoDerecho(aux3);
		aux2.agregarHijoIzquierdo(aux4);
		aux1.agregarHijoDerecho(aux5);
		aux1.agregarHijoIzquierdo(aux6);
		
		
		
		/*ArbolGeneral<Integer> M = new ArbolGeneral<Integer>(14);
		ArbolGeneral<Integer> J = new ArbolGeneral<Integer>(13);
		ArbolGeneral<Integer> K= new ArbolGeneral<Integer>(25);
		ArbolGeneral<Integer> L = new ArbolGeneral<Integer>(10);
		ArbolGeneral<Integer> A = new ArbolGeneral<Integer>(4);
		ArbolGeneral<Integer> B = new ArbolGeneral<Integer>(7);
		ArbolGeneral<Integer> C = new ArbolGeneral<Integer>(5);
		ArbolGeneral<Integer> D = new ArbolGeneral<Integer>(6);
		ArbolGeneral<Integer> E = new ArbolGeneral<Integer>(11);
		ArbolGeneral<Integer> F = new ArbolGeneral<Integer>(18);
		ArbolGeneral<Integer> G = new ArbolGeneral<Integer>(9);
		ArbolGeneral<Integer> H = new ArbolGeneral<Integer>(12);
		ArbolGeneral<Integer> I = new ArbolGeneral<Integer>(19);
	
		
		
		ListaGenerica<ArbolGeneral<Integer>> h= new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();
		h.agregarFinal(J);
		h.agregarFinal(K);
		h.agregarFinal(L);
		
		
		
		ListaGenerica<ArbolGeneral<Integer>> h2= new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();
		
		h2.agregarFinal(A);
		h2.agregarFinal(B);
		h2.agregarFinal(C);
		
		
		J.setHijos(h2);
		
		
		ListaGenerica<ArbolGeneral<Integer>> h3= new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();
		
		h3.agregarFinal(D);
		h3.agregarFinal(E);
		h3.agregarFinal(F);
		
		K.setHijos(h3);
		
		ListaGenerica<ArbolGeneral<Integer>> h4= new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();
		
		h4.agregarFinal(G);
		h4.agregarFinal(H);
		h4.agregarFinal(I);
		
		L.setHijos(h4);
		
		M.setHijos(h);
		*/
		
		Parcial p = new Parcial();
		
		System.out.println(p.isTwoTree(10,aux));

	}

}
