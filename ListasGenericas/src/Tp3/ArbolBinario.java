package Tp3;

public class ArbolBinario<T> {
	private T dato;
	private ArbolBinario<T> hijoIzquierdo;   
	private ArbolBinario<T> hijoDerecho; 

	
	public ArbolBinario() {
		super();
	}

	public ArbolBinario(T dato) {
		this.dato = dato;
	}

	/*
	 * getters y setters
	 * 
	 */
	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}
	
	/**
	 * Preguntar antes de invocar si tieneHijoIzquierdo()
	 * @return
	 */
	public ArbolBinario<T> getHijoIzquierdo() {
		return this.hijoIzquierdo;
	}

	public ArbolBinario<T> getHijoDerecho() {
		return this.hijoDerecho;

	}

	public void agregarHijoIzquierdo(ArbolBinario<T> hijo) {
		this.hijoIzquierdo = hijo;
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo) {
		this.hijoDerecho = hijo;
	}

	public void eliminarHijoIzquierdo() {
		this.hijoIzquierdo = null;
	}

	public void eliminarHijoDerecho() {
		this.hijoDerecho = null;
	}

	public boolean esVacio() {
		return this.getDato() == null && !this.tieneHijoIzquierdo() && !this.tieneHijoDerecho();
	}

	public boolean esHoja() {
		return (!this.tieneHijoIzquierdo() && !this.tieneHijoDerecho());

	}

	@Override
	public String toString() {
		return this.getDato().toString();
	}

	 
	public boolean tieneHijoIzquierdo() {
		return this.hijoIzquierdo!=null;
	}

	 
	public boolean tieneHijoDerecho() {
		return this.hijoDerecho!=null;
	}

	

    public ArbolBinario<T> espejo() {
    	ArbolBinario a = new ArbolBinario(this.getDato());
    	
    	if (this.tieneHijoDerecho()) {
    		a.agregarHijoIzquierdo(this.getHijoDerecho().espejo());
    		
    	}
    	if (this.tieneHijoIzquierdo()) {
    		a.agregarHijoDerecho(this.getHijoIzquierdo().espejo());
    	}
    	
    	return(a);
	}


	public void entreNiveles(int n, int m){
		ColaGenerica a = new ColaGenerica();
		ArbolBinario<T> arb = new ArbolBinario<T>();
		int nivel = 1;

		a.Encolar(this);
		a.Encolar(null);
		while ((!a.esVacia())) {
			arb = (ArbolBinario)a.Desencolar();
			if (arb == null) {
				nivel++;
				arb = (ArbolBinario)a.Desencolar();
			}
			if ((nivel >= n) && (nivel <=m)) {
				System.out.println(arb.getDato());
			}
			if (arb.tieneHijoDerecho()) {
				a.Encolar(arb.getHijoDerecho());
			}
			if (arb.tieneHijoIzquierdo()) {
				a.Encolar(arb.getHijoIzquierdo());
			}
			a.Encolar(null);
		}	
		
	}
	public int contarHojas() {

		if (this.esHoja()){
			return(1);
		}
		else {
			if (this.hijoDerecho !=null & this.hijoIzquierdo != null) {
			return(this.getHijoDerecho().contarHojas()+this.getHijoIzquierdo().contarHojas());
			}
			else
				return(1);
		}
	}


	

}
