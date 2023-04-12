package Tp3;

public class ProfundidadDeArbolBinario {
	private ArbolBinario<Integer> ab= new ArbolBinario<Integer>();
	private int nivel = 0;
	
	public ProfundidadDeArbolBinario() {
		ArbolBinario<Integer> ar = new ArbolBinario<Integer>(9);
		ArbolBinario<Integer> ar1 = new ArbolBinario<Integer>(22);
		ArbolBinario<Integer> ar2 = new ArbolBinario<Integer>(33);
		ArbolBinario<Integer> ar3 = new ArbolBinario<Integer>(50);
		
		ar.agregarHijoDerecho(ar1);
		ar.agregarHijoIzquierdo(ar2);
		ar2.agregarHijoDerecho(ar3);
		
		ab = ar;
		
	}
		
	private int helper(ArbolBinario<Integer> ab, int niv) {
		int suma= 0;
		ArbolBinario<Integer> aux= new ArbolBinario<Integer>();
		ColaGenerica<ArbolBinario> cola = new ColaGenerica<ArbolBinario>();
		cola.Encolar(ab);
		cola.Encolar(null);
		while (! cola.esVacia()) {
			aux = cola.Desencolar();
			if (aux != null) {
				if (nivel == niv) {
					suma+= aux.getDato();
				}
				else {
					if (ab.tieneHijoDerecho()) {
						cola.Encolar(ab.getHijoDerecho());
					}
					if (ab.tieneHijoIzquierdo()) {
						cola.Encolar(ab.getHijoIzquierdo());
					}
				}
			}
			else {
				if (nivel < niv) {
					nivel++;
					cola.Encolar(null);
				}
			}
		}
		return suma;
		
	}
	
	public int sumaNodos (int niv) {
		int res= 0;
		res = helper(ab,niv);
		return res;
	}
	
	
	

}
