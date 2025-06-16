package trabalhoEmJava;

import java.time.LocalDate;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        Autor autor1 = new Autor(1, "Machado de Assis", LocalDate.of(1839, 6, 21));
        Autor autor2 = new Autor(2, "Clarice Lispector", LocalDate.of(1920, 12, 10));

        biblioteca.AdicionarAutor(autor1);
        biblioteca.AdicionarAutor(autor2);

        biblioteca.AdicionarLivro(new Livro(1, "Dom Casmurro", autor1));
        biblioteca.AdicionarLivro(new Livro(2, "A Hora da Estrela", autor2));

        while (true) {
            System.out.println("Deseja ver os livros disponiveis? (sim/nao)");
            String resposta = scanner.nextLine().trim().toLowerCase();

            if (resposta.equals("sim")) {
                biblioteca.ListarLivrosDisponiveis();

                System.out.println("Digite o ID do livro que deseja emprestar:");
                int idLivro = Integer.parseInt(scanner.nextLine());

                Livro livroSelecionado = biblioteca.EncontrarLivroPorId(idLivro);
                if (livroSelecionado == null) {
                    System.out.println("Livro nao encontrado ou indisponivel");
                    continue;
                }

                System.out.println("Digite seu nome:");
                String nomeUsuario = scanner.nextLine();

                biblioteca.RegistrarEmprestimo(nomeUsuario, livroSelecionado);
            } else if (resposta.equals("nao") || resposta.equals("nao")) {
                System.out.println("Fim da aplicacao");
                break;
            } else {
                System.out.println("Resposta invalida");
            }
        }
        scanner.close();
    }

}
