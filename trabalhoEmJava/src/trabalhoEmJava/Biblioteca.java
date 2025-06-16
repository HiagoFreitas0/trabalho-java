package trabalhoEmJava;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	
	private List<Livro> livros = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public void AdicionarAutor(Autor autor) {
        autores.add(autor);
    }

    public void AdicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void ListarLivrosDisponiveis() {
        for (Livro livro : livros) {
            if (livro.isDisponivel()) {
                System.out.println(livro);
            }
        }
    }

    public Livro EncontrarLivroPorId(int id) {
        for (Livro livro : livros) {
            if (livro.getId() == id && livro.isDisponivel()) {
                return livro;
            }
        }
        return null;
    }

    public void RegistrarEmprestimo(String nomeUsuario, Livro livro) {
        livro.setDisponivel(false);
        Emprestimo emprestimo = new Emprestimo(nomeUsuario, livro);
        emprestimos.add(emprestimo);
        System.out.println(emprestimo.getMensagemCofirmacao());
    }
}
