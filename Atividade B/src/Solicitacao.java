import java.util.ArrayList;

public class Solicitacao {
	
	private Usuario usuario;
	private Usuario solicitante;
	private String status;
	
	
	public Solicitacao(Usuario usuario, Usuario solicitante, String status) {
		this.usuario = usuario;
		this.solicitante = solicitante;
		this.status = status;
	}
	
	public void Solicitar(Usuario solicitado){
	
	}
	public void Aceitar(){
		usuario.getAmigos().add(solicitante);
	}
	public void Recusar(){
		usuario.getAmigos().remove(solicitante);
	}

	public Usuario getSolicitante() {
		return solicitante;
	}

	public String getStatus() {
		return status;
	}

	
	
}	
