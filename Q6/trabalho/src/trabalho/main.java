package trabalho;

import java.time.LocalDate;

public class main {
	
	 public static void main(String[] args) {
		 
	        Biblioteca biblioteca = new Biblioteca();

	        Autor a1 = new Autor(1, "Machado de Assis", LocalDate.of(1839, 6, 21));
	        Autor a2 = new Autor(2, "Clarice Lispector", LocalDate.of(1920, 12, 10));

	        biblioteca.addAutor(a1);
	        biblioteca.addAutor(a2);

	        biblioteca.addLivro(new Livro(1, "Dom Casmurro", a1));
	        biblioteca.addLivro(new Livro(2, "A Hora da Estrela", a2));

	        biblioteca.menu();
	    }

}
