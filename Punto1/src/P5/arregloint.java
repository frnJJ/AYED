package P5;

import java.util.Scanner;

public class arregloint {

	

public static void main(String[] args) {	
		int [] a1 =new int [10];
		Parametros P = new Parametros(3);
		
		
		for (int i=0;i<10;i++) {
		Scanner c = new Scanner(System.in);
		a1[i] = c.nextInt();
	}
	Proc.getB(P, a1);
	System.out.println(P.toString());
}
}
