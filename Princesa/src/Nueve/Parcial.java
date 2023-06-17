package Nueve;

public class Parcial {
	
	public ListaGenerica<ListaGenerica<Character>> caminosPares (ArbolGeneral<Character> arbol){
		ListaGenerica<ListaGenerica<Character>> l = new ListaEnlazadaGenerica<ListaGenerica<Character>>();
		if (! (arbol == null) || (! arbol.esVacio())) {
			ListaGenerica<Character> R = new ListaEnlazadaGenerica<Character>();
			aux(arbol,l,R);	
		}
		return l;
	}
	
	
	private void aux (ArbolGeneral<Character> a, ListaGenerica<ListaGenerica<Character>> l, ListaGenerica<Character> R) {
		R.agregarFinal(a.getDato());
		if (a.esHoja()) {
			if (R.tamanio() % 2 == 0) {
				l.agregarFinal(R.clonar());
			}
			
		}
		else {
			ListaGenerica<ArbolGeneral<Character>> hijos = a.getHijos();
			hijos.comenzar();
			while (! hijos.fin()) {
				aux(hijos.proximo(),l,R);
			}
		}
		R.eliminarEn(R.tamanio());
	}

}
