package Tres;

public class Parcial {
	
	private ArbolGeneral<Integer> a;
	
	public void setArbol (ArbolGeneral<Integer> a) {
		this.a = a;
		
		
	}
	
	public ListaGenerica<Integer> resolver (){
		ListaGenerica<Integer> L = new ListaEnlazadaGenerica<Integer>();
		if (! a.esVacio()) {
			contador(a,L);
		}
		return L;
	}
	
	private int contador (ArbolGeneral<Integer> a, ListaGenerica<Integer> L) {
		int sumador = 0;
		if (! a.esHoja()) {
			ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
			hijos.comenzar();
			while (! hijos.fin()) {
				sumador += contador(hijos.proximo(), L);
			}
			if (hijos.tamanio() % 2 == 1) {
				L.agregarFinal(sumador);
			}
			
		}
		return a.getDato();
	}
	

}
