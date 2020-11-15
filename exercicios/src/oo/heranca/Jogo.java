package oo.heranca;

public class Jogo {

	public static void main(String[] args) {
		// 14.11.2020

		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;

		Heroi heroi = new Heroi();
		heroi.x = 10;
		heroi.y = 11;

		System.out.println("Monstro tem => " + monstro.vida);
		System.out.println("Heroi tem => " + heroi.vida);

		monstro.atacar(heroi);
		heroi.atacar(monstro);

		System.out.println("Monstro tem => " + monstro.vida);
		System.out.println("Heroi tem => " + heroi.vida);
	}

}
