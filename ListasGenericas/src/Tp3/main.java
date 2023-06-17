package Tp3;

public class main {
	public static void recorrer (ArbolBinario a ) {
		if (a.esHoja()) {
			System.out.println(a.getDato());
		}
		else {
			System.out.println(a.getDato());
			recorrer(a.getHijoDerecho());
			recorrer(a.getHijoIzquierdo());
		}
	}

	public static void main(String[] args) {
		ArbolBinario<Integer> aux = new ArbolBinario<Integer>(10);
		ArbolBinario<Integer> aux1 = new ArbolBinario<Integer>(1);
		ArbolBinario<Integer> aux2 = new ArbolBinario<Integer>(2);
		ArbolBinario<Integer> aux3 = new ArbolBinario<Integer>(3);
		ArbolBinario<Integer> aux4 = new ArbolBinario<Integer>(4);
		ArbolBinario<Integer> aux5 = new ArbolBinario<Integer>(5);
		ArbolBinario<Integer> aux6 = new ArbolBinario<Integer>(6);
		
		aux.agregarHijoDerecho(aux1);
		aux.agregarHijoIzquierdo(aux2);
		aux2.agregarHijoDerecho(aux3);
		aux2.agregarHijoIzquierdo(aux4);
		aux1.agregarHijoDerecho(aux5);
		aux1.agregarHijoIzquierdo(aux6);
		
		ListaEnlazadaGenerica lista= new ListaEnlazadaGenerica();
		ContadorArbol cont =  new ContadorArbol();
		
		//cont.crear(aux);
		//lista = cont.numerosPares();
		//lista.comenzar();
		//System.out.println(lista.tamanio());
		//while (!lista.fin()) {
		//	System.out.println(lista.proximo());
			
		//}
		
		RedBinariaLlena pr = new RedBinariaLlena();
		pr.SetAb(aux);

		System.out.println(pr.RetardoEnvio());
		
		

	}

}
