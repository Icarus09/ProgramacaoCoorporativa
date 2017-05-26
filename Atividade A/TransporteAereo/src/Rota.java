
public class Rota {
	
	private String nome; // Cidade A a Cidade B //
	private String tempo;
	private String espaco;
	
	
	public Rota(String nome, String tempo, String espaco) {
		this.nome = nome;
		this.tempo = tempo;
		this.espaco = espaco;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTempo() {
		return tempo;
	}


	public void setTempo(String tempo) {
		this.tempo = tempo;
	}


	public String getEspaco() {
		return espaco;
	}


	public void setEspaco(String espaco) {
		this.espaco = espaco;
	}
	
	
	


}

