package Tp3;

public class RedBinariaLlena {
	
	private ArbolBinario ab=  new ArbolBinario();
	private int retardo = 1;
	
	
	
	private int helper (ArbolBinario ab) {
		if (ab.esHoja()) {
			return(retardo);
		}
		else {
			return(retardo+helper(ab.getHijoIzquierdo())+helper(ab.getHijoDerecho()));
			
		}
		
		
	}
	public int RetardoEnvio () {
		int res= 0;
		res= helper(ab);
		return(res);
		
		
	}

}
