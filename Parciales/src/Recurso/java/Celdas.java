package Recurso.java;

public class Celdas {
	
	
	public static ListaEnlazadaGenerica<Personaje> retornar (ArbolGeneral<Personaje> ag){
		ListaEnlazadaGenerica<Personaje> lista = new ListaEnlazadaGenerica<Personaje>();
			if (ag.getDato().esPrincesa() || ag.getDato().esDragon() || ag.esHoja()) {
				if (ag.getDato().esPrincesa()) {
					lista.agregarInicio(ag.getDato());
				}

			return lista;
			}
			ListaGenerica<ArbolGeneral<Personaje>> hijos = ag.getHijos();
			while ((!hijos.fin() && (lista.esVacia()))) {
				lista = retornar(hijos.proximo());	
			}
				if (! lista.esVacia()) {
					lista.agregarInicio(ag.getDato());
				}
			return lista;
			}
			
					

				
				


	public static void main(String[] args) {
		
		 Personaje p0 = new Personaje("Scooby", "Animal");
		 Personaje p1 = new Personaje("Cenicienta", "Princesa");
		 Personaje p2 = new Personaje("Rojo", "Dragon");
		 Personaje p3 = new Personaje("Pluto", "Animal");
		 Personaje p4 = new Personaje("Negro", "Dragon");
		 Personaje p5 = new Personaje("La bella", "Princesa");
		 Personaje p6 = new Personaje("Tweety", "Animal");
		 Personaje p7 = new Personaje("Cid", "Animal");
		 Personaje p8 = new Personaje("Coyote", "Animal");
		
		 ArbolGeneral<Personaje> a1 = new ArbolGeneral<Personaje>(p0);
		 ArbolGeneral<Personaje> a21 = new ArbolGeneral<Personaje>(p1);
		 ArbolGeneral<Personaje> a22 = new ArbolGeneral<Personaje>(p2);
		 ArbolGeneral<Personaje> a23 = new ArbolGeneral<Personaje>(p3);
		 
		 ListaGenerica<ArbolGeneral<Personaje>> hijosa2 = new ListaEnlazadaGenerica<ArbolGeneral<Personaje>>();
		 hijosa2.agregarFinal(a21);
		 hijosa2.agregarFinal(a22);
		 hijosa2.agregarFinal(a23);
		 ArbolGeneral<Personaje> a2 = new ArbolGeneral<Personaje>(p4, hijosa2);
		 
		 
		 
		 ArbolGeneral<Personaje> a24 = new ArbolGeneral<Personaje>(p5);
		 ArbolGeneral<Personaje> a25 = new ArbolGeneral<Personaje>(p6);
		 
		 ListaGenerica<ArbolGeneral<Personaje>> hijosa3 = new ListaEnlazadaGenerica<ArbolGeneral<Personaje>>();
		 hijosa3.agregarFinal(a24);
		 hijosa3.agregarFinal(a25);
		 
		 ArbolGeneral<Personaje> a3 = new ArbolGeneral<Personaje>(p7,hijosa3);
		 
		 
		 ListaGenerica<ArbolGeneral<Personaje>> hijosa4 = new ListaEnlazadaGenerica<ArbolGeneral<Personaje>>();
		 
		 hijosa4.agregarFinal(a1);
		 hijosa4.agregarFinal(a2);
		 hijosa4.agregarFinal(a3);
		 
		 ArbolGeneral<Personaje> a4 = new ArbolGeneral<Personaje>(p8, hijosa4);
		 
		 ListaGenerica<Personaje> lista = new ListaEnlazadaGenerica<Personaje>();		 
		 lista = retornar(a4);
		 lista.comenzar();
		 while (! lista.fin()) {
			 System.out.println(lista.proximo().getNombre());
		 }
		 
		 


	}

}
