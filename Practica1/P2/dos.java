package ejer1;

public class uno {
	
	public static int[] puntodos(int a) {
		int [] array = new int[a];
		int b= a;
		for (int i= 0; i < array.length; i++) {
			array[i] = a;
			a+=b;
			
			
			
		}
		return array;
	}
}