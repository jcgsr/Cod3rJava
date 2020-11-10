package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		// 10.11.2020 Susi dormindo no hospital...
		
		Scanner ent = new Scanner(System.in);

		System.out.println("Desafio Array");
		System.out.print("Digite a quantidade de notas: ");
		int notas = ent.nextInt();
		double[] notasArray = new double[notas];
		
		for (int i = 0; i < notas; i++) {
			System.out.print("Digite nota #" + (i + 1) + ": ");
			notasArray[i] = ent.nextDouble();
		}
		System.out.println("As notas são " + Arrays.toString(notasArray));
		
		double total = 0;
		for (double nota : notasArray) {
			total += nota;
		}
		
		System.out.println("A média é: " + total / notasArray.length);
		ent.close();

	}

}
