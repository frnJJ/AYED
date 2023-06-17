package Tp3;

import tp04.ejercicio1.ArbolGeneral;

public class ProfundidadDeArbolBinario {
	private ArbolBinario<Integer> ab= new ArbolBinario<Integer>();
	private int nivel = 0;
	
	public ProfundidadDeArbolBinario() {
		ArbolBinario<Integer> ar = new ArbolBinario<Integer>(9);
		ArbolBinario<Integer> ar1 = new ArbolBinario<Integer>(22);
		ArbolBinario<Integer> ar2 = new ArbolBinario<Integer>(33);
		ArbolBinario<Integer> ar3 = new ArbolBinario<Integer>(50);
		ArbolBinario<Integer> ar4 = new ArbolBinario<Integer>(60);
		
		ar.agregarHijoDerecho(ar1);
		ar.agregarHijoIzquierdo(ar2);
		ar2.agregarHijoDerecho(ar3);
		ar2.agregarHijoIzquierdo(ar4);
		ab = ar;
		
	}
	
	private int auxiliar (ArbolBinario<Integer> a, int p) {
		ColaGenerica<ArbolBinario<Integer>> cola = new ColaGenerica<ArbolBinario<Integer>>();
		ArbolBinario<Integer> aux;
		int suma= 0;
		nivel = 0;
		cola.Encolar(a);
		cola.Encolar(null);
		while (! cola.esVacia()) {
			aux = cola.Desencolar();
			if ( aux != null) {
				if (nivel == p) {
					suma += aux.getDato();
				}
				if (aux.tieneHijoDerecho()) {
					cola.Encolar(aux.getHijoDerecho());
				}
				if (aux.tieneHijoIzquierdo()) {
					cola.Encolar(aux.getHijoIzquierdo());
				}
			}
			else {
				if (! cola.esVacia()) {
					nivel ++;
					cola.Encolar(null);
				}
			}
		}
		return suma;
		
		
	}
		
	public int sumaElementosProfundidad(int p) {
		int res = auxiliar(ab,p);
		return res;
	}
	
	public Boolean isTwoTree (int num, ArbolBinario<Integer> a) {
		ArbolBinario<Integer> aux;
		int HD = 0;
		int HI = 0;
		if (! a.esVacio()) {
			aux = buscar4(a,num);
			if ((aux != null) && (a.tieneHijoDerecho()) && (a.tieneHijoIzquierdo())){
				HD =  buscar3(a.getHijoDerecho());
				HI = buscar3(a.getHijoIzquierdo());
				return (HD == HI);
			}
			
		}
		return false;
	}
	private int buscar3 (ArbolBinario<Integer> a ) {
		int cant = 0;
		if (a.esHoja()) {
			return cant;
		}
		else {
			if (a.tieneHijoDerecho() && a.tieneHijoIzquierdo()) {
				cant ++;
			}
			if (a.tieneHijoIzquierdo()) {
				cant += buscar3(a.getHijoIzquierdo());
			}
			if (a.tieneHijoDerecho()) {
				cant += buscar3(a.getHijoDerecho());
			}
			return cant;
		}
		
	}

	private ArbolBinario<Integer> buscar4 (ArbolBinario<Integer> a, int num){
		ArbolBinario<Integer> aux = null;
		if (a.getDato() == num) {
			return a;
		}
		else {
			if (a.tieneHijoIzquierdo()) {
				aux = buscar4(a.getHijoIzquierdo(),num);
			}
			if (a.tieneHijoDerecho() && aux == null) {
				aux = buscar4(a.getHijoDerecho(),num);
			}
			return aux;
		}
	}
	
	public ListaGenerica<ListaGenerica<Character>> caminos (ArbolGeneral<Character> a ){
		ListaEnlazadaGenerica<ListaGenerica<Character>> l = new ListaEnlazadaGenerica<ListaGenerica<Character>>();
		if (a)
		aux(l,a);
	}
	
	
	
	
	
	
	
	
	
	
	
	

		
		
	

}
