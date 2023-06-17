package Siete;

public class test {

	public static void main(String[] args) {
		ArbolGeneral<Integer> G = new ArbolGeneral<Integer>(1);
		ArbolGeneral<Integer> E = new ArbolGeneral<Integer>(3);
		ArbolGeneral<Integer> F = new ArbolGeneral<Integer>(2);
		ArbolGeneral<Integer> J = new ArbolGeneral<Integer>(3);
		ArbolGeneral<Integer> A = new ArbolGeneral<Integer>(7);
		ArbolGeneral<Integer> B = new ArbolGeneral<Integer>(9);
		ArbolGeneral<Integer> C = new ArbolGeneral<Integer>(6);
		ArbolGeneral<Integer> D = new ArbolGeneral<Integer>(10);
		ArbolGeneral<Integer> H = new ArbolGeneral<Integer>(6);
		ArbolGeneral<Integer> I = new ArbolGeneral<Integer>(10);
		
		
		G.agregarHijo(E);
		G.agregarHijo(F);
		G.agregarHijo(J);
		E.agregarHijo(A);
		E.agregarHijo(B);
		E.agregarHijo(C);
		F.agregarHijo(D);
		J.agregarHijo(H);
		J.agregarHijo(I);
		
		
		Parcial p = new Parcial();
		
		p.setArbol(G);
		
		ListaGenerica<Integer> l = p.resolver();
		
		l.comenzar();
		
		while (! l.fin()) {
			System.out.println(l.proximo());
		}
		

	}

}
