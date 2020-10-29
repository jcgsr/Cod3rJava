package fundamentos.exercícios;

import java.util.Scanner;

public class IMC {
	// 22.10.2020
	
	public static void main(String[] args) {
		System.out.println("IMC");
		
		Scanner ent = new Scanner(System.in);
		
		/*
		 * Scanner lê um número real no formato da sua máquina que deve usar 
		 * a vírgula para separar os decimais.
		 * 
		 * */
		
		
		System.out.print("Informe sua altura: ");
		double altura = ent.nextDouble();

		System.out.print("Informe seu peso: ");
		double peso = ent.nextDouble();
		
		double res = peso / (altura * altura);
		
		System.out.printf("Seu IMC é : %.2f", res);
		
		ent.close();
	}
}
