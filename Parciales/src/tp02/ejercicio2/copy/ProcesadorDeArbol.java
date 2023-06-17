package tp02.ejercicio2.copy;

public class ProcesadorDeArbol {
	
	
	private void aux (ListaGenerica<Character> res, ArbolBinario<Character> a, String palabra) {
		int i;
		char auxiliar = palabra.charAt(i);
		if () {
			
			
			
		}
		else {
			if (palabra == 0) {
				if (a.tieneHijoIzquierdo()) {
					aux(res,a,)
				}
			
			
			}
			
		}
		
		
		
	}
	
	public ListaGenerica<Character> descifrar (ArbolBinario<Character> a, ListaGenerica<String> lista){
		ListaGenerica<Character> res = new ListaEnlazadaGenerica<Character>() ;
		
		lista.comenzar();
		
		String palabra = lista.proximo();
		aux(res,a, palabra);
		
		
	}
		

		
	

}
