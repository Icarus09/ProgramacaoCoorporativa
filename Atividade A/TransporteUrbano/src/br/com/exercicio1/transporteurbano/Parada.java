package br.com.exercicio1.transporteurbano;

public class Parada {
	
	private int id;
	private String endereco;
	
	
	public Parada(int id, String endereco) {
		this.id = id;
		this.endereco = endereco;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}
