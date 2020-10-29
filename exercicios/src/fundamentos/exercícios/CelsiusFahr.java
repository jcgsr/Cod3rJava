package fundamentos.exercícios;

import java.util.Scanner;

public class CelsiusFahr {
	// 22.10.2020
	public static void main(String[] args) {
		System.out.println("Programa converte °C para °F");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o grau em Celsius: ");
		double c = entrada.nextDouble();
		double f = c * 1.8 + 32;
		
		System.out.printf("%.2f°C equivale(m) a %.2f°F.", c, f);
		
		
		
		
		entrada.close();
	}
}
