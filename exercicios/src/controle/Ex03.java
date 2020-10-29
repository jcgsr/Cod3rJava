package controle;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		System.out.println("Informe a primeira nota: ");
		double n1 = ent.nextDouble();

		System.out.println("Informe a segunda nota: ");
		double n2 = ent.nextDouble();
		
		double media = (n1 + n2) / 2;
		
		if (media >= 7) {
			System.out.println("Aprovado");
		} else if (media < 7 && media > 4) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado.");
		}
		
		ent.close();
	}
}
