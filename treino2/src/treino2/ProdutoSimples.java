package treino2;

public class ProdutoSimples implements IProduto{

	private String nome;
	private double preco;
	
	public ProdutoSimples(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public double getPreco() {
		return preco;
	}

	@Override
	public String toString() {
		return "nome = " + nome + ", preco = " + preco;
	}
}
