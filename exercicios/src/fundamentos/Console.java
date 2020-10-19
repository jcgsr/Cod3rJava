package fundamentos;

import java.util.Scanner;
// java.util depois de lang é o mais utilizado
// 19.10.2020

public class Console {
	
	public static void main(String[] args) {
		
		System.out.print("Olá");
		System.out.println("Olá");
		System.out.printf("Olá, %s, %d, %.2f \n", "Fulano", 123, 12.45);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade= entrada.nextInt();
		
		System.out.printf("Nome completo = %s %s \n", nome, sobrenome);
		System.out.printf("Idade = %d anos.", idade);
		
		entrada.close();
	}
}
