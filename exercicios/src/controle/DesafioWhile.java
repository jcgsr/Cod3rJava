package controle;

import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {
		// 24.10.2020
		
		int qntNotas = 0;
		double nota = 0;
		double total = 0;
				
		System.out.println("Programa para calcular média toral e quantidade de notas");
				
		Scanner ent = new Scanner(System.in);	
	
				
		while (nota != -1) {
			System.out.print("Digite uma nota nota entre 0 e 10 (-1 para sair): ");
			nota = ent.nextDouble();		
			
			if (nota <= 10 && nota >= 0) {
				qntNotas++;	
				total += nota;
			} else if (nota != -1){
				System.out.println("Nota inválida!");
			}
		
		}
		
		// média
		double media = total / qntNotas;
		System.out.printf("Foram informadas %d notas e a média delas é igual a %.2f!", qntNotas, media);
				
		for (int i = 10; i >= 0; i -=2 ) {
			System.out.printf("\nContador = %d\n");
		}
		
		ent.close();
	}
}
