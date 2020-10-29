package fundamentos.desafios;

public class DesafioLogicos {
	
	public static void main(String[] args) {
		boolean t1 = false;
		boolean t2 = false;
		
		boolean tv50 = t1 && t2;
		boolean tv32 = t1 ^ t2; // "ou" exclusivo
		boolean sorvete = t1 || t2;
		
		System.out.println("Comprou a tv de 50\"?", tv50);
		System.out.println("Comprou a tv de 32\"?", tv32);
		System.out.println("Comprou sorvete\"?", sorvete);
		
		// operador unário
		System.out.println("Mais saudável?" + !sorvete);
	}
}
