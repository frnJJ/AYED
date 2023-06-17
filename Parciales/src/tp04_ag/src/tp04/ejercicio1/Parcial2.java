package tp04_ag.src.tp04.ejercicio1;

import Tp3.ArbolBinario;

public class Parcial2 {
	
	ArbolGeneral<Integer> a;
	
	public void setArbol(ArbolGeneral<Integer> a) {
		this.a = a;
	}
	
	public ListaGenerica<Integer> resolver (){
		ListaGenerica<Integer> l = new ListaEnlazadaGenerica();
		if (! a.esVacio()) {
			aux(l,a);
		}
		return l;
	}
	
	
	private int aux (ListaGenerica<Integer> l, ArbolGeneral<Integer> a) {
		int suma = 0;
		if (a.esHoja()) {
			return a.getDato();
		}
		else {
			ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
			hijos.comenzar();
			while (! hijos.fin()) {
				suma += aux(l,hijos.proximo());
			}
			if (hijos.tamanio() % 2 == 1) {
				l.agregarFinal(suma);
			}
			
			return a.getDato();
		}
		
	}
	
	public ListaGenerica<ListaGenerica<Integer>> caminopar (ArbolGeneral<Integer> a){
		ListaGenerica<ListaGenerica<Integer>> l = new ListaEnlazadaGenerica<ListaGenerica<Integer>>();
		ListaGenerica<Integer> r = new ListaEnlazadaGenerica<Integer>();
		if (! a.esVacio()) {
			aux2(l,r,a);
		}
		return l;
	}
	
	
	private void aux2 (ListaGenerica<ListaGenerica<Integer>> l, ListaGenerica<Integer> r, ArbolGeneral<Integer> a) {
		r.agregarFinal(a.getDato());
		if (a.esHoja()) {
			if (r.tamanio() % 2 == 0) {
				l.agregarFinal(r.clonar());
			}
		}
		else {
			ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
			hijos.comenzar();
			while (! hijos.fin()) {
				aux2(l,r,hijos.proximo());
			}
			
			
		}
		r.eliminarEn(r.tamanio());
	}
	
	public Integer buscar () {
		if (! a.esVacio()) {
			ListaGenerica<Integer> l = new ListaEnlazadaGenerica<Integer>();
			aux3(a,-1,0,l);
			l.comenzar();
			return l.proximo();
		}
		return -1;
		
	}
	
	private Integer aux3 (ArbolGeneral<Integer> a,int max, int nivel, ListaGenerica<Integer> l) {
		if (a.esHoja()) {
			if (nivel > max) {
				l.agregarInicio(a.getDato());
				return nivel;
			}
			return max;
			
		}
		else {
			ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
			hijos.comenzar();
			while (! hijos.fin()) {
				max = Math.max(max, aux3(hijos.proximo(),max,nivel+ 1,l));
			}
			return max;
		}
		
	}
	
	private int aux5 (ArbolGeneral<Integer> a, ListaGenerica<Integer> r , ListaGenerica<Integer> l, int peso, int pesoact) {
		r.agregarFinal(a.getDato());
		if (a.esHoja()) {
			if (r.tamanio() >= l.tamanio()) {
				if (((r.tamanio()== l.tamanio()) && pesoact > peso) || (r.tamanio() > l.tamanio())) {
					l.comenzar();
					while (! l.fin()) {
						l.eliminarEn(l.tamanio());
					}
					r.comenzar();
					while (! r.fin()) {
						l.agregarFinal(r.proximo());
					}
					peso = pesoact;
				}
			}
		}
		else {
			ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
			hijos.comenzar();
			while (! hijos.fin()) {
				peso = Math.max(peso, aux5(hijos.proximo(),r,l,peso,pesoact + a.getDato()));
			}
		}
		r.eliminarEn(r.tamanio());
		return peso;
	}
	
	
	public int procesar (ArbolBinario<Integer> p, int k){
		if (! p.esVacio()) {
			int cant = aux16(p,0,k);
			return cant;
		}
		return -1;
		
		
	}
	private int aux16 (ArbolBinario<Integer> a, int cant, int k) {
		int cantidad = 0;
		if (a.esHoja() && cant >= k)  
			return 1;	
		
		if (a.tieneHijoIzquierdo() && ! a.tieneHijoDerecho() || ((a.tieneHijoDerecho() && ! a.tieneHijoIzquierdo())))
			cant ++;			
		
		if (a.tieneHijoIzquierdo()) 
			cantidad += aux16(a.getHijoIzquierdo(), cant, k);
		
		if (a.tieneHijoDerecho()) 
			cantidad += aux16(a.getHijoDerecho(),cant,k);
		return cantidad;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
