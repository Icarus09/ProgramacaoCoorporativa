import java.util.ArrayList;

public class Compra {
	
	private Cliente cliente;
	private Programa programa;
	private int quantidadeProdutos;
	private ArrayList <Produto> produtos;
	
	
	public Compra(Cliente cliente, Programa programa, ArrayList<Produto> produtos) {
		
		this.cliente = cliente;
		this.programa = programa;
		this.produtos = produtos;
	}
	
	
	public void Comprar(ArrayList <Produto> produtos, int quantidadeProdutos){
		int pontos = programa.getCreditos() * quantidadeProdutos;
		this.cliente.setPontos(pontos);
	}


	public int getQuantidadeProdutos() {
		return quantidadeProdutos;
	}


	public void setQuantidadeProdutos(int quantidadeProdutos) {
		this.quantidadeProdutos = quantidadeProdutos;
	}


	public ArrayList<Produto> getProdutos() {
		return produtos;
	}


	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public Programa getPrograma() {
		return programa;
	}


	
	
	
}
