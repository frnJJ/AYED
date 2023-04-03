package tp02.ejercicio2;

public class TestBalance {
	private  PilaGenerica p = new PilaGenerica();
	private char [] array;
	 

	public boolean verificar (String a){
		int aux2; 
		boolean ok = true;
		array = new char [a.length()];
		for (int i = 0; i<a.length();i++) {
			array[i] =	a.charAt(i);
				
		}
		
		
		for (char aux: array) {
			if (((int)aux == (91)) || ((int)aux == (40)) || ((int)aux == (123))) {
				p.Apilar((int)aux);
			}
			else {
				if ((! p.esVacia()) && (((int)aux == 93) || ((int)aux == 41) || ((int)aux == 125) )) {

					aux2 = (int)p.desApilar();	
				
			}
				else{
					ok = false;
				}
			}
			
		}
		return (ok);
			
		
	
	
	
	}
}
