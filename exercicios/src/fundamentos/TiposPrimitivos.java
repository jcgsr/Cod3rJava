package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		
		// Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numerosVoos = 542;
		int id = 56789;
		long pontosAcumulados =  3_134_845_223L;
		
		// Tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = false;
		
		// Tipos caractere
		char status = 'j'; // ativo
		
		// Dias de empresa
		System.out.println("O funcionário tem " + anosDeEmpresa * 365 + " dias de empresa.");
		
		// Números de voos
		System.out.println("O funcionário tem " + numerosVoos / 2 + " voos.");
		
		// Pontos por R$
		System.out.println("O funcionário recebe " + pontosAcumulados / vendasAcumuladas + " a cada R$.");
		
		System.out.println("O funcionário " + id + " ganha R$" + salario + ".");
		System.out.println("Férias: " + estaDeFerias);
		System.out.println("Status: " + status);
	}
}
