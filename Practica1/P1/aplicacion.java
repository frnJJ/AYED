package ejer1;

import java.util.Scanner; 

public class aplicacion {
	public static void main(String[] args) {
		uno c =new uno();
		c.getnumbers3(-6,10);
		
		Scanner consola = new Scanner(System.in);
		System.out.println("ingrese el valor N");
		int n = consola.nextInt();
		for (int num: uno.puntodos(n)) {
			System.out.println(num+" ");
		}
	}
		
		
}