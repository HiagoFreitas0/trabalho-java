
public class Utilitaria {
	
    public static void duplica(Repositorio a, Repositorio b) {
        Pessoa p = a.primeiro();
        while (p != null) {
            b.guarda(p);
            p = a.proximo();
        }
    }

    public static void diferenca(Repositorio a, Repositorio b, Repositorio c) {
        Pessoa p = a.primeiro();
        while (p != null) {
            if (b.recupera(p.getCpf()) == null) {
                c.guarda(p);
            }
            p = a.proximo();
        }
    }
}
