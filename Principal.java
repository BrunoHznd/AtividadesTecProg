package br.edu.fatecpg.main;

import br.edu.fatec.model.*;

public class Principal {

	public static void main(String[] args) {
				
				Carro carro = new Carro("B2204progphp","Fusca","Volkswagem", 1980, "Volkswagem", 2, false);
				System.out.println("o " + carro + " é um carro");	 
				carro.ligar();
				carro.acelerar();
				carro.drift();
				carro.parar();
				carro.desligar();
				System.out.println("\n");	 
				
				
				
				
				Moto moto = new Moto("uex2m02p4","Biz","Honda",2024,"Honda",false);
				System.out.println(moto);
				moto.ligar();
				moto.empinar();
				moto.oqueaconteceu();
				System.out.println("\n");	 
				
				
				Caminhao caminhao = new Caminhao("BRJaVa2024", "Volvo","Volvo FH540",2019, "Volvo", 80, false);
				System.out.println(caminhao);
				caminhao.ligar();
				caminhao.vazio();
				caminhao.abastecer();
				caminhao.capacidade();
				caminhao.acelerar();
				caminhao.parar();
				caminhao.desligar();
				caminhao.dormir();
				System.out.println("\n");	 
				
				
				
	

	}

}
