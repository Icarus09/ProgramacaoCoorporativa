import java.util.ArrayList;

public class Usuario {
	
	private String nome;
	private ArrayList <Post> posts;
	private ArrayList <Notificacao> notificacoes;
	private ArrayList <Usuario> amigos;
	private ArrayList <Grupo> grupos;
	private ArrayList <Solicitacao> solicitacoes;
	
	
	
	public Usuario(String nome){
		this.nome = nome;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
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
