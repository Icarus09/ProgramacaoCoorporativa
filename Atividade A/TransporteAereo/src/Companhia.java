import java.util.ArrayList;

public class Companhia {
	
	private String nome;
	private ArrayList <Aviao> avioes;
	
	public Companhia(String nome) {
		this.nome = nome;
	}
	
	public void AdicionaAviao(Aviao aviao){
		avioes.add(aviao);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Aviao> getAvioes() {
		return avioes;
	}
	
	
	
}
