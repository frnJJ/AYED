package tp02.ejercicio1;

public class Ejecicio1_6 {
	private ListaDeEnterosEnlazada list = new ListaDeEnterosEnlazada();
	
	public ListaDeEnterosEnlazada calcularSucesion (int n) {
		if (n == 1) {
			
		}
		else {
			list.agregarFinal(n);
			if ((n % 2) == 0) {
				n = n / 2;
			}
			else {
				n =  (3 * n) + 1;
			}
			calcularSucesion(n);
		}
		return(this.list);
		
	}

}
