import java.util.ArrayList;

public class Arquivo {
	private String nome;
	private ArrayList <Usuario> usuarios;
	
	
	public Arquivo(String nome) {
		this.nome = nome;
	}

	
	public void MudarPermissao(Usuario usuario, Permissao permissao){
		usuario.setPermissao(permissao);
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}


	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	
	
	
	
}
