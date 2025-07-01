package treino3;

public class utilitaria {
	
	public static void duplicar(Repositorio A, Repositorio B) {
        for (Pessoa p = A.primeiro(); p != null; p = A.proximo()) {
            B.guarda(p);
        }
    }
	
	public static void diferenca(Repositorio A, Repositorio B, Repositorio C) {
        for (Pessoa p = A.primeiro(); p != null; p = A.proximo()) {
            if (B.recupera(p.getCpf()) == null) {
                C.guarda(p);
            }
        }
    }
}
