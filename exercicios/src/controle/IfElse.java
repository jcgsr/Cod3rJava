package controle;

import javax.swing.JOptionPane;

public class IfElse {
	// 23.10.2020
	
	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog("Informe número:");
		
		int n = Integer.parseInt(valor);
		
		if (n % 2 == 0) {
			System.out.println("PAR!");
		} else {
			System.out.println("ÍMPAR");
		}
	}
}
