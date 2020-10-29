package fundamentos.desafios;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		System.out.println("Desafio Calculadora");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		double n1 = entrada.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		double n2 = entrada.nextDouble();
		
		System.out.print("Escolha: +, -, *, /, %(mod):");
		String operador = entrada.next();
		
		// Lógica
		double res = "+".equals(operador) ? n1 + n2 : 0;
		res = "-".equals(operador) ? n1 - n2 : res;
		res = "+".equals(operador) ? n1 + n2 : 0;
		res = "*".equals(operador) ? n1 * n2 : res;
		res = "/".equals(operador) ? n1 / n2 : res;
		res = "/%".equals(operador) ? n1 % n2 : res;
				
		
		System.out.printf("\n%f %s %f = %.2f", n1, operador, n2, res);
		entrada.close();
	}
}
