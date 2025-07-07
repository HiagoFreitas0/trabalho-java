package lutador;

	public class Lutador {
	
	    private String pais;
	    private String nome;
	    private float altura;

	    public Lutador(String pais, String nome, float altura) {
	        this.pais = pais;
	        this.nome = nome;
	        this.altura = altura;
	    }

	    public String getPais() {
	        return pais;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public float getAltura() {
	        return altura;
	    }

	    @Override
	    public String toString() {
	        return nome + " (" + pais + ") - " + altura + "m";
	    }
	}
