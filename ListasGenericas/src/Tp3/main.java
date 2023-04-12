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
		ArbolBinario aux = new ArbolBinario(10);
		ArbolBinario aux1 = new ArbolBinario(1);
		ArbolBinario aux2 = new ArbolBinario(2);
		ArbolBinario aux3 = new ArbolBinario(3);
		ArbolBinario aux4 = new ArbolBinario(4);
		ArbolBinario aux5 = new ArbolBinario(5);
		ArbolBinario aux6 = new ArbolBinario(6);
		
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
		
		ProfundidadDeArbolBinario pr = new ProfundidadDeArbolBinario();
		
		System.out.println(pr.sumaNodos(0));
		
		

	}

}
