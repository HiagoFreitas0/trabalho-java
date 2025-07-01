package treino2;

import java.util.ArrayList;

public class ProdutoComposto implements IProduto{

	private String nome;
	private ArrayList<IProduto> componentes;
	
	public ProdutoComposto(String nome) {
		this.nome = nome;
		this.componentes = new ArrayList<>();
	}
	
	public void adicionar(IProduto p) {
        componentes.add(p);
    }

	@Override
	public String getNome() {
		return null;
	}

	@Override
	public double getPreco() {
		double total = 0;
        for (IProduto p : componentes) {
            total += p.getPreco();
        }
        return total;
	}

	@Override
	public String toString() {
		return nome + " - R$" + getPreco();
	}
}
