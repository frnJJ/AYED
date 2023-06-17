package Cuatro;

public class Parcial {
	
	private ArbolGeneral<Integer> a;
	
	public void setArbol (ArbolGeneral<Integer> m) {
		this.a = m;
	}
	
	
	
	public ArbolGeneral<Integer> minEnNiveldeAB (int n){
		if (! a.esVacio()) {
			ArbolGeneral<Integer> ret = porniveles(a,n);
			return ret;
		}
		return null;
		
	}
	
	private ArbolGeneral<Integer> porniveles(ArbolGeneral<Integer> a, int n){
		int nivel = 0;
		int min = 9999;
		ArbolGeneral<Integer> minimo = null;
		ArbolGeneral<Integer> aux;
		ColaGenerica<ArbolGeneral<Integer>> cola = new ColaGenerica<ArbolGeneral<Integer>>();
		cola.Encolar(a);
		cola.Encolar(null);
		while (! cola.esVacia() && nivel <= n) {
			aux = cola.Desencolar();
			if (aux != null) {
				if (nivel == n && aux.esHoja() && aux.getDato() <= min) {
					min = aux.getDato();
					minimo = aux;
				}
				ListaGenerica<ArbolGeneral<Integer>> hijos = aux.getHijos();
				hijos.comenzar();
				while (! hijos.fin()) {
					cola.Encolar(hijos.proximo());
				}
			}
			else {
				if (! cola.esVacia()) {
					nivel++;
					cola.Encolar(null);
				}
			}
		}
		return minimo;
	}

	
	

}
