package tp02.ejercicio2;

import tp04_ag.src.tp04.ejercicio1.ListaEnlazadaGenerica;

public class PilaGenerica<T> {
	
	private ListaEnlazadaGenerica l = new ListaEnlazadaGenerica();
	private int tamanio = 0;
	
	public void Apilar (T dato) {
		l.agregarFinal(dato);
		this.tamanio ++;
		
		
	}
	
	public T desApilar() {
		
		Object aux= null;
		l.comenzar();
		if (! l.esVacia()) {
			while (!(l.fin())) {
				aux = l.proximo();
			
			}
			l.eliminarEn(l.tamanio());
		}
		tamanio += -1;
		return (T)aux;
	}
	
	
	public T tope() {
		l.comenzar();
		Object aux = null;
		while (! l.fin()) {
			aux = l.proximo();
			
		}
		return (T)aux;
	}
	
	public boolean esVacia () {
		return (this.tamanio == 0);
	}
	

}
