
public class Passagem {
	
	private int id;
	private double preco;
	private Voo voo;
	
	
	
	public Passagem(int id, double preco, Voo voo) {
		
		this.id = id;
		this.preco = preco;
		this.voo = voo;
	}


	public int getId() {
		return id;
	}


	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public Voo getVoo() {
		return voo;
	}
	
	

}
