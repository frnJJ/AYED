package tp06.ejercicio3;

public class Parcial {
	
private Grafo<String> g;


public void setGrafo (Grafo<String> g) {
	this.g = g;
}

public ListaGenerica<String> caminoMasCorto (String c1, String c2){
	ListaGenerica<String> camino = new ListaEnlazadaGenerica<String>();
	if (! g.esVacio()) {
		int pos = buscar(c1,g.listaDeVertices());
		if (pos != -1) {
			boolean [] marca = new boolean [g.listaDeVertices().tamanio() + 1];
			for (int i = 0; i < marca.length; i++) marca[i] = false;
			dfs(pos,g,c2,marca, camino, 0, 9999, new ListaEnlazadaGenerica<String>());
			
		}
		
	}
	return camino;
	
}

private int buscar (String c, ListaGenerica<Vertice<String>> l) {
	
	l.comenzar();
	while (! l.fin()) {
		Vertice<String> aux = l.proximo();
		if (aux.dato().equals(c)) {
			return aux.getPosicion();
		}
		
	}
	return -1;
	
}

private void clonar (ListaGenerica<String> act, ListaGenerica<String> camino) {
	camino.comenzar();
	while (! camino.fin()) {
		camino.eliminar(camino.proximo());
	}
	act.comenzar();
	while (! act.fin()) {
		camino.agregarFinal(act.proximo());
	}
	
	
}

private int dfs (int pos, Grafo<String> g, String c2, boolean [] marca, ListaGenerica<String> camino,int distancia, int distmin, ListaGenerica<String> act ) {
	act.agregarFinal(g.vetice(pos).dato());
	System.out.println(g.vetice(pos).dato());
	marca[pos] = true;
	Vertice<String> aux = g.vetice(pos);
	if (aux.dato().equals(c2)) {
		clonar(act,camino);
		distmin = distancia;
	}
	else {
		ListaGenerica<Arista<String>> ady = g.listaDeAdyacentes(aux);
		ady.comenzar();
		while (!ady.fin()) {
			Arista<String> arist = ady.proximo();
			if (!marca[arist.verticeDestino().getPosicion()] && distancia + arist.peso() < distmin) {
				distmin = dfs(arist.verticeDestino().getPosicion(),g,c2,marca,camino,distancia+arist.peso(),distmin,act);
			}
		}
	}
	
	marca[pos] = false;
	act.eliminarEn(act.tamanio());
	
	return distmin;
	
	
}

}
