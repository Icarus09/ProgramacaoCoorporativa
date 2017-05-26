package br.com.exercicio1.transporteurbano;

import java.util.ArrayList;

public class Empresa {
	
	private String nome;
	private int cnpj;
	private ArrayList <Onibus> frota;
	
	
	public Empresa(String nome, int cnpj) {
		this.nome = nome;
		this.cnpj = cnpj;
	}
	
	public void CadastraOnibus(Onibus onibus){
		frota.add(onibus);
	}
	
	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Onibus> getFrota() {
		return frota;
	}
	
	
	
	
}
