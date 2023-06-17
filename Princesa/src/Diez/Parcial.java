package Diez;

public class Parcial {

	
	
	
	
	public void colorearArbol (ArbolBinario<String> a, Integer maxColor) {
		ColaGenerica<ArbolBinario<String>> cola = new ColaGenerica<ArbolBinario<String>>();
		ArbolBinario<String> aux;
		String color = "Negro";
		int cont = 0;
		a.setDato(color);
		cola.Encolar(a);
		cola.Encolar(null);
		while (! cola.esVacia()) {
			aux = cola.Desencolar();
			if (aux != null) {
				cont ++;
				if (cont <= maxColor) {
					aux.setDato(color);
				}
				else {
					aux.setDato("Verde");
				}
				if (aux.tieneHijoIzquierdo()) {
					cola.Encolar(aux.getHijoIzquierdo());
					
				}
				if (aux.tieneHijoDerecho()) {
					cola.Encolar(aux.getHijoDerecho());
				}
			}
			else {
				if (! cola.esVacia()) {
					cola.Encolar(null);
					if (color == "Rojo") {
						color = "Negro";
					}
					else {
						color = "Rojo";
					}
					cont = 0;
				}
			}
		}		
		
	}
}
