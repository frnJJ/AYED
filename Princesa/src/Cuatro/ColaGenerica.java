package Cuatro;


public class ColaGenerica<T> {
	
		private ListaEnlazadaGenerica l = new ListaEnlazadaGenerica();
		private int tamanio = 0;
		
		public void Encolar (T dato) {
			
			l.agregarFinal(dato);
			tamanio ++;
				
			
		}
		
		
		public T Desencolar () {
			T aux= null;
			if (! l.esVacia()) {
				l.comenzar();
				aux = (T)l.proximo();
				l.eliminarEn(1);
				tamanio += -1;
			}
			
			return aux;
		}
		
		public T tope() {
			T aux= null;
			l.comenzar();
			if (! l.esVacia()) {
				aux = (T) l.proximo();
				l.comenzar();
			}
			return aux;
			
		}
		
		public boolean esVacia () {
			return tamanio == 0;
		}
		

	

}
