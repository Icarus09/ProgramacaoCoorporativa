import java.util.ArrayList;

public class Programa {
	
	private String nome;
	private Empresa empresa;
	private int Creditos;
	private ArrayList<Cliente> clientes;
	
	
	public Programa(String nome, Empresa empresa, int creditos) {
		this.nome = nome;
		this.empresa = empresa;
		Creditos = creditos;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Empresa getEmpresa() {
		return empresa;
	}
	
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	public int getCreditos() {
		return Creditos;
	}
	
	public void setCreditos(int creditos) {
		Creditos = creditos;
	}


	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	
	
	
	
}


