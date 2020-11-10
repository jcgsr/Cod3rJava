package arrays;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		// 10.11.2020 Susi dormindo no hospital...
		
		Scanner ent = new Scanner(System.in);

		System.out.print("Quantos alunos? ");
		int qntAlunos = ent.nextInt();
		
		System.out.print("Quantas notas por aluno? ");
		int qntNotas = ent.nextInt();
		
		double[][] notasTurma = new double[qntAlunos][qntNotas]; 
		
		double total = 0;
		for (int i = 0; i < notasTurma.length; i++) {
			for (int j = 0; j < notasTurma[i].length; j++) {
				System.out.printf("Informe a nota %d do aluno %d", i + 1, j + 1);
				notasTurma[i][j] = ent.nextDouble();
				total += notasTurma[i][j];
			}
		}
		
		double media = total / (qntAlunos * qntNotas);
		System.out.println("A média da turma é: " + media);

		ent.close();

	}

}
