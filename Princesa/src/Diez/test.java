package Diez;

public class test {
	
	
	private static void recorrer (ArbolBinario<String> a) {
		ArbolBinario<String> aux;
		ColaGenerica<ArbolBinario<String>> cola = new ColaGenerica<ArbolBinario<String>>();
		cola.Encolar(a);
		while (! cola.esVacia()) {
			aux = cola.Desencolar();
				if (aux != null) {
					System.out.println(aux.getDato());
					if (a.tieneHijoIzquierdo()) {
						cola.Encolar(aux.getHijoIzquierdo());
					}
					if (a.tieneHijoDerecho()) {
						cola.Encolar(aux.getHijoDerecho());
					}
				}
		}
		
	}

	public static void main(String[] args) {
		
		ArbolBinario<String> a = new ArbolBinario<String>("incolor");
		ArbolBinario<String> b = new ArbolBinario<String>("incolor");
		ArbolBinario<String> c = new ArbolBinario<String>("incolor");
		ArbolBinario<String> d = new ArbolBinario<String>("incolor");
		ArbolBinario<String> e = new ArbolBinario<String>("incolor");
		ArbolBinario<String> f = new ArbolBinario<String>("incolor");
		ArbolBinario<String> g = new ArbolBinario<String>("incolor");
		ArbolBinario<String> h = new ArbolBinario<String>("incolor");
		ArbolBinario<String> i = new ArbolBinario<String>("incolor");
		ArbolBinario<String> j = new ArbolBinario<String>("incolor");
		ArbolBinario<String> k = new ArbolBinario<String>("incolor");
		
		a.agregarHijoIzquierdo(b);
		a.agregarHijoDerecho(c);
		
		b.agregarHijoIzquierdo(d);
		b.agregarHijoDerecho(e);
		
		c.agregarHijoIzquierdo(f);
		c.agregarHijoDerecho(g);
		
		e.agregarHijoIzquierdo(h);
		
		f.agregarHijoDerecho(i);
		
		g.agregarHijoIzquierdo(j);
		g.agregarHijoDerecho(k);
		
		Parcial test = new Parcial();
		
		
		System.out.println("ARBOL");
		
		test.colorearArbol(a,3);
		
		recorrer(a);
		
		

	}

}
