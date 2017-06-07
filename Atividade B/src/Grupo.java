import java.util.ArrayList;

public class Grupo {
	
	private String nome;
	private String visiblidade;
	private ArrayList <Usuario> membros;
	
	
	public Grupo(String nome, String visiblidade) {
		super();
		this.nome = nome;
		this.visiblidade = visiblidade;
	}
	
	public void CriarGrupo(){
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getVisiblidade() {
		return visiblidade;
	}

	public void setVisiblidade(String visiblidade) {
		this.visiblidade = visiblidade;
	}

	public ArrayList<Usuario> getMembros() {
		return membros;
	}
	
	
	
	
}
