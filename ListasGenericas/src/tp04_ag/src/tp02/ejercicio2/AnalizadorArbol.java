package tp04_ag.src.tp02.ejercicio2;

public class AnalizadorArbol {
	
	public static int devolverMaxProm (ArbolGeneral<AreaEmpresa> a) {
		ArbolGeneral<AreaEmpresa> aux;
		ListaEnlazadaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		int cont= 0;
		int suma= 0;
		ColaGenerica<ArbolGeneral<AreaEmpresa>> cola = new ColaGenerica<ArbolGeneral<AreaEmpresa>>();
		cola.Encolar(a);
		cola.Encolar(null);
		while (! cola.esVacia()) {
			aux = cola.Desencolar();
			if (aux != null) {
				cont ++;
				suma += aux.getDato().getRet();
				if (aux.tieneHijos()) {
					ListaGenerica<ArbolGeneral<AreaEmpresa>> hijos = aux.getHijos();
					while (! hijos.fin()) {
						cola.Encolar(hijos.proximo());
					}
				}
			}
			else {
				if (! cola.esVacia()) {
					suma = suma / cont;
					lista.agregarFinal(suma);
					suma = 0;
					cont = 0;
					cola.Encolar(null);
					
				}
			}
		}
		lista.comenzar();
		int max=-1;
		int aux2;
		while (! lista.fin()) {
			aux2 = lista.proximo();
			if (aux2 > max) {
				max= aux2;
			}
		}
		return max;
	}

}
