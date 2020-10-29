package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	// 24.10.2020
	
	public static void main(String[] args) {
		System.out.println("Informe o dia da semana");
		
		Scanner ent = new Scanner(System.in);
		String dia = ent.next();
		// next() uma única palavra
		// nextLine(múltiplas)
		
		/* Para comparar String não se deve usar (==)
		 * 
		 * mas sim equals
		 * 
		 * */
		
		if (dia.equalsIgnoreCase("domingo")) {
			System.out.println("1");
		} else if (dia.equalsIgnoreCase("segunda")) {
			System.out.println("2");
		} else if (dia.equalsIgnoreCase("terça")) {
			System.out.println("3");
		} else if (dia.equalsIgnoreCase("quarta")) {
			System.out.println("4");
		} else if (dia.equalsIgnoreCase("quinta")) {
			System.out.println("5");
		} else if (dia.equalsIgnoreCase("sexta")) {
			System.out.println("6");
		} else if (dia.equalsIgnoreCase("sábado")) {
			System.out.println("7");
		} else {
			System.out.println("Não é um dia da semana!");
			
			ent.close();
		}
	}
}  

