package fundamentos.exercícios;

import java.util.Scanner;

public class AreaTriangulo {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Digite a base: ");
		double base = ent.nextDouble();

		System.out.println("Digite a altura: ");
		double altura= ent.nextDouble();
		
		double area = base * altura / 2;
		
		System.out.printf("Área é igual a %.2f", area);
		
		ent.close();
	}
}
