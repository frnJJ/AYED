package tp06.ejercicio3;

public class main {

	public static void main(String[] args) {
		
		
		
		mapa m = new mapa();
		
		TestGrafoImplListAdy G = new TestGrafoImplListAdy();
		
		VerticeImplListAdy<String> V1 = new VerticeImplListAdy("Ayuntamiento");
		VerticeImplListAdy<String> V2 = new VerticeImplListAdy("Parque Botanico");
		VerticeImplListAdy<String> V3 = new VerticeImplListAdy("Palacio Real");
		VerticeImplListAdy<String> V4 = new VerticeImplListAdy("El Tigre");
		VerticeImplListAdy<String> V5 = new VerticeImplListAdy("Holmenkollen");
		VerticeImplListAdy<String> V6 = new VerticeImplListAdy("Parque Vigeland");
		VerticeImplListAdy<String> V7 = new VerticeImplListAdy("Galeria Nacional");
		VerticeImplListAdy<String> V8 = new VerticeImplListAdy("Museo Munch");
		VerticeImplListAdy<String> V9 = new VerticeImplListAdy("Akker Brigge");
		VerticeImplListAdy<String> V10 = new VerticeImplListAdy("La Opera");
		VerticeImplListAdy<String> V11 = new VerticeImplListAdy("Fortaleza Akershus");
		VerticeImplListAdy<String> V12 = new VerticeImplListAdy("FolkMuseum");
		VerticeImplListAdy<String> V13 = new VerticeImplListAdy("Museo Fram");
		VerticeImplListAdy<String> V14 = new VerticeImplListAdy("Museo del Barco Polar");
		VerticeImplListAdy<String> V15 = new VerticeImplListAdy("Museo Vikingo");

		GrafoImplListAdy<String> g = new GrafoImplListAdy();
		
		
		
		
		V1.conectar(V2,10);
		V1.conectar(V3,5);
		V1.conectar(V9,20);
		V1.conectar(V4,15);
		
		V2.conectar(V8,1);
		V2.conectar(V7,15);
		V2.conectar(V1,10);
		
		V4.conectar(V1,15);
		V4.conectar(V8,15);
		V4.conectar(V10,5);
		
		V3.conectar(V1,5);
		V3.conectar(V12,5);
		
		V5.conectar(V6,30);
		
		V6.conectar(V5,30);
		V6.conectar(V12,20);
		V6.conectar(V7,10);
		
		V7.conectar(V6,10);
		V7.conectar(V2,15);
		
		V8.conectar(V2,1);
		V8.conectar(V4,15);
		
		V9.conectar(V1,20);
		V9.conectar(V12,30);
		V9.conectar(V15,30);
		
		V10.conectar(V4,5);
		V10.conectar(V11,10);
		
		V11.conectar(V10,10);
		
		V12.conectar(V6,20);
		V12.conectar(V3,5);
		V12.conectar(V9,30);
		V12.conectar(V13,5);
		
		V13.conectar(V12,5);
		V13.conectar(V14,5);
		
		V14.conectar(V13,5);
		V14.conectar(V15,5);
		
		V15.conectar(V14,5);
		V15.conectar(V9,30);
		
		
		g.agregarVertice(V1);
		g.agregarVertice(V2);
		g.agregarVertice(V3);
		g.agregarVertice(V4);
		g.agregarVertice(V5);
		g.agregarVertice(V6);
		g.agregarVertice(V7);
		g.agregarVertice(V8);
		g.agregarVertice(V9);
		g.agregarVertice(V10);
		g.agregarVertice(V11);
		g.agregarVertice(V12);
		g.agregarVertice(V13);
		g.agregarVertice(V14);
		g.agregarVertice(V15);
		
		ListaGenerica<String> l = new ListaEnlazadaGenerica<String>();
		
		l.agregarFinal("Akker Brigge");
		l.agregarFinal("Palacio Real");
		
		
		VisitaOslo oslo = new VisitaOslo();
		Parcial p = new Parcial();
		
		p.setGrafo(g);
		
		ListaGenerica<ListaGenerica<String>> list = oslo.paseoenmin(g, 86, l);
		
		list.comenzar();
		
		while (! list.fin()) {
			System.out.println(list.proximo());
		}
		
		
		

	}

}
