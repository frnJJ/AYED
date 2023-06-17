package tp04_ag.src.tp04.ejercicio1;

import Tp3.ArbolBinario;

public class main {

	public static void main(String[] args) {
		
		
	/*	ArbolGeneral<Integer> M = new ArbolGeneral<Integer>(14);
		ArbolGeneral<Integer> J = new ArbolGeneral<Integer>(13);
		ArbolGeneral<Integer> K= new ArbolGeneral<Integer>(25);
		ArbolGeneral<Integer> L = new ArbolGeneral<Integer>(10);
		ArbolGeneral<Integer> A = new ArbolGeneral<Integer>(4);
		ArbolGeneral<Integer> B = new ArbolGeneral<Integer>(7);
		ArbolGeneral<Integer> C = new ArbolGeneral<Integer>(5);
		ArbolGeneral<Integer> D = new ArbolGeneral<Integer>(6);
		ArbolGeneral<Integer> E = new ArbolGeneral<Integer>(10);
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
		
		ArbolBinario<Integer> p = new ArbolBinario<Integer>(10);
		ArbolBinario<Integer> z = new ArbolBinario<Integer>(1);
		ArbolBinario<Integer> g = new ArbolBinario<Integer>(2);
		ArbolBinario<Integer> u = new ArbolBinario<Integer>(3);
		ArbolBinario<Integer> o = new ArbolBinario<Integer>(4);
		ArbolBinario<Integer> a = new ArbolBinario<Integer>(5);
		ArbolBinario<Integer> b = new ArbolBinario<Integer>(6);
		ArbolBinario<Integer> t = new ArbolBinario<Integer>(6);
		ArbolBinario<Integer> s = new ArbolBinario<Integer>(6);
		
		p.agregarHijoDerecho(g);
		p.agregarHijoIzquierdo(z);
		g.agregarHijoIzquierdo(o);
		o.agregarHijoIzquierdo(t);
		z.agregarHijoIzquierdo(u);
		u.agregarHijoIzquierdo(a);
		u.agregarHijoDerecho(b);
		b.agregarHijoDerecho(s);
		
		
		
		Parcial2 pa = new Parcial2();
		System.out.println(pa.procesar(p, 2));

		

	}

}
