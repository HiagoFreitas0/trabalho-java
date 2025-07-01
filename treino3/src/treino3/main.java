package treino3;

public class main {
	
	public static void main(String[] args) {
        Repositorio A = new RepositorioImpl();
        Repositorio B = new RepositorioImpl();
        Repositorio C = new RepositorioImpl();

        A.guarda(new PessoaImpl("Ana", "111"));
        A.guarda(new PessoaImpl("Beto", "222"));
        A.guarda(new PessoaImpl("Caio", "333"));
        A.guarda(new PessoaImpl("Dani", "444"));

        B.guarda(new PessoaImpl("Beto", "222"));
        B.guarda(new PessoaImpl("Caio", "333"));

        utilitaria.diferenca(A, B, C);

        for (Pessoa p = C.primeiro(); p != null; p = C.proximo()) {
            System.out.println(p);
        }
    }

}
