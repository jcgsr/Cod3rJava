package controle;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// 26.10.2020
		
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
	    int n = ent.nextInt();
	    
	    if (n >= 0 && n <= 10) {
	    	System.out.printf("%d está entre 0 e 10!", n);
	    	if (n % 2 == 0) {
	    		System.out.printf("\nE %d é par!", n);
	    	} else {
	    		System.out.printf("\nE %d é impar!", n);
	    	}
	    } else {
	    	System.out.printf("\n%d não está entre 0 e 10.", n);
	    }
		
		ent.close();
	}

}
