package treino3;

public interface Repositorio {
	 void guarda(Pessoa p);
	    Pessoa recupera(String cpf);
	    Pessoa primeiro();
	    Pessoa proximo();
}
