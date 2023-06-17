package tp02.ejercicio2;

import tp04_ag.src.tp04.ejercicio1.ListaEnlazadaGenerica;
import tp04_ag.src.tp04.ejercicio1.ListaGenerica;

public class mainParciaal {

	public static void main(String[] args) {
		
		
		ArbolBinario<Integer> aux = new ArbolBinario<Integer>(10);
		ArbolBinario<Integer> aux1 = new ArbolBinario<Integer>(2);
		ArbolBinario<Integer> aux2 = new ArbolBinario<Integer>(3);
		ArbolBinario<Integer> aux3 = new ArbolBinario<Integer>(4);
		ArbolBinario<Integer> aux4 = new ArbolBinario<Integer>(5);
		ArbolBinario<Integer> aux5 = new ArbolBinario<Integer>(6);
		ArbolBinario<Integer> aux6 = new ArbolBinario<Integer>(7);
		
		aux.agregarHijoDerecho(aux1);
		aux.agregarHijoIzquierdo(aux2);
		aux2.agregarHijoDerecho(aux3);
		aux2.agregarHijoIzquierdo(aux4);
		aux1.agregarHijoDerecho(aux5);
		aux1.agregarHijoIzquierdo(aux6);
		
		ProcesadordeArbol p = new ProcesadordeArbol(aux);
		retornar r = new retornar();
		ListaGenerica<ArbolBinario<Integer>> list = new ListaEnlazadaGenerica<ArbolBinario<Integer>>();
		r = p.procesar();
		
		System.out.println(r.getCant());
		list = r.getLista();
		list.comenzar();
		while (! list.fin()) {
			System.out.println(list.proximo().getDato());
		}
		

	}

}
