package oo.heranca.desafio;

public class CarroTeste {

	public static void main(String[] args) {
		// 14.11.2020
		
		Carro c1 = new Carro();
		System.out.println("Carro c " + c1.velocidade + "km/h");
		
		c1.acelerar();
		c1.acelerar();
		
		
		System.out.println("Carro c " + c1.velocidade + "km/h");
		
		c1.frear();
				
		System.out.println("Carro c " + c1.velocidade + "km/h");
		
		Clio clio = new Clio();
		
		System.out.println("Clio " + clio.velocidade + "km/h");
		
		clio.acelerar();
		clio.acelerar();
		
		System.out.println("Clio " + clio.velocidade + "km/h");
		
		clio.frear();
		System.out.println("Clio " + clio.velocidade + "km/h");
		
		NovoUno uno = new NovoUno();
		System.out.println("Novo Uno " + uno.velocidade + "km/h");
		
		uno.acelerar();
		uno.acelerar();
		
		System.out.println("Novo Uno " + uno.velocidade + "km/h");
		
		uno.frear();
		System.out.println("Novo Uno " + uno.velocidade + "km/h");
	}

}
