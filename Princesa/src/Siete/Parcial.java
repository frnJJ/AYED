package Siete;

public class Parcial {
	
	private ArbolGeneral<Integer> a;
	
	
	
	public void setArbol (ArbolGeneral<Integer> a) {
		this.a = a;
	}
	
	public ListaGenerica<Integer> resolver (){
		ListaGenerica<Integer> l = new ListaEnlazadaGenerica<Integer>();
		if (! a.esVacio()) {
			aux(a,l);
		}
		return l;
	}
	
	private void aux (ArbolGeneral<Integer> a, ListaGenerica<Integer> l) {
		l.agregarFinal(a.getDato());
		int cont = 1;
		if (! a.esHoja()) {
			ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
			hijos.comenzar();
			while (! hijos.fin() && cont < a.getDato()) {
				hijos.proximo();
				cont++;
			}
			aux(hijos.proximo(),l);
		
		}
	

	}
	
	
}
