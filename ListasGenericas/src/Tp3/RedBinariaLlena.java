package Tp3;

public class RedBinariaLlena {
	
	//private ArbolBinario<Integer> ab=  new ArbolBinario<Integer>();
	
	
	
	private int helper (ArbolBinario<Integer> ab) {
		int hd=0;
		int hi=0;
		if (ab.esHoja()) {
			return(ab.getDato());
		}
		else {
			if (ab.tieneHijoIzquierdo()) {
				hi += (helper(ab.getHijoIzquierdo())+ab.getDato());
			}
				
			if (ab.tieneHijoDerecho()) {
				hd += (helper(ab.getHijoDerecho())+ab.getDato());
			}
			
		}
		return(Math.max(hi,hd));
		
		
	}
	public int RetardoEnvio (ArbolBinario<Integer> ab) {
		int res= 0;
		res= helper(ab);
		return(res);
		
		
	}

}
