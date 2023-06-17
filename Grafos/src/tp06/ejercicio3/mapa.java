package tp06.ejercicio3;

public class mapa {
	
	private Grafo<String> ciudades;
	public void setGrafo (Grafo g) {
		this.ciudades = g;
	}
	public ListaGenerica listadeC (String c1, String c2) {
		ListaGenerica<String> l = new ListaEnlazadaGenerica<String>();
		if (! this.ciudades.esVacio()) {
			int num = buscar(c1,ciudades.listaDeVertices());
			if (num != -1) {
				boolean [] vec = new boolean [ciudades.listaDeVertices().tamanio()+1];
				dfs(ciudades,ciudades.vetice(num),c2,l,vec);
			}
		}
		return l;
	}
	
	private boolean dfs (Grafo<String> G,Vertice<String> V, String c2, ListaGenerica<String> l, boolean [] vec) {
		l.agregarFinal(V.dato());
		vec[buscar(V.dato(),G.listaDeVertices())] = true;
		boolean ok = false;
		if (V.dato() == c2) {
			ok = true;
		}
		else {
			ListaGenerica<Arista<String>> ady = G.listaDeAdyacentes(V);
			ady.comenzar();
			while (! ady.fin() && !ok) {
				Arista<String> aux = ady.proximo();
				if (! vec[buscar(aux.verticeDestino().dato(),G.listaDeVertices())] ) {
					ok = dfs(G,aux.verticeDestino(),c2,l,vec);
				}
			}
		}
		if (! ok) {
			l.eliminarEn(l.tamanio());
		}
		return ok;
		
	}
	
	private  int buscar (String c1, ListaGenerica<Vertice<String>> l) {
		l.comenzar();
		while (! l.fin()) {
			Vertice V = l.proximo();
			if (V.dato() == c1) {
				return V.getPosicion();
				
			}
		}
		return -1;
		
	}
	
	
	
	

	

}
