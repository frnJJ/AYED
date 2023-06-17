package Seis;

public class Parcial {
	
	private ArbolGeneral<Integer> a;
	
	public void setArbol (ArbolGeneral<Integer> a) {
		this.a = a;
	}
	public Integer resolver () {
		if (! a.esVacio()) {
			int num =  aux(a,-1);
			return num;
		}
		return -1;
		
	}
	
	private Integer aux (ArbolGeneral<Integer> a, Integer max) {
		if (! a.esHoja()) {
			ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
			hijos.comenzar();
			while (! hijos.fin()) {
				max = Math.max(max, aux(hijos.proximo(),max));
			}
			
		}
		if (a.getDato() > max) {
			max = a.getDato();
		}
		return max;
	}

}
