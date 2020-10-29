package controle;

import java.util.Scanner;

public class Ex04NumPrimo {
	// 26.10.2020

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		System.out.println("Informe um número: ");
		int n = ent.nextInt();
		
		int contador = 0;
		
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				contador++;
			}
		}
		
		if (contador == 0) {
			System.out.printf("\n%d é primo!", n);
		} else {
			System.out.printf("\n%d não é primo.", n);
		}
			

		ent.close();
	}
}
