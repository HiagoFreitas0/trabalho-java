package treino4;

import java.util.ArrayList;

public class Aluno {
	
	private String nome;
	private double nota;
	
	public Aluno(String nome, double nota) {
		this.nome = nome;
		this.nota = nota;
	}

	public String getNome() {
		return nome;
	}

	public double getNota() {
		return nota;
	}

	@Override
	public String toString() {
		return nome + " - Nota: " + nota;
	}
}
