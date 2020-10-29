package fundamentos.exercícios;

import java.util.Scanner;

public class CuboQuadrado {
	// 22.10.2020
	
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double n = ent.nextDouble();
		
		double quadrado = Math.pow(n, 2);
		double cubo = Math.pow(n, 3);
		
		System.out.printf("O quadrado de %.2f é: %.2f", n, quadrado);
		System.out.printf("\nO cubo de %.2f é: %.2f", n, cubo);
	}
}
