package Cinco;

public class Parcial {
	
	
public ListaGenerica<Integer> resolver (ArbolBinario<Integer> a){
	ListaGenerica<Integer> l = new ListaEnlazadaGenerica<Integer>();

	if (! a.esVacio()) {
		aux(a,l);
	}
	return l;
}



private int aux (ArbolBinario<Integer> a, ListaGenerica<Integer> l) {
	int hi = 0;
	int hd = 0;
	if (! a.esHoja()) {
		if (a.tieneHijoIzquierdo()) {
			hi += aux(a.getHijoIzquierdo(),l);
			
		}
		if (a.tieneHijoDerecho()) {
			hd += aux(a.getHijoDerecho(), l);
		}
	}
	if (hd == hi) 
		l.agregarFinal(a.getDato());
	return (hi+hd+1);
}

}
