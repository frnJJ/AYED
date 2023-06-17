package tp02.ejercicio2;

import tp04_ag.src.tp04.ejercicio1.ListaEnlazadaGenerica;
import tp04_ag.src.tp04.ejercicio1.ListaGenerica;

public class ProcesadordeArbol {
	
	ArbolBinario<Integer> a;
	
	public ProcesadordeArbol (ArbolBinario<Integer> aux) {
		this.a = aux;
	}
	private int auxiliar (ListaGenerica<ArbolBinario<Integer>> list, ArbolBinario<Integer> a ) {
		int total = 0;
		if (a.esVacio()) {
			return (0);	
		}
		else {
			if ((a.tieneHijoDerecho()) && (a.tieneHijoIzquierdo()) && (a.getDato() % 2 == 0)) {
				list.agregarFinal(a);
			}
			if (a.getDato() % 2 == 0) {
				total += 1;
			}
			if (a.tieneHijoDerecho()) {
				total += auxiliar(list,a.getHijoDerecho());
			}
			if (a.tieneHijoIzquierdo()) {
				total += auxiliar(list,a.getHijoIzquierdo());
			}
			return total;
			
		}
	}
	
	public retornar procesar () {
		ListaEnlazadaGenerica<ArbolBinario<Integer>> lista  = new ListaEnlazadaGenerica<ArbolBinario<Integer>>();
		int res = auxiliar(lista,a);
		retornar todo = new retornar();
		todo.setCant(res);
		todo.setLista(lista);
		
		return todo;
		
	}

}
