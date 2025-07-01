
public class PessoaImpl implements Pessoa{
	
	private String cpf;
    private String nome;

    public PessoaImpl(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

	@Override
	public char tipo(int numeroCadeira) {
		if(numeroCadeira >= 1 && numeroCadeira <= 10) {
			return 'F';
		}else {
			return 'N';
		}
	}
}
