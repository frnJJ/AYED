package Uno;

public class Test {
	
	public static void main(String[] args) {
		Personaje coyote = new Personaje("Animal","coyote");
		Personaje scooby = new Personaje("Animal","Scooby");
		Personaje negro = new Personaje("Dragon","negro");
		Personaje cid = new Personaje("Animal","Cid");
		Personaje Cenicienta = new Personaje("Princesa","Cenicienta");
		Personaje Rojo = new Personaje("Dragon","rojo");
		Personaje pluto = new Personaje("Animal","Pluto");
		Personaje bella = new Personaje("Princesa","La Bella");
		Personaje Tweety = new Personaje("Animal","Tweety");
		
		
		
		
		
	
		ArbolGeneral<Personaje> C = new ArbolGeneral<Personaje>(coyote);
		ArbolGeneral<Personaje> S = new ArbolGeneral<Personaje>(scooby);
		ArbolGeneral<Personaje> N= new ArbolGeneral<Personaje>(negro);
		ArbolGeneral<Personaje> Ci = new ArbolGeneral<Personaje>(cid);
		ArbolGeneral<Personaje> Ce = new ArbolGeneral<Personaje>(Cenicienta);
		ArbolGeneral<Personaje> R = new ArbolGeneral<Personaje>(Rojo);
		ArbolGeneral<Personaje> P = new ArbolGeneral<Personaje>(pluto);
		ArbolGeneral<Personaje> B = new ArbolGeneral<Personaje>(bella);
		ArbolGeneral<Personaje> T = new ArbolGeneral<Personaje>(Tweety);
	
	
		
		
		ListaGenerica<ArbolGeneral<Personaje>> h= new ListaEnlazadaGenerica<ArbolGeneral<Personaje>>();
		h.agregarFinal(S);
		h.agregarFinal(N);
		h.agregarFinal(Ci);
		
		C.setHijos(h);
		
		ListaGenerica<ArbolGeneral<Personaje>> h2= new ListaEnlazadaGenerica<ArbolGeneral<Personaje>>();
		
		h2.agregarFinal(Ce);
		h2.agregarFinal(R);
		h2.agregarFinal(P);
		
		
		N.setHijos(h2);
		
		
		ListaGenerica<ArbolGeneral<Personaje>> h3= new ListaEnlazadaGenerica<ArbolGeneral<Personaje>>();
		
		h3.agregarFinal(B);
		h3.agregarFinal(T);
		
		Ci.setHijos(h3);
		
		
		Parcial tst = new Parcial();
		
		ListaGenerica<ArbolGeneral<Personaje>> l = tst.resolver(C);
		
		l.comenzar();
		while (! l.fin()) {
			System.out.println(l.proximo().getDato().getName());
		}
		
	}	
		

}
