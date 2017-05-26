import java.util.ArrayList;

public class Voo {
	
	private int id;
	private Aviao aviao;
	private Rota rota;
	private String horario;
	private Escala escala;
	private ArrayList <Passageiro> Passageiros;
	
	public Voo(int id, Aviao aviao, Rota rota, String horario, Escala escala) {
		
		this.id = id;
		this.aviao = aviao;
		this.rota = rota;
		this.horario = horario;
		this.escala = escala;
	}
	
	
	public int getId() {
		return id;
	}

	public Aviao getAviao() {
		return aviao;
	}

	public Rota getRota() {
		return rota;
	}

	public String getHorario() {
		return horario;
	}

	public Escala getEscala() {
		return escala;
	}

	public ArrayList<Passageiro> getPassageiros() {
		return Passageiros;
	}

}
