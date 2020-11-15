package oo.heranca.desafio;

public class Carro {
	// 14.11.2020
	
	int velocidade = 0;
	
	int acelerar() {
		return velocidade += 5;		
	}
		
	int frear() {
		
		if (velocidade == 0) {
			System.out.println("Velocidade mínima já");
			return velocidade = 0;
		}
		return velocidade -= 5;
	}
}
