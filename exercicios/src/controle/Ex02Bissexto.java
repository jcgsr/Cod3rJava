package controle;

import java.util.Scanner;

public class Ex02Bissexto {
	// 26.10.2020
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		System.out.println("Informe um ano");
		int ano = ent.nextInt();
		
		if (((ano % 4 == 0) && (ano % 100 != 0)) || (ano % 400 == 0)) {
			System.out.printf("O ano %d é bissexto!", ano);
		} else {
			System.out.printf("O ano %d não é bissexto.", ano);
		}

		ent.close();
	}

}
