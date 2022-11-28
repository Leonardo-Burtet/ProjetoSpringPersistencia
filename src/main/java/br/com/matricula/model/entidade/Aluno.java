package br.com.matricula.model.entidade;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long matricula;
	
	private String nivelEnsino;
	
	private String nome;
	
	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nivelEnsino=" + nivelEnsino + ", nome=" + nome + ", cpf=" + cpf
				+ "]";
	}
	private String cpf;
	
	public Aluno() {
		// TODO Auto-generated constructor stub
	}
	
	public Aluno(String nome, String cpf, String nivelEnsino) {
		this.nivelEnsino = nivelEnsino;
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNivelEnsino() {
		return nivelEnsino;
	}

	public void setNivelEnsino(String nivelEnsino) {
		this.nivelEnsino = nivelEnsino;
	}
	
}
