import java.util.ArrayList;

public class Usuario {
	
	private String nome;
	private LinhaDoTempo linhadotempo;
	private ArrayList <Usuario> amigos;
	private ArrayList <Grupo> grupos;
	private ArrayList <Solicitacao> solicitacoes;
	
	
	
	public Usuario(String nome, LinhaDoTempo linhadotempo){
		this.nome = nome;
		this.linhadotempo = linhadotempo;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public LinhaDoTempo getLinhadotempo() {
		return linhadotempo;
	}

	
	

	public ArrayList<Usuario> getAmigos() {
		return amigos;
	}



	public ArrayList<Grupo> getGrupos() {
		return grupos;
	}



	public ArrayList<Solicitacao> getSolicitacoes() {
		return solicitacoes;
	}
	
	
	
	
	
	
	
	
}
