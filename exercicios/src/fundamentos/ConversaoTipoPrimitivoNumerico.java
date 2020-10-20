package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		// 20.10.2020 madrugadaS
		
		double a = 1; // conversão implícita
		System.out.println(a);
		
		float b = (float) 1.2323424; // conversão explícita
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c; // conversão explícita (CAST)
		System.out.println(d);
		
		double e = 1.999999;
		int f = (int) e; // conversão explícita (CAST)
		System.out.println(f);
	}
}
