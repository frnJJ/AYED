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
	
	
	
	private int buscar2 (ListaGenerica<Vertice<String>> l, String nom) {
		l.comenzar();
		while (! l.fin()) {
			Vertice<String> aux = l.proximo();
			if (aux.dato() == nom) {
				return aux.getPosicion();
			}
		}
		return -1;
	}
	
	private void marcar2 (ListaGenerica<Vertice<String>> l, ListaGenerica<String> rest, boolean [] marca) {
		rest.comenzar();
		while (! rest.fin()) {
			int pos = buscar2(l,rest.proximo());
			System.out.println("El valor de POS = "+pos);
			marca[pos] = true;
		}
	}
	
	
	private void dfs2(int pos,Grafo<String> g, boolean [] marca, int tiempo, ListaGenerica<ListaGenerica<String>> l, ListaGenerica<String> act) {
		marca[pos] = true;
		Vertice<String> aux  = g.vetice(pos);
		act.agregarFinal(aux.dato());
		if ( tiempo == 0) {
			l.agregarFinal(act.clonar());
		}
		else {
			ListaGenerica<Arista<String>> ady = g.listaDeAdyacentes(aux);
			ady.comenzar();
			while(! ady.fin()) {
				Arista<String> v = ady.proximo();
				int j = v.verticeDestino().getPosicion();
				if (! marca[j] && tiempo - v.peso() >= 0) {
					dfs2(j,g,marca,tiempo-v.peso(),l,act);
				}
			}
		}
		act.eliminarEn(act.tamanio());
		marca[pos] = false;
	}
	
	
	public ListaGenerica<ListaGenerica<String>> paseoenmin (Grafo<String> g, int tiempo, ListaGenerica<String> rest){
		ListaGenerica<ListaGenerica<String>> camino = new ListaEnlazadaGenerica<ListaGenerica<String>>();
		if (! g.esVacio()) {
			int pos = buscar2(g.listaDeVertices(),"Ayuntamiento");
			if (pos != -1) {
				boolean [] marca = new boolean [g.listaDeVertices().tamanio()+1];
				for (int i = 0;  i < marca.length; i++) marca[i] = false;
				marcar2(g.listaDeVertices(),rest,marca);
				dfs2(pos,g,marca,tiempo,camino,new ListaEnlazadaGenerica<String>());
				
			}
		}
		return camino;
		
	}
	

}
