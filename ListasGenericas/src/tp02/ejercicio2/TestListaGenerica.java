package tp02.ejercicio2;

public class TestListaGenerica {
	
	public static void main (String [] args) {
	Estudiante a = new Estudiante();
	Estudiante b = new Estudiante();
	Estudiante c = new Estudiante();
	Estudiante x = new Estudiante();
	
	Estudiante [] v = new Estudiante [3];
	
	v[0] = a;
	v[1] = b;
	v[2] = c;
	
	ListaEnlazadaGenerica list = new ListaEnlazadaGenerica();
	
	list.agregarFinal(b);
	list.agregarFinal(b);
	list.agregarFinal(c);
	list.agregarFinal(x);
	
	list.comenzar();
	
	Estudiante aux;
	

	v[0].setApellido("Garcia");
	list.agregar(v);
	
	while (! list.fin()) {
		
		aux = (Estudiante) (list.proximo());
		System.out.println(aux.tusDatos());
		
	}
	
	
	
	}
	
}
