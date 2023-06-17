package tp04_ag.src.tp02.ejercicio2;

import Tp3.ListaEnlazadaGenerica;
import Tp3.ListaGenerica;
import tp03.ejercicio1.ArbolBinario;
public class Parcial {
	
	
	
public Boolean esAncestro(int a, int b, ArbolGeneral<Integer> arb) {
	ArbolGeneral<Integer> aux;
	Boolean ok = false;
	if (! arb.esVacio()) {
		aux = buscar(a,arb);
		System.out.println(aux.tieneHijos());
		ok = buscar2(aux,b);
	}
	return ok;	
}
	
private Boolean buscar2 (ArbolGeneral<Integer> a, int b) {
	boolean ok = false;
	if (a.getDato() == b) {
		return true;
	}
	else {
		if (a.tieneHijos()) {
			ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
			hijos.comenzar();
			while (! hijos.fin() && !ok) {
				ok = buscar2(hijos.proximo(),b);
			}
		}
		return ok;
	}
}


private ArbolGeneral<Integer> buscar (int a, ArbolGeneral<Integer> arb) {
	ArbolGeneral<Integer> aux = null;
	if (arb.getDato() == a) {
		return arb;
	}
	else {
		if (arb.tieneHijos()) {
			ListaGenerica<ArbolGeneral<Integer>> hijos = arb.getHijos();
			hijos.comenzar();
			while (! hijos.fin() && aux == null) {
				aux = buscar(a,hijos.proximo());
			}
		
		}
	}
	return aux;
	
}
	
	
public Boolean isTwoTree (int num, ArbolBinario<Integer> aux2) {
	ArbolBinario<Integer> aux;
	int HD = 0;
	int HI = 0;
	if (! aux2.esVacio()) {
		aux = buscar4(aux2,num);
		if ((aux != null) && (aux2.tieneHijoDerecho()) && (aux2.tieneHijoIzquierdo())){
			HD =  buscar3(aux2.getHijoDerecho());
			HI = buscar3(aux2.getHijoIzquierdo());
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


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
public int maxprom (ArbolGeneral<Integer> a) {
	int max = -9999;
	int nivel = 0;
	int prom = 0;
	int cont = 0;
	ColaGenerica<ArbolGeneral<Integer>> cola = new ColaGenerica<ArbolGeneral<Integer>>();
	ArbolGeneral<Integer> aux;
	cola.Encolar(a);
	cola.Encolar(null);
	while (! cola.esVacia()) {
		aux = cola.Desencolar();
		if (aux != null) {
			cont++;
			prom += aux.getDato();
			if (aux.tieneHijos()) {
				ListaGenerica<ArbolGeneral<Integer>> hijos = aux.getHijos();
				hijos.comenzar();
				while (! hijos.fin()) {
					cola.Encolar(hijos.proximo());
				}
				
			}
		}
		else {
			prom = prom / cont;
			if (prom > max) {
				max = prom;
			}
			if (!cola.esVacia()) {
				nivel++;
				cola.Encolar(null);
				prom = 0;
				cont = 0;
			}
		}
	}
	return max;
}

}
