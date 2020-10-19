package fundamentos;

public class TipoString {
	// 19.10.2020 Susi no hospital... e agora, 04:03
	
	public static void main(String[] args) {
		System.out.println("Susi no hospital com Simone.".charAt(0));
		
		String s = "Susi no hospital com Simone";
		System.out.println(s.concat("!!!"));
		
		// String é imutável
		System.out.println(s.startsWith("Vou"));
		System.out.println(s.endsWith("vou"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Josias";
		var sobrenome = "Guerra";
		var idade = 75;
		var sal = 1150.56;
		
		System.out.printf("Meu pai: %s %s tem %d anos e ganha R$ %.2f ", nome, sobrenome, idade, sal);
		String frase = String.format("\nMeu pai: %s %s tem %d anos e ganha R$ %.2f ", nome, sobrenome, idade, sal);
		System.out.println(frase);
	}
}
