package tp04_ag.src.tp02.ejercicio2;


public class ArbolGeneral<T> {

	private T dato;

	private ListaGenerica<ArbolGeneral<T>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();

	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	public void setHijos(ListaGenerica<ArbolGeneral<T>> hijos) {
		if (hijos==null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

	public ArbolGeneral(T dato) {
		this.dato = dato;
	}

	public ArbolGeneral(T dato, ListaGenerica<ArbolGeneral<T>> hijos) {
		this(dato);
		if (hijos==null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

	public ListaGenerica<ArbolGeneral<T>> getHijos() {
		return this.hijos;
	}

	public void agregarHijo(ArbolGeneral<T> unHijo) {

		this.getHijos().agregarFinal(unHijo);
	}

	public boolean esHoja() {

		return !this.tieneHijos();
	}
	
	public boolean tieneHijos() {
		return !this.hijos.esVacia();
	}
	
	public boolean esVacio() {

		return this.dato == null && !this.tieneHijos();
	}

	

	public void eliminarHijo(ArbolGeneral<T> hijo) {
		if (this.tieneHijos()) {
			ListaGenerica<ArbolGeneral<T>> hijos = this.getHijos();
			if (hijos.incluye(hijo)) 
				hijos.eliminar(hijo);
		}
	}
	private boolean buscarB (ArbolGeneral<T> a, T b) {
		boolean ok = false;
		if (! a.esVacio()) {
			System.out.println(a.getDato());
			if (b == a.getDato()) {
				return true;
			}
			else {
				if (a.tieneHijos()) {
					ListaGenerica<ArbolGeneral<T>> hijos = a.getHijos();
					while (! hijos.fin() && (! ok)) {
						ok = buscarB(hijos.proximo(),b);
					}
				}
				else {
					return false;
				}
			}
		}
		return ok;
	}
	
	private boolean helper5 (ArbolGeneral<T> arb, T a, T b) {
		boolean ok = false;
		boolean ok2= false;
		if (arb.getDato() == a) {
			return true;
		
		}
		else {
		if (! arb.esVacio()) {
			if (arb.tieneHijos()) {
				ListaGenerica<ArbolGeneral<T>> hijos = arb.getHijos();
				while ((! hijos.fin() && (! ok))) {
					ArbolGeneral<T> aux = hijos.proximo();
					ok = helper5(aux,a,b);
					if (ok) {
						if (aux.tieneHijos()) {
							hijos = aux.getHijos();
							hijos.comenzar();
							while ((! hijos.fin() && (!ok2))) {
								ok2 = buscarB(aux,b);
							}
						}
						
						
					}
					
					
				}
			}
			
		}
		}
		return ok2;
		
		
	}

	public Boolean esAncestro(T a, T b) {
		boolean ok =helper5(this,a,b);
		return ok;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public Integer nivel(T dato) {
		int res= -1;
		ArbolGeneral arb = this;
		int nivel = 0;
		ColaGenerica<ArbolGeneral> cola = new ColaGenerica<ArbolGeneral>();
		ArbolGeneral aux;
		cola.Encolar(arb);
		cola.Encolar(null);
		while (! cola.esVacia()) {
			aux = cola.Desencolar();
			if (aux != null) {
				if (aux.getDato() == dato) {
					res = nivel;
				}
				if (aux.tieneHijos()) {
					ListaGenerica<ArbolGeneral> hijos = aux.getHijos();
					hijos.comenzar();
					while (! hijos.fin()) {
						cola.Encolar(hijos.proximo());
					}
				}
			}
			else {
				if ((! cola.esVacia()) && (res == -1) ) {
					nivel ++;
					cola.Encolar(null);
				}
			}
			
		}
		return res;	
	}

	public Integer ancho() {
		ArbolGeneral aux;
		int tam = -1;
		ColaGenerica<ArbolGeneral> cola = new ColaGenerica<ArbolGeneral>();
		cola.Encolar(this);
		cola.Encolar(null);
		while (! cola.esVacia()) {
			aux = cola.Desencolar();
			if (aux != null) {
				if (aux.tieneHijos()) {
					ListaGenerica<ArbolGeneral> hijos = aux.getHijos();
					if (hijos.tamanio() > tam) {
						tam = hijos.tamanio();
					}
					while (! hijos.fin()) {
						cola.Encolar(hijos.proximo());
					}
				}
			}
		}
		return tam;
	}
	
	//private int helper4 (ArbolGeneral a) {
	//	int cont = 0;
	//	if (a.esVacio()) {
	//		
	//	}
	//	else {
	//		if (a.tieneHijos()) {
	//			ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
	//			while (! hijos.fin()) {
	//				cont += helper4(hijos.proximo());
	//			}
	//			
	//		}
	//	}
	//	
	//	return cont;
	//	
	//	
	//}
	//public int alt() {
	//	int res = helper4(this);
//	return res;
		
		
	//}
		
	
	private int helper3(ArbolGeneral<Integer> a) {
		int alt= 0;
		if (a.esHoja()) {
			return alt;
		}
		else {
			if (a.tieneHijos()) {
				ListaGenerica<ArbolGeneral<Integer>> hijos= a.getHijos();
				hijos.comenzar();
				while (! hijos.fin()) {
					alt = Math.max(alt, helper3(hijos.proximo()));
					
				}
			}
			return (alt + 1);
			
		}
	}
		
	
	public Integer altura() {
		int alt= 0;
		alt = helper3((ArbolGeneral<Integer>) this);
		return alt;
	}
	
	
	
	
	private void helper (ListaEnlazadaGenerica<Integer> lista, ArbolGeneral<Integer> a, int n) {
		if (a.esVacio()) {
			
		}
		else {
			if ((a.getDato() > n) && (a.getDato() % 2 == 1)) {
				lista.agregarFinal(a.getDato());
			}
			if (a.tieneHijos()) {
				ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
				hijos.comenzar();
				while (! hijos.fin()) {
					helper(lista,hijos.proximo(),n);
				}
			}
		}
	}
	public ListaEnlazadaGenerica<Integer> valorespar (ArbolGeneral<Integer> a , int n){
		ListaEnlazadaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		helper(lista,a,n);
		return(lista);

	}
	private void helper2 (ListaEnlazadaGenerica<Integer> lista, ArbolGeneral<Integer> a, int n ){
		if (a.esVacio()) {
			
			
		}
		else {
			ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
			if (!hijos.fin()) {
				helper2(lista,hijos.proximo(),n);			
			}
			if ((a.getDato() % 2 == 1) && (a.getDato() > n)) {
				lista.agregarFinal(a.getDato());
			}
			while (!hijos.fin()) {
				helper2(lista,hijos.proximo(),n);
			}	
	}
		
			
				
	}
	public ListaEnlazadaGenerica<Integer> valoresinorden (ArbolGeneral<Integer> a ,int n){
		ListaEnlazadaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		helper2(lista,a,n);
		return lista;
		
		
		
		
	}
	public ListaEnlazadaGenerica<Integer> valorpornivel (ArbolGeneral<Integer> a, int n){
		ListaEnlazadaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		int nivel = 0;
		ArbolGeneral<Integer> aux;
		ColaGenerica<ArbolGeneral<Integer>> cola = new ColaGenerica<ArbolGeneral<Integer>>();
		
		cola.Encolar(a);
		cola.Encolar(null);
		while (! cola.esVacia()) {
			aux = cola.Desencolar();
			if (aux != null) {
				ListaGenerica<ArbolGeneral<Integer>> hijos = aux.getHijos();
				while (! hijos.fin()) {
					cola.Encolar(hijos.proximo());
				}
				if ((true) && (aux.getDato() > n)) {
					lista.agregarFinal(aux.getDato());
				}
			}
			else {
				if (! cola.esVacia()) {
					nivel++;
					cola.Encolar(null);
				}
				
			}
		}
		return lista;
		
		
	}
}