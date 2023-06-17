package Cinco;

public class test {

	public static void main(String[] args) {
		ArbolBinario<Integer> a = new ArbolBinario<Integer>(2);
		ArbolBinario<Integer> b = new ArbolBinario<Integer>(1);
		ArbolBinario<Integer> c = new ArbolBinario<Integer>(5);
		ArbolBinario<Integer> d = new ArbolBinario<Integer>(16);
		ArbolBinario<Integer> e = new ArbolBinario<Integer>(6);
		ArbolBinario<Integer> f = new ArbolBinario<Integer>(8);
		ArbolBinario<Integer> g = new ArbolBinario<Integer>(22);
		
		
		a.agregarHijoIzquierdo(b);
		a.agregarHijoDerecho(c);
		b.agregarHijoIzquierdo(d);
		b.agregarHijoDerecho(e);
		c.agregarHijoDerecho(f);
		f.agregarHijoIzquierdo(g);
		
		
		
		Parcial p =  new Parcial();
		
		ListaGenerica<Integer> l = p.resolver(a);
		
		
		l.comenzar();
		
		while (! l.fin()) {
			System.out.println(l.proximo());
		}
		
		

	}

}
