package br.com.exercicio1.transporteurbano;

import java.util.ArrayList;

public class Linha {
	
	private String nome;
	private int numero;
	private ArrayList <Local> locais;
	
	public Linha(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
	}
	
	
		
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public ArrayList<Local> getLocais() {
		return locais;
	}
	
	
}
