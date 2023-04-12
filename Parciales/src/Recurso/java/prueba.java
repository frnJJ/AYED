package Recurso.java;

public class prueba {

	public static void main(String[] args) {
		
		ListaEnlazadaGenerica<Recurso> list3 = new ListaEnlazadaGenerica<Recurso>(); 
		Recurso n1 = new Recurso("A","Archivo");
		Recurso n2 = new Recurso("B","Archivo");
		Recurso n3 = new Recurso("C","Archivo");
		Recurso n4 = new Recurso("D.jpg","Archivo");
		Recurso n5 = new Recurso("E.jpg","Archivo");
		Recurso n6 = new Recurso("F.jpg","Archivo");
		Recurso n7 = new Recurso("G.jpg","Archivo");
		
		ArbolGeneral<Recurso> ag = new ArbolGeneral<Recurso>(n1);
		ListaEnlazadaGenerica<ArbolGeneral<Recurso>> list = new ListaEnlazadaGenerica<ArbolGeneral<Recurso>>();
		
	    ArbolGeneral<Recurso> a1 = new ArbolGeneral<Recurso>(n2);
	    ArbolGeneral<Recurso> a2 = new ArbolGeneral<Recurso>(n3);
	    ArbolGeneral<Recurso> a3 = new ArbolGeneral<Recurso>(n4);
	    list.agregarFinal(a1);
	    list.agregarFinal(a2);
	    list.agregarFinal(a3);
	    
	    ag.setHijos(list);
	    ListaEnlazadaGenerica<ArbolGeneral<Recurso>> list2 = new ListaEnlazadaGenerica<ArbolGeneral<Recurso>>();
	    ArbolGeneral<Recurso> a4 = new ArbolGeneral<Recurso>(n5);
	    ArbolGeneral<Recurso> a5 = new ArbolGeneral<Recurso>(n6);
	    ArbolGeneral<Recurso> a6 = new ArbolGeneral<Recurso>(n7);
	    
	    list2.agregarFinal(a4);
	    list2.agregarFinal(a5);
	    list2.agregarFinal(a6);
	    
	    a3.setHijos(list2);
	    
	    
	    list3 = ag.buscar(ag, 2);
	    
	    list3.comenzar();
	    
	    while (! list3.fin()) {
	    	System.out.println(list3.proximo().getNombre());
	    }
	    
	    
	    
		

	}

}
