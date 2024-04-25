package br.edu.fatec.model;

public class Moto extends Veiculo{
		
		private boolean sidecar;
		
		public Moto(String placa, String marca, String modelo, int ano, String fabricante,boolean sidecar) {
			super(placa, marca, modelo,ano,fabricante);
			this.sidecar = sidecar;
		}
		
		public void empinar() {
			System.out.println("empinou a moto");
		}
		
		public void oqueaconteceu() {
			System.out.println("caiu e bateu a cara no chão");
		}
		
		public String toString3() {
		return "Carro: \n"
			+ "Placa: "+ this.getPlaca() +"\n"
			+ "Marca: "+ this.getMarca() +"\n"
			+ "Modelo: "+ this.getModelo() +"\n"
			+ "Ano: " + this.getAno() + "\n"
			+ "Fabricante: " + this.getFabricante() + "\n"
			+ "TetoSolar:" + (this.sidecar == true ? " Possui" : "Nao Possui");
		
		}

}
