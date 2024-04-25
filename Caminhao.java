package br.edu.fatec.model;

public class Caminhao extends Veiculo{
	
	private int capacidadeCarga;
	private boolean CabineParaDormir;
	
	public Caminhao(String placa, String marca, String modelo, int ano, String fabricante ,int capacidadeCarga, boolean cabineParaDormir) {
		super(placa, marca, modelo, ano , fabricante);
		this.capacidadeCarga = capacidadeCarga;
		this.CabineParaDormir = cabineParaDormir;

	}
	
	public void vazio() {
		System.out.println("caminhao sem gasosa");
	}
	
	public void abastecer() {
		System.out.println("Abastecendo o caminhão");
	}
	
	public void capacidade() {
		System.out.println("Caminhão cheio");
	}
	
	public void dormir() {
		System.out.println("Dormir na cabine");
	}
	
	public String String2() {
		return "Caminhao: \n"
				+ "Placa Caminhão: " + this.getPlaca() + "\n"
				+ "Marca Caminhão: "+ this.getMarca() +"\n"
				+ "Modelo Caminhão: "+ this.getModelo() + "\n" 
				+ "Ano de fabricação: " +this.getAno() + "\n"
				+ "Fabricante: " +this.getFabricante() + "\n"
				+ "Capacidade da Carga do Caminhão em toneladas: " + this.capacidadeCarga + "\n"
				+ "Cabine para dormir? " + (this.CabineParaDormir == true ? "Tem" : "não tem");
	}

}

