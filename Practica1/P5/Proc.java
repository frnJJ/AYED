package P5;

public class Proc {
	
	public static int[] getA(int [] a) {
		int min = 99999;
		int max = -9999;
		int prom = 0; 
		for (int num: a){
			if (num < min) {
				min = num;
			}
			if (num > max) {
				max = num;
			}
			prom += num;
		}
		prom = prom / a.length;
		int [] b = new int [3];
		b[0]= prom;
		b[1]= min;
		b[2]= max;
		
		return b;
		
		
	}
	
	public static void getB (Parametros P, int [] array) {
		int min = 99999;
		int max = -9999;
		int prom = 0; 
		for (int num: array){
			if (num < min) {
				min = num;
			}
			if (num > max) {
				max = num;
			}
			prom += num;
		}
		prom = prom / array.length;		
		P.agregar(0, prom);
		P.agregar(1, min);
		P.agregar(2, max);
		
	}

}