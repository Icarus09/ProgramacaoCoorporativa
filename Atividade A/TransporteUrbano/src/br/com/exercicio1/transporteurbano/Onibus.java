package br.com.exercicio1.transporteurbano;
import java.util.*;

public class Onibus{
	
	private int id;
	private Linha linha;
	private ArrayList <Funcionario> funcionarios;
	private ArrayList <Passageiro> passageiros;
	private final int LimitePassageiros = 30;
	private int quantidadeAtual;
	
	public Onibus(int id, Linha linha){
		
		this.id = id;
		this.linha = linha;
		funcionarios.add(new Funcionario(111,"Motorista"));
		funcionarios.add(new Funcionario(222,"Cobrador"));
		this.quantidadeAtual = 0;
	}
	
	

	private boolean Validar(){
		
		if(quantidadeAtual >= 30){
			return false;
		}
		
	return true;
	}
	
	public void AdicionaPassageiro(Passageiro passageiro){
		if(Validar()){
			this.passageiros.add(passageiro);
			quantidadeAtual++;
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}



	public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}



	public ArrayList<Passageiro> getPassageiros() {
		return passageiros;
	}

	public int getLimitePassageiros() {
		return LimitePassageiros;
	}

	public int getQuantidadeAtual() {
		return quantidadeAtual;
	}
	
	
	
}
