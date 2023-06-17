package tp04_ag.src.tp02.ejercicio2;

public class ReddeAguaPotable<T> {
	
	private ArbolGeneral<T> arb;
	
	public ReddeAguaPotable (ArbolGeneral<T> a) {
		this.arb = a;
	}
	
	public double minimocaudal (double caudal) {
		double min = minimo(this.arb, caudal);
		return min;
	}
	private double minimo (ArbolGeneral<T> a ,double caudal) {
		double aux = caudal;
		if (a.esHoja()) {
			return (caudal);
		}
		else {
			if (a.tieneHijos()) {
				ListaGenerica<ArbolGeneral<T>> hijos = a.getHijos();
				hijos.comenzar();
				while (! hijos.fin()) {
					aux = Math.min(caudal,(minimo(hijos.proximo(),(caudal / hijos.tamanio()))));
				}
			}
			
			return aux;
			
		}
		
	}
	

}
