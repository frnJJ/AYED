package P5;

public class Parametros {
	private int [] a = new int [3];
	
	public Parametros () {
		
	}
	public Parametros (int a) {
		this.a = new int [a];
	}
	public void agregar (int i, int dato) {
		if (i < a.length) {
			a[i] = dato;
		}
	}
	public String toString() {
		return("promedio = "+a [0]+" min = "+a [1]+" Max = "+a [2]);
				
	}

}
