package oo.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	// 13.11.2020
	
	final String nome;
	final List<Compra> compras = new ArrayList<>();
	
	Cliente (String nome) {
		this.nome = nome;
	}
	
	double obterTotal() {
		double total = 0;
		
		for (Compra compra : compras) {
			total += compra.obterTotal();
		}
		
		return total;
	}
	
	
}
