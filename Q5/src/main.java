
public class main {
	
    public static void main(String[] args) {
    	
        Repositorio repoA = new RepositorioImpl();
        Repositorio repoB = new RepositorioImpl();
        Repositorio repoC = new RepositorioImpl();

        repoA.guarda(new PessoaImpl("111", "Alice"));
        repoA.guarda(new PessoaImpl("222", "Bob"));
        repoA.guarda(new PessoaImpl("333", "Carlos"));

        repoB.guarda(new PessoaImpl("222", "Bob"));
        repoB.guarda(new PessoaImpl("444", "Diana"));
        
        
        Pessoa pTeste = new PessoaImpl("555", "Teste");
        System.out.println("Pessoa " + pTeste.getNome() + ", cadeira 5: " + pTeste.tipo(5));
        System.out.println("Pessoa " + pTeste.getNome() + ", cadeira 20: " + pTeste.tipo(20));
        
        System.out.println("== DUPLICA A em C ==");
        Utilitaria.duplica(repoA, repoC);
        Pessoa p = repoC.primeiro();
        while (p != null) {
            System.out.println(p.getCpf() + " - " + p.getNome());
            p = repoC.proximo();
        }

        Repositorio repoD = new RepositorioImpl();
        Utilitaria.diferenca(repoA, repoB, repoD);
        System.out.println("\n== DIFERENÇA (A - B) ==");
        p = repoD.primeiro();
        while (p != null) {
            System.out.println(p.getCpf() + " - " + p.getNome());
            p = repoD.proximo();
        }
        
        Repositorio repoD = new RepositorioImpl();
        Utilitaria.diferenca(repoA, repoB, repoD);
        System.out.println("\n== DIFERENÇA (A - B) ==");
        p = repoD.primeiro();
        while (p != null) {
            System.out.println(p.getCpf() + " - " + p.getNome());
            p = repoD.proximo();
        }
    }
}
