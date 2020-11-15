package oo.desafio;

public class Program {

	public static void main(String[] args) {
		// 13.11.2020
		
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 2.43, 10);
		compra1.adicionarItem(new Produto("Camisa", 14.99), 3);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 12.88, 20);
		compra2.adicionarItem(new Produto("Cueca", 9.99), 13);

		Cliente cliente = new Cliente("Josias Rocha");
		cliente.compras.add(compra1);
		cliente.compras.add(compra2);
		
		System.out.println(cliente.obterTotal());
	}

}
