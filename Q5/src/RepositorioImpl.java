import java.util.ArrayList;
import java.util.Iterator;
	
public class RepositorioImpl implements Repositorio{

    private ArrayList<Pessoa> pessoas;
    private Iterator<Pessoa> iterador;

    public RepositorioImpl() {
        pessoas = new ArrayList<>();
    }

    public void guarda(Pessoa nova) {
        pessoas.add(nova);
    }

    public Pessoa recupera(String cpf) {
        for (Pessoa p : pessoas) {
            if (p.getCpf().equals(cpf)) {
                return p;
            }
        }
        return null;
    }

    public Pessoa primeiro() {
        iterador = pessoas.iterator();
        return proximo();
    }

    public Pessoa proximo() {
        if (iterador != null && iterador.hasNext()) {
            return iterador.next();
        } else {
            return null;
        }
    }
}
