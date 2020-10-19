package fundamentos;

public class NotacaoPonto {

	// 19.10.2020 Susi dormindo no hospital...

	public static void main(String[] args) {
		String s = "Bom dia, Java!";
		s = s.replace("Java", "JavaScript");
		s = s.toUpperCase();
		s = s.concat(" E Java!");

		String x = "Jovane".toUpperCase();
		System.out.println(x);
		System.out.println(s);

		String y = "Boa madrugada, Cod3r!"
				.replace("Boa", "Bela")
				.toUpperCase()
				.concat(" Estudando muito!");

		System.out.println(y);
		
		
		// Tipos primitivos não tem operador "."
	}

}
