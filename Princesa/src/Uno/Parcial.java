package Uno;

public class Parcial {

	
	
	
	
public ListaGenerica<ArbolGeneral<Personaje>> resolver (ArbolGeneral<Personaje> a){
	
	ListaGenerica<ArbolGeneral<Personaje>> L = new ListaEnlazadaGenerica<ArbolGeneral<Personaje>>();
	ListaGenerica<ArbolGeneral<Personaje>> R = new ListaEnlazadaGenerica<ArbolGeneral<Personaje>>();
	if (! a.esVacio()) {
		enListar(a,L,R);
	}
	return L;
	
}


private void enListar (ArbolGeneral<Personaje> a, ListaGenerica<ArbolGeneral<Personaje>> l, ListaGenerica<ArbolGeneral<Personaje>> r) {
	r.agregarFinal(a);
	
	if (a.getDato().getType() == "Princesa" || a.getDato().getType() == "Dragon") {
		if (a.getDato().getType() == "Princesa") {
			l.comenzar();
			while (! l.fin()) {
				l.eliminarEn(l.tamanio());
			}
			r.comenzar();
			while (! r.fin()) {
				l.agregarFinal(r.proximo());
			}
		}
	}
	else {
		ListaGenerica<ArbolGeneral<Personaje>> hijos = a.getHijos();
		hijos.comenzar();
		while (! hijos.fin() && l.esVacia()) {
			enListar(hijos.proximo(),l,r);
		}
	}
	r.eliminarEn(r.tamanio());
}
}
