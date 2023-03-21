package ejer1;

public class uno {
	
	public void getnumbers(int a, int b) {
		if (a <= b) {
			for (int i = a ;i <= b ;i++) {
				System.out.println(i);	
			}
		}
	}
	public void getnumbers2 (int a, int b) {
		int i = a;
		while (i <= b) {
			System.out.println(i);
			i++;
		}
	}
	public void getnumbers3 (int a, int b) {
		if (a <= b) {
			System.out.println(a);
			a++;
			getnumbers3(a,b);
		}
	}
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


