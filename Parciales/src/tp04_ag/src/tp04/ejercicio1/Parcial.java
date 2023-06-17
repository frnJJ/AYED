package tp04_ag.src.tp04.ejercicio1;


public class Parcial {
	
	
	public ListaEnlazadaGenerica<ListaGenerica<Integer>> caminos (ArbolGeneral<Integer> a ){
		ListaEnlazadaGenerica<ListaGenerica<Integer>> l = new ListaEnlazadaGenerica<ListaGenerica<Integer>>();
		ListaEnlazadaGenerica<Integer> r = new ListaEnlazadaGenerica<Integer>();
		if (! a.esVacio()) {
			aux(l,r,a);
		}
		return l;
	}

	private void aux (ListaEnlazadaGenerica<ListaGenerica<Integer>> l,ListaEnlazadaGenerica<Integer> r , ArbolGeneral<Integer> a) {
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
				aux(l,r,hijos.proximo());
			}
			
		}
		r.eliminarEn(r.tamanio());
	}
	
	
	
	


}
