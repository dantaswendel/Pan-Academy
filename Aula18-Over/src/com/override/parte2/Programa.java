package com.override.parte2;

public class Programa {

	public static void main(String[] args) {
		Veiculo moto = new Moto();
		Veiculo carro = new Carro();
		carro.iniciar();
		carro.frear();
		System.out.println();
		moto.iniciar();
		moto.frear();
		System.out.println();
		
	}
}