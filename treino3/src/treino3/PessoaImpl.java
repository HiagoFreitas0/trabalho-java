package treino3;

public class PessoaImpl implements Pessoa{
	
	private String nome;
    private String cpf;
    
    public PessoaImpl(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String toString() {
        return nome + " (" + cpf + ")";
    }
}
