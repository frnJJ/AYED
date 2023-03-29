package tp02.ejercicio1;

public class TestListaDeEnterosConArreglos {
	
	public static void recur (ListaDeEnterosEnlazada l1) {
		
		if (l1.fin()) {
			
		}
		else {
			int t = l1.proximo();
			recur(l1);
			System.out.println(t);
		}
		
		
		
	}
	public static void funcion (int n) {
		if (n == 1) {
			System.out.println(1);
		}
		else {
			if ((n % 2) == 0) {
				n = n / 2;
				System.out.println(n);
			}
			else {
				n =  (3 * n) + 1;
				System.out.println(n);
			}
			funcion(n);
		}
	}
	
	
	public static void main(String[] args) {
		
		ListaDeEnterosConArreglos list = new ListaDeEnterosConArreglos();
		
		int num = 6;
		while (num != 0) {
			
			list.agregarFinal(num);
			
			num += -2;
		
			
		}
		
		list.comenzar();
		while (! (list.fin())) {
			System.out.println(list.proximo());
			
		}
		
		ListaDeEnterosEnlazada list2 = new ListaDeEnterosEnlazada();
		
		while (num != 10) {
			list2.agregarFinal(num);
			num += 2;
			
		}
		
		list2.comenzar();
		
		while(!(list2.fin())){
			System.out.println(list2.proximo());
			
			
		}
		System.out.println("--------------------------------");
		Ejecicio1_6 asd = new Ejecicio1_6();
		ListaDeEnterosEnlazada list3 = new ListaDeEnterosEnlazada();
	    list3  = asd.calcularSucesion(6);
	    list3.comenzar();
	    while (!(list3.fin())) {
	    	System.out.println(list3.proximo());
	    }
	    list3.comenzar();
	    int res = list3.elemento(4);
	    System.out.println(res);
	    
	    	
	}

}
