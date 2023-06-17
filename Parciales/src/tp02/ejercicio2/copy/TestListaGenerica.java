package tp02.ejercicio2.copy;

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
	

	ColaGenerica cola = new ColaGenerica();
	PilaGenerica pila = new PilaGenerica();

	
	//System.out.println(pila.esVacia());
	
	pila.Apilar(10);
	pila.Apilar(999);
	pila.Apilar(40);
	
	//System.out.println(pila.tope());
	
	//System.out.println(pila.desApilar());
	//System.out.println(pila.desApilar());
	//System.out.println(pila.tope());
	
	TestBalance t =  new TestBalance();
	
	

	System.out.println(t.verificar("(([]))"));
	
	}
	
}
