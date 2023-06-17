package tp06.ejercicio3;

public class VisitaOslo {
	
	private Grafo grafo;
	
	public void set_grafo(Grafo g) {
		this.grafo = g;
	}
	private void ini (boolean vec []) {
		for (int i =1; i < vec.length; i++) {
			vec[i] = false;
		}
	}
	
	private int buscar (ListaGenerica<Vertice<String>> l, String lug) {
		l.comenzar();
		Vertice<String> aux;
		while (! l.fin()) {
			aux = l.proximo();
			if (aux.dato() == lug) {
				return aux.getPosicion();
			}
			
		}
		return 0;
		
	}
	
	private void marcar (boolean [] vec , ListaGenerica<String> l, ListaGenerica<Vertice<String>> a) {
		l.comenzar();
		while (! l.fin()) {
			vec[buscar(a, l.proximo())] = true;
				
		
		}
		
	}
	
	private boolean dfs (int pos,Grafo<String> g, String dest, int tiempo, boolean [] vec, ListaGenerica<String> l) {
		boolean encontre = false;
		l.agregarFinal(g.vetice(pos).dato());
		vec[pos] = true;
		if (g.vetice(pos).dato() == dest) {
			System.out.println("Entre");
			encontre = true;
		}
		else {
			ListaGenerica<Arista<String>> ady = g.listaDeAdyacentes(g.vetice(pos));
			ady.comenzar();
			while (! ady.fin()) {
				Arista<String> aux = ady.proximo();
				if (! vec[aux.verticeDestino().getPosicion()]) {
					tiempo = tiempo - aux.peso();
					if (tiempo >= 0) {
						encontre = dfs(aux.verticeDestino().getPosicion(),g,dest,tiempo,vec,l);
					}
					
				}
				
			}
			
		}
		if (!encontre) {
			l.eliminarEn(l.tamanio());
		}
		return encontre;
		
	}
	
	
	
	
	public ListaGenerica<String> paseoenBici(Grafo<String> lugares, String destino, int maxTiempo, ListaGenerica<String> rest){
		ListaGenerica<String> camino = new ListaEnlazadaGenerica<String>();
		int pos = buscar(lugares.listaDeVertices(),"Ayuntamiento");
		if (pos != 0) {
			boolean [] vec = new boolean [lugares.listaDeVertices().tamanio()+1];
			ini(vec);
			marcar(vec,rest,lugares.listaDeVertices());
			dfs(pos,lugares,destino,maxTiempo,vec,camino);
		}
		return camino;
		
	}

}
