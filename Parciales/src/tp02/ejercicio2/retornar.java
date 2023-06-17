package tp02.ejercicio2;

import tp04_ag.src.tp04.ejercicio1.ListaEnlazadaGenerica;
import tp04_ag.src.tp04.ejercicio1.ListaGenerica;

public class retornar {
	private int cant;
	private ListaGenerica<ArbolBinario<Integer>> lista;
	public retornar () {
		
	}
	public retornar (ListaEnlazadaGenerica<ArbolBinario<Integer>> lista, int cant) {
		this.cant = cant;
		this.lista = lista;
	}
	
	public int getCant () {
		return this.cant;
	}
	
	
	public void setCant(int cant) {
		this.cant = cant;
	}
	public void setLista(ListaGenerica<ArbolBinario<Integer>> lista) {
		this.lista = lista;
	}
	public ListaGenerica<ArbolBinario<Integer>> getLista() {
		return lista;
		
	}

}
