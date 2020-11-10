package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		// 10.11.2020 Susi dormindo no hospital...
		
		double[] notasAlunosA = new double[3];
		notasAlunosA[0] = 7.9;
		notasAlunosA[1] = 8;
		notasAlunosA[2] = 6.7;
		
		System.out.println(Arrays.toString(notasAlunosA));
		
		double totalAlunoA = 0;
		for (int i = 0; i < notasAlunosA.length; i++) {
			totalAlunoA += notasAlunosA[i];
		}
		
		System.out.println(totalAlunoA / notasAlunosA.length);
		
		double[] notasAlunosB = { 6.9, 8.9, 5.5}; 
		
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunosB.length; i++) {
			totalAlunoB += notasAlunosB[i];
		}
		System.out.println(totalAlunoB / notasAlunosB.length);
		
		double[] notas = { 8, 5, 3.3, 4 };
		for (double nota : notas) {
			System.out.print(nota + " ");
		}
		
	}

}
