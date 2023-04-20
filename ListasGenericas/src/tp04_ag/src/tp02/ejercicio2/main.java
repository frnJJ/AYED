package tp04_ag.src.tp02.ejercicio2;


public class main {

	public static void main(String[] args) {
		
		AreaEmpresa e1 = new AreaEmpresa(14,"a");
		AreaEmpresa e2 = new AreaEmpresa(13,"a");
		AreaEmpresa e3 = new AreaEmpresa(25,"a");
		AreaEmpresa e4 = new AreaEmpresa(10,"a");
		AreaEmpresa e5 = new AreaEmpresa(4,"a");
		AreaEmpresa e6 = new AreaEmpresa(7,"a");
		AreaEmpresa e7 = new AreaEmpresa(5,"a");
		AreaEmpresa e8 = new AreaEmpresa(6,"a");
		AreaEmpresa e9 = new AreaEmpresa(10,"a");
		AreaEmpresa e10 = new AreaEmpresa(18,"a");
		AreaEmpresa e11 = new AreaEmpresa(9,"a");
		AreaEmpresa e12 = new AreaEmpresa(12,"a");
		AreaEmpresa e13 = new AreaEmpresa(19,"a");
		
		
		
		
		
		ArbolGeneral<AreaEmpresa> M = new ArbolGeneral<AreaEmpresa>(e1);
		ArbolGeneral<AreaEmpresa> J = new ArbolGeneral<AreaEmpresa>(e2);
		ArbolGeneral<AreaEmpresa> K= new ArbolGeneral<AreaEmpresa>(e3);
		ArbolGeneral<AreaEmpresa> L = new ArbolGeneral<AreaEmpresa>(e4);
		ArbolGeneral<AreaEmpresa> A = new ArbolGeneral<AreaEmpresa>(e5);
		ArbolGeneral<AreaEmpresa> B = new ArbolGeneral<AreaEmpresa>(e6);
		ArbolGeneral<AreaEmpresa> C = new ArbolGeneral<AreaEmpresa>(e7);
		ArbolGeneral<AreaEmpresa> D = new ArbolGeneral<AreaEmpresa>(e8);
		ArbolGeneral<AreaEmpresa> E = new ArbolGeneral<AreaEmpresa>(e9);
		ArbolGeneral<AreaEmpresa> F = new ArbolGeneral<AreaEmpresa>(e10);
		ArbolGeneral<AreaEmpresa> G = new ArbolGeneral<AreaEmpresa>(e11);
		ArbolGeneral<AreaEmpresa> H = new ArbolGeneral<AreaEmpresa>(e12);
		ArbolGeneral<AreaEmpresa> I = new ArbolGeneral<AreaEmpresa>(e13);
		
		
		
		ListaGenerica<ArbolGeneral<AreaEmpresa>> h= new ListaEnlazadaGenerica<ArbolGeneral<AreaEmpresa>>();
		h.agregarFinal(J);
		h.agregarFinal(K);
		h.agregarFinal(L);
		
		
		M.setHijos(h);
		
		ListaGenerica<ArbolGeneral<AreaEmpresa>> h2= new ListaEnlazadaGenerica<ArbolGeneral<AreaEmpresa>>();
		
		h2.agregarFinal(A);
		h2.agregarFinal(B);
		h2.agregarFinal(C);
		
		
		J.setHijos(h2);
		
		
		ListaGenerica<ArbolGeneral<AreaEmpresa>> h3= new ListaEnlazadaGenerica<ArbolGeneral<AreaEmpresa>>();
		
		h3.agregarFinal(D);
		h3.agregarFinal(E);
		h3.agregarFinal(F);
		
		K.setHijos(h3);
		
		ListaGenerica<ArbolGeneral<AreaEmpresa>> h4= new ListaEnlazadaGenerica<ArbolGeneral<AreaEmpresa>>();
		
		h4.agregarFinal(G);
		h4.agregarFinal(H);
		h4.agregarFinal(I);
		
		L.setHijos(h4);
		
		System.out.println(M.esAncestro(e1,e7));

	}

}
