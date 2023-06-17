package Tp3;

public class ContadorArbol {
	private ArbolBinario<Integer> a = new ArbolBinario<Integer>();
	private ListaEnlazadaGenerica lista = new ListaEnlazadaGenerica();
	
	public void crear (ArbolBinario a) {
		this.a = a; 
		
	}
	
	private ListaEnlazadaGenerica<Integer> aux (ArbolBinario<Integer> a) {
		if (a.esVacio()) {
		}
		else {
			if (a.tieneHijoIzquierdo()) {
				aux(a.getHijoIzquierdo());
			}

			if ((a.getDato()) % 2 == 0) {
				lista.agregarFinal(a.getDato());
			}
			if (a.tieneHijoDerecho()) {
				aux(a.getHijoDerecho());
			}
			
		}
		return(lista);
		
		
	}
	
	public ListaEnlazadaGenerica<Integer> numerosPares () {
		aux(a);
		return(lista);
	
	}
	

}
