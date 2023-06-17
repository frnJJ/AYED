package Ocho;

public class test {

	public static void main(String[] args) {
		
		
		ArbolGeneral<Integer> a = new ArbolGeneral<Integer>(2);
		ArbolGeneral<Integer> b = new ArbolGeneral<Integer>(4);
		ArbolGeneral<Integer> c = new ArbolGeneral<Integer>(7);
		ArbolGeneral<Integer> d = new ArbolGeneral<Integer>(6);
		ArbolGeneral<Integer> e = new ArbolGeneral<Integer>(4);
		ArbolGeneral<Integer> f = new ArbolGeneral<Integer>(6);
		ArbolGeneral<Integer> g = new ArbolGeneral<Integer>(12);
		ArbolGeneral<Integer> h = new ArbolGeneral<Integer>(8);
		ArbolGeneral<Integer> i = new ArbolGeneral<Integer>(6);
		ArbolGeneral<Integer> j = new ArbolGeneral<Integer>(10);
		ArbolGeneral<Integer> k = new ArbolGeneral<Integer>(2);
		
		a.agregarHijo(b);
		a.agregarHijo(c);
		a.agregarHijo(d);
		a.agregarHijo(e);
		
		b.agregarHijo(f);
		
		c.agregarHijo(g);
		
		d.agregarHijo(h);
	
		
		e.agregarHijo(i);
		
		i.agregarHijo(k);
		
		
		Parcial p = new Parcial();
		
		
		System.out.println(p.buscar(a));
		
		
		
		
		
		

	}

}
