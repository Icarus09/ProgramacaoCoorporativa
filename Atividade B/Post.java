import java.util.ArrayList;

public class Post {
	
	private String conteudo;
	private String data;
	private ArrayList<Comentario> comentarios;
	private ArrayList<Curtida> curtidas;
	
	public Post(String conteudo, String data){
		this.conteudo = conteudo;
		this.data = data;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public ArrayList<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(ArrayList<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	public ArrayList<Curtida> getCurtidas() {
		return curtidas;
	}
	
	
	
	
}
