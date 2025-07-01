package treino3;

import java.util.ArrayList;

public class RepositorioImpl implements Repositorio{
	
	private ArrayList<Pessoa> lista = new ArrayList<>();
    private int pos = 0;

	@Override
	public void guarda(Pessoa p) {
		lista.add(p);
	}

	@Override
	public Pessoa recupera(String cpf) {
		for (Pessoa p : lista) {
            if (p.getCpf().equals(cpf)) 
            	return p;
        }
		return null;
	}

	@Override
	public Pessoa primeiro() {
		if (lista.isEmpty()) 
			return null;
        pos = 0;
        return lista.get(pos);
	}

	@Override
	public Pessoa proximo() {
		pos++;
        if (pos < lista.size()) 
        	return lista.get(pos);
		return null;
	}

}
