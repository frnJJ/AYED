package tp02.ejercicio2.copy;



public class main {
	
	private static void imp (ArbolBinario<Integer> a) {
		if (a.esVacio()) {
			
		}
		else {
			if (a.tieneHijoIzquierdo()) {
				imp(a.getHijoIzquierdo());
			}
			System.out.println(a.getDato());
			if (a.tieneHijoDerecho()) {
				imp(a.getHijoDerecho());
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
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
		
		
		System.out.println(aux.contarHojas());
		
		
		
		
		

	}

}
