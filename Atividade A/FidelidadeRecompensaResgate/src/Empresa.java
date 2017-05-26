
public class Empresa {
	
	private String nome;
	private String Cnpj;
	
	
	public Empresa(String nome, String cnpj) {
		this.nome = nome;
		Cnpj = cnpj;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCnpj() {
		return Cnpj;
	}


	public void setCnpj(String cnpj) {
		Cnpj = cnpj;
	}
	
	
	
	
}
