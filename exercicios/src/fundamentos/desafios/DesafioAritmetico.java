package fundamentos.desafios;

public class DesafioAritmetico {
	
	public static void main(String[] args) {
		
		double a = 6 * (3 + 2);
		double b = Math.pow(a, 2);
		double c = 3 * 2;
		double d = b / c; // principal esquerdo - 150
		
		System.out.println(d);
		
		double aa = (1 - 5) * (2 - 7) / 2;
		double bb = Math.pow(aa, 2); // principal direito - 100
		
		System.out.println(bb);
		
		double dd = d - bb;
		System.out.println(dd); // 50
		double e = Math.pow(dd, 3);

		double ee = Math.pow(10, 3);
		
		double r = e / ee;
		
		System.out.println(r);
	}
}
