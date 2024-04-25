package br.edu.fatec.model;

public class Veiculo {
		private String placa;
		private String marca;
		private String modelo;
		private String fabricante;
		private int ano;
		
		public Veiculo(String placa, String marca, String modelo, int ano, String fabricante) {
			this.placa = placa;
			this.marca = marca;
			this.modelo = modelo;
			this.ano = ano;
			this.fabricante = fabricante;
		}
		
		public String getPlaca() {
			return placa;
		}
		public void setPlaca(String placa) {
			this.placa = placa;
		}
		
		
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		
		
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		
		
		public int getAno() {
			return ano;
		}
		public int setAno(int ano) {
			return this.ano = ano;
		}
		
		
		public String getFabricante() {
			return fabricante;
		}
		public String setFabricante(String fabricante) {
			return this.fabricante = fabricante;
		}
		
		
		public void ligar() {
			System.out.println("Ligou! ");
		}
		
		public void acelerar() {
			System.out.println("Acelerou");
		}
		
		public void parar() {
			System.out.println("Desacelerou");
		}
		
		public void desligar() {
			System.out.println("Desligou");
		}
		
		@Override
		public String toString() {
		    return "Veiculo" +
		           "\nplaca: " + placa +
		           "\nmarca: " + marca +
		           "\nmodelo: " + modelo +
		           "\nano: " + ano +
		           "\nfabricante: " + fabricante;
		}

}
