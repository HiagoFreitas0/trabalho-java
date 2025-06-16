package trabalhoEmJava;

public class Emprestimo {
	
	private String nomeDeUsuario;
	private Livro livro;
	
	public Emprestimo(String nomeDeUsuario, Livro livro) {
		this.nomeDeUsuario = nomeDeUsuario;
		this.livro = livro;
	}
	
	public String getMensagemCofirmacao() {
		return "livro/ " +  livro.getTitulo() + "/" + "emprestimo feito com sucesso para " + nomeDeUsuario; 
	}
}
