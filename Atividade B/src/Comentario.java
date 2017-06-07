import java.util.ArrayList;

public class Comentario {
	
	private String data;
	private ArrayList <String> respostas;
	
	
	public Comentario(String data){
		this.data = data;
	}
	
	public ArrayList<String> getRespostas() {
		return respostas;
	}
	public String getData() {
		return data;
	}
	
	
	
}
