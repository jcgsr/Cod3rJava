package fundamentos.exercícios;

import java.util.Scanner;

public class FahrCelsius {
	// 22.10.2020
	public static void main(String[] args) {
		System.out.println("Programa converte °F para °C");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o grau em Fahrenheit: ");
		double f = entrada.nextDouble();
		double c = (f - 32) / 1.8;
		
		System.out.printf("%.2f°F equivale(m) a %.2f°C.", f, c);
		
		
		
		entrada.close();
	}	
}
