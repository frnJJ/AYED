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

}
