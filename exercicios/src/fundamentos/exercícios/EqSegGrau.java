package fundamentos.exercícios;

import java.util.Scanner;

public class EqSegGrau {
	// 22.10.2020
	
	public static void main(String[] args) {
		
			
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Digite o valor de a: ");
		int a = ent.nextInt();
		
		System.out.println("Digite o valor de b: ");
		int b = ent.nextInt();
		
		System.out.println("Digite o valor de c: ");
		int c = ent.nextInt();
		
		int delta = (b * b) - (4 * a * c);
		
		System.out.printf("Sua equação é %dx² + %dx + %d = 0", a, b, c);
		
		System.out.println("O delta é :" + delta);
		
		double x1 = (- b + Math.sqrt(delta)) / (2 * a);
		
		double x2 = (- b - Math.sqrt(delta)) / (2 * a);
		
		System.out.printf("O valor da raiz¹ é: %.2f", x1);
		System.out.printf("\nO valor da raiz² é: %.2f", x2);
		
		
		
		
		
		
		ent.close();
	}
}
