package Ocho;


public class Parcial {
	
	
	
	public ListaGenerica<Integer> buscar (ArbolGeneral<Integer> a){
		ListaGenerica<Integer> L = new ListaEnlazadaGenerica<Integer>();
		System.out.println(a);
		if ((a != null) || (! a.esVacio())) {
			ListaGenerica<Integer> R = new ListaEnlazadaGenerica<Integer>();
			aux(L,R,a,-1,0);
		}
		return L;
	}
	
	private int aux (ListaGenerica<Integer> L, ListaGenerica<Integer> R, ArbolGeneral<Integer> a, int max, int act) {
		if (a.getDato() % 2 == 0) {
			R.agregarFinal(a.getDato());
			if (a.tieneHijos()) {
				ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
				hijos.comenzar();
				while (! hijos.fin()) {
					max = Math.max(max,aux(L,R,hijos.proximo(),max,act+a.getDato()));
				}
			}
			else {
				if (R.tamanio() >= L.tamanio()) {
					if (R.tamanio() > L.tamanio() || (R.tamanio() == L.tamanio() && act > max)) {
						max =  act;
						L.comenzar();
						while (! L.fin()) {
							L.eliminar(L.proximo());
						}
						R.comenzar();
						while (! R.fin()) {
							L.agregarFinal(R.proximo());
						}
					}
				}
			}
			System.out.println("El nodo q estoy es = "+a.getDato()+"y mi actual es  ="+act);
			R.eliminarEn(R.tamanio());
		}
		return max;
	}

}
