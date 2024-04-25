package br.edu.fatec.model;

public class Carro extends Veiculo{

		private int qtdPortas;
		private boolean tetoSolar;
		
		public Carro(String placa, String marca, String modelo, int ano, String fabricante ,int qtdPortas, boolean tetoSolar) {
			super(placa, marca, modelo, ano, fabricante);
			this.qtdPortas = qtdPortas;
			this.tetoSolar = tetoSolar;
		}
		public void drift() {
			System.out.println("Pneu assobiou");
		}
		public String toString1() {
			return "Carro: \n"
					+ "Placa: "+ this.getPlaca() +"\n"
					+ "Marca: "+ this.getMarca() +"\n"
					+ "Modelo: "+ this.getModelo() +"\n"
					+ "Ano: " + this.getAno() + "\n"
					+ "Fabricante: " + this.getFabricante() + "\n"
					+ "Portas: " + this.qtdPortas + "\n"
					+ "TetoSolar:" + (this.tetoSolar == true ? " Possui" : "Nao Possui");
		}
	

}
