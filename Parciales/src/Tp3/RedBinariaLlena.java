package Tp3;


public class RedBinariaLlena {
	
	private ArbolBinario<Integer> ab=  new ArbolBinario<Integer>();
	
	public void SetAb(ArbolBinario<Integer> a) {
		this.ab = a;
	}
	
	private int helper (ArbolBinario<Integer> ab) {
		if (ab.esHoja()) {
			return ab.getDato();
		}
		else {
			System.out.println(ab.getDato());
			int datoI = ab.getDato();
			int datoD = ab.getDato();
			if (ab.tieneHijoIzquierdo()) {
				datoI += (helper(ab.getHijoIzquierdo()));
				
			}
			if (ab.tieneHijoDerecho()) {
				datoD += (helper(ab.getHijoDerecho()));
			}
			return Math.max(datoI,datoD);
		}
	}
	public int RetardoEnvio () {
		int res= 0;
		res= helper(ab);
		return(res);
		
		
	}

	
	public Boolean isTwoTree (int num, ArbolBinario<Integer> a) {
		ArbolBinario<Integer> aux;
		int HD = 0;
		int HI = 0;
		if (! a.esVacio()) {
			aux = buscar4(a,num);
			if ((aux != null) && (a.tieneHijoDerecho()) && (a.tieneHijoIzquierdo())){
				HD =  buscar3(a.getHijoDerecho());
				HI = buscar3(a.getHijoIzquierdo());
				return (HD == HI);
			}
			
		}
		return false;
	}
	private int buscar3 (ArbolBinario<Integer> a ) {
		int cant = 0;
		if (a.esHoja()) {
			return cant;
		}
		else {
			if (a.tieneHijoDerecho() && a.tieneHijoIzquierdo()) {
				cant ++;
			}
			if (a.tieneHijoIzquierdo()) {
				cant += buscar3(a.getHijoIzquierdo());
			}
			if (a.tieneHijoDerecho()) {
				cant += buscar3(a.getHijoDerecho());
			}
			return cant;
		}
		
	}

	private ArbolBinario<Integer> buscar4 (ArbolBinario<Integer> a, int num){
		ArbolBinario<Integer> aux = null;
		if (a.getDato() == num) {
			return a;
		}
		else {
			if (a.tieneHijoIzquierdo()) {
				aux = buscar4(a.getHijoIzquierdo(),num);
			}
			if (a.tieneHijoDerecho() && aux == null) {
				aux = buscar4(a.getHijoDerecho(),num);
			}
			return aux;
		}
	}

		
		
		

}
