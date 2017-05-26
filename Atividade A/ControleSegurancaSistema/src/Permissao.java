
public class Permissao {
	
	private String nivelAcesso;
	private String descricao;
	
	public Permissao(String nivelAcesso, String descricao) {
		this.nivelAcesso = nivelAcesso;
		this.descricao = descricao;
	}

	public String getNivelAcesso() {
		return nivelAcesso;
	}

	public void setNivelAcesso(String nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
