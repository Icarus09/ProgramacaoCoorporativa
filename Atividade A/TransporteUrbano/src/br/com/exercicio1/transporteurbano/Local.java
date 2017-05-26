package br.com.exercicio1.transporteurbano;

import java.util.ArrayList;

public class Local {
	
	private String bairro;
	private ArrayList<Parada> paradas;
	
	
	public Local(String bairro) {
		this.bairro = bairro;
	}
	
	public void AdicionaParada(Parada parada){
		paradas.add(parada);
	}
	
	public String getNome() {
		return bairro;
	}


	public void setNome(String nome) {
		this.bairro = nome;
	}


	
	
	public ArrayList<Parada> getParadas() {
		return paradas;
	}
	
	
	
	
}
