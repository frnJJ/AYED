package Recurso.java;

public class Personaje {
	private String nombre;
	private String tipo;
	
	public Personaje(String nombre, String tipo) {
	    this.nombre = nombre;
		this.tipo = tipo;
		 }
	 public String getNombre() {
		 return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTipo() {
		return this.tipo;
	}
	
	 public boolean esDragon(){
		return this.getTipo().equals("Dragon");
	 }
	 
	 
	public boolean esPrincesa(){
		return this.getTipo().equals("Princesa");
	}


}
