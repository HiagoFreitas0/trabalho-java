
public class Prova {
	
	private Gabarito gabarito;
    private char[] respostasAluno;
    private int quantidadeRespostas;

    public Prova(Gabarito gabarito) {
        this.gabarito = gabarito;
        this.respostasAluno = new char[15];
        this.quantidadeRespostas = 0;
    }

    public void respostaAluno(char resposta) {
        if (quantidadeRespostas < 15) {
            respostasAluno[quantidadeRespostas] = resposta;
            quantidadeRespostas++;
        } else {
            System.out.println("Todas as respostas ja foram inseridas");
        }
    }

	public int acertos() {
	    int acertos = 0;
	    for (int i = 0; i < quantidadeRespostas; i++) {
	        if (respostasAluno[i] == gabarito.respostaQuestao(i + 1)) {
	            acertos++;
	        }
	    }
	    return acertos;
	}
	
	public double nota() {
	    double nota = 0;
	    for (int i = 0; i < quantidadeRespostas; i++) {
	        if (respostasAluno[i] == gabarito.respostaQuestao(i + 1)) {
	            if (i < 10) {
	                nota += 0.5;
	            } else {
	                nota += 1.0;
	            }
	        }
	    }
	    return nota;
	}
	
	public double maior(Prova outraProva) {
	    int acertosEsta = this.acertos();
	    int acertosOutra = outraProva.acertos();
	
	    if (acertosEsta > acertosOutra) {
	        return this.nota();
	    } else if (acertosOutra > acertosEsta) {
	        return outraProva.nota();
	    } else {
	        double notaEsta = this.nota();
	        double notaOutra = outraProva.nota();
	
	        if (notaEsta > notaOutra) {
	            return notaEsta;
	        } else if (notaOutra > notaEsta) {
	            return notaOutra;
	        } else {
	            return notaEsta;
	        }
	    }
	}
}
