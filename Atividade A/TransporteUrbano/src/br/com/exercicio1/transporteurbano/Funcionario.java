package br.com.exercicio1.transporteurbano;

public class Funcionario {
	
	private int id;
	private String função;
	
	
	public Funcionario(int id, String função) {
		this.id = id;
		this.função = função;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFunção() {
		return função;
	}


	public void setFunção(String função) {
		this.função = função;
	}
	
	
	
}
