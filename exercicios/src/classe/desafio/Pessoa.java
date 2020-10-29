package classe.desafio;

public class Pessoa {
	// 29.10.2020 Susi no hospital... madrugada estudando
	
	String nome;
	double peso;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(Comida comida) {
		if(comida != null) {
			this.peso += comida.peso;
		}
	}
	String apresentar() {
		return "Olá! Eu sou o " + nome + " e tenho " + peso + "kg.";
	}
}
