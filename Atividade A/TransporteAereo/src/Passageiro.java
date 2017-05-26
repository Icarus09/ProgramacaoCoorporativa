
public class Passageiro {
	
	private String nome;
	private Passagem passagem;
	
	
	public Passageiro(String nome) {
		this.nome = nome;
		
	}
	
	public void ComprarPassagem(Passagem passagem){
		this.passagem = passagem;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Passagem getPassagem() {
		return passagem;
	}
	
	
	
	
	
}
