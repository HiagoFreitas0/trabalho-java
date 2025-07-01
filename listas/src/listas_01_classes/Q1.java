package listas_01_classes;

public class Q1 {
	
	private String matricula;
	private String nome;
	private double nota1;
	private double nota2;
	private double NotaTrabalho;
	
	public Q1(String matricula, String nome, float nota1, float nota2, float notaTrabalho) {
		this.matricula = matricula;
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		NotaTrabalho = notaTrabalho;
	}
	
	public double calcularMedia() {
		return (nota1 * 2.5 + nota2 + 2.5 + NotaTrabalho * 2 )/7;
	}
	
	public double calcularNotaFinal() {
		double media = calcularMedia();
		if(nota1>=7) {
			return 0;
		} else {
			double notaNecessaria = (5 * 2) - media;
			return notaNecessaria > 10 ? 10 : Math.max(notaNecessaria,0);
		}
		
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNotaTrabalho() {
		return NotaTrabalho;
	}

	public void setNotaTrabalho(double notaTrabalho) {
		NotaTrabalho = notaTrabalho;
	}
	
	
}
