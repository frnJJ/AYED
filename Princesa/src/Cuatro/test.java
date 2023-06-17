package Cuatro;


public class test {

	public static void main(String[] args) {
		
		
		
		ArbolGeneral<Integer> M = new ArbolGeneral<Integer>(2);
		ArbolGeneral<Integer> J = new ArbolGeneral<Integer>(7);
		ArbolGeneral<Integer> K= new ArbolGeneral<Integer>(5);
		ArbolGeneral<Integer> L = new ArbolGeneral<Integer>(2);
		ArbolGeneral<Integer> A = new ArbolGeneral<Integer>(6);
		ArbolGeneral<Integer> B = new ArbolGeneral<Integer>(9);
		ArbolGeneral<Integer> C = new ArbolGeneral<Integer>(5);
		ArbolGeneral<Integer> D = new ArbolGeneral<Integer>(11);
		ArbolGeneral<Integer> E = new ArbolGeneral<Integer>(4);

		M.agregarHijo(J);
		M.agregarHijo(K);
		J.agregarHijo(L);
		J.agregarHijo(A);
		A.agregarHijo(C);
		A.agregarHijo(D);
		K.agregarHijo(B);
		B.agregarHijo(E);
		
		
		Parcial p = new Parcial();
		p.setArbol(M);
		
		System.out.println(p.minEnNiveldeAB(3).getDato());
		
		
	}

}
