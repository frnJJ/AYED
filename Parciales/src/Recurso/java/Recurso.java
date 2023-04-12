package Recurso.java;
	public class Recurso {
		 String nombre;
		 String tipo; // archivo o carpeta
		 
		 
		 
		 public Recurso(String nombre, String tipo) {
		 super();
		 this.nombre = nombre;
		 this.tipo = tipo;
		 }
		 public Recurso() {
			 
		 }
		 
		 public boolean esImagen() {
			 if (tipo.equals("Archivo")) {
				 String ext = nombre.substring(nombre.indexOf('.') + 1);
				 if (ext.equals("jpg") || ext.equals("png") || ext.equals("jpeg"))
					 	return true;
			 } 
			 	return false;
		 }
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		
		

}
