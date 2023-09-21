package Leitura_Escrita;

public class Consulta {
	private String nomePende;
	private String nomeDepen;
	
public Consulta() {}
	
	public Consulta (String nomePende,  String nomeDepen) {
		this.nomePende = nomePende;
		this.nomeDepen = nomeDepen;
	}
	public String getNomePende() {
		return nomePende;
	}
	
	public void setNomePende(String nomePende) {
		this.nomePende = nomePende;
	}
	
	public String getNomeDepen() {
		return nomeDepen;
	}
	
	public void setNomeDepen(String nomeDepen) {
	this.nomeDepen = nomeDepen;
	}
}
