package fundamentos.desafios;

import java.util.Scanner;

public class DesafioConversao {
	
	// 20.10.2020
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Digite o primeiro salário: ");
		String sal1 = entrada.nextLine().replace(",", ".");
		System.out.print("Digite o segundo salário: ");
		String sal2 = entrada.nextLine().replace(",", ".");
		System.out.print("Digite o terceiro salário: ");
		String sal3 = entrada.nextLine().replace(",", ".");
		
		System.out.printf("O primeiro salário é R$%s, o segundo R$%s e o terceiro R$%s. \n", sal1,  sal2, sal3);
		
		double s1 = Double.parseDouble(sal1);
		double s2 = Double.parseDouble(sal2);
		double s3 = Double.parseDouble(sal3);
		
		double media = (s1 + s2 + s3) / 3;
		
		System.out.printf("A média dos três salários é %.2f", media);
		
		entrada.close();
		
	}
}
