package Recurso.java;

public class ArbolGeneral<T> {
		 private T dato;
		 private ListaGenerica<ArbolGeneral<T>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		 
		 
		 public ArbolGeneral(T dato) {
			 this.dato = dato;
		 }
		 
		 
		 public ArbolGeneral(T dato, ListaGenerica<ArbolGeneral<T>> hijos){
			 this(dato);
			 if (hijos==null)
				 this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
			 else
				 this.hijos = hijos;
		 }
		 
		 public boolean esHoja() {
			 return (this.hijos.esVacia());
		 }
		 
		 public T getDato() {
			 return dato;
		 }
		 
		 
		 public void setDato(T dato) {
			 this.dato = dato;
		 }
		 
		 
		 
		 public void setHijos(ListaGenerica<ArbolGeneral<T>> hijos) {
			 if (hijos==null)
				 this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
			 else
				 this.hijos = hijos;
		 }
		 
		 public ListaGenerica<ArbolGeneral<T>> getHijos (){
			 return (this.hijos);
		 }
		 
		public ListaEnlazadaGenerica<Recurso> buscar(ArbolGeneral<Recurso> ag, int nivelbuscado){
				ListaEnlazadaGenerica<Recurso> resul = new ListaEnlazadaGenerica<Recurso>();
				ColaGenerica<ArbolGeneral<Recurso>> cola= new ColaGenerica<ArbolGeneral<Recurso>>();
				ArbolGeneral<Recurso> aux;
				int nivel= 0;
				cola.Encolar(ag);
				cola.Encolar(null);
				while(! cola.esVacia()) {
						aux = cola.Desencolar();
						if (aux != null) {
							System.out.println(aux.getDato().getTipo());
							if (nivelbuscado == nivel) {
								if (aux.getDato().esImagen()) {
									resul.agregarFinal(aux.getDato());
								}
							}
							else {
								ListaEnlazadaGenerica<ArbolGeneral<Recurso>> hijos = (ListaEnlazadaGenerica<ArbolGeneral<Recurso>>) aux.getHijos();
								while (! hijos.fin()) {
									cola.Encolar(hijos.proximo());
								}		
							}
					}
					else {
							if (nivel < nivelbuscado) {
								nivel ++;
								cola.Encolar(null);
							}
					}
				}
				return resul;
			 
			 
		}


}
