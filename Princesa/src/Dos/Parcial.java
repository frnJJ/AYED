package Dos;

public class Parcial {
	
	
	public int contar1 (ArbolGeneral<Integer> a, int valor) {
		if (! a.esVacio()) {
			int cant = aux(a,valor,0);
			return cant;
		}
		return -1;
	}
	
	
	private int aux (ArbolGeneral<Integer> a, int valor, int act) {
		int cantidad = 0;
		act += a.getDato();
		if (a.esHoja()) {
			if (act == valor) 
				return 1;	
		}
		else {
			if (act < valor) {
				ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
				hijos.comenzar();
				while (! hijos.fin()) {
					cantidad += aux(hijos.proximo(), valor, act);
				}
			}

		}
		return cantidad;
	}

}
