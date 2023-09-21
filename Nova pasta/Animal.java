package Leitura_Escrita;

public class Animal {
	private int tamanho;
	private String cor;

	public Animal() {}
	
	public Animal (String cor, int tamanho) {
		this.tamanho = tamanho;
		this.cor = cor;
	}
	public int getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
	this.cor = cor;
	}
	
}
