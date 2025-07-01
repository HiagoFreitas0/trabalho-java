
public class main {

	public static void main(String[] args) {
		char[] respostasGabarito = {'A', 'B', 'C', 'D', 'E','A', 'B', 'C', 'D', 'E','A', 'B', 'C', 'D', 'E'};
        
        Gabarito gabarito = new Gabarito(respostasGabarito);

        Prova prova1 = new Prova(gabarito);
        prova1.respostaAluno('A');
        prova1.respostaAluno('B');
        prova1.respostaAluno('C');
        prova1.respostaAluno('D');
        prova1.respostaAluno('E');
        prova1.respostaAluno('A');
        prova1.respostaAluno('B');
        prova1.respostaAluno('C');
        prova1.respostaAluno('D');
        prova1.respostaAluno('E');
        prova1.respostaAluno('A');
        prova1.respostaAluno('B');
        prova1.respostaAluno('C');
        prova1.respostaAluno('D');
        prova1.respostaAluno('E');

        Prova prova2 = new Prova(gabarito);
        prova2.respostaAluno('A');
        prova2.respostaAluno('B');
        prova2.respostaAluno('A');
        prova2.respostaAluno('D');
        prova2.respostaAluno('E');
        prova2.respostaAluno('B');
        prova2.respostaAluno('B');
        prova2.respostaAluno('D');
        prova2.respostaAluno('D');
        prova2.respostaAluno('E');
        prova2.respostaAluno('C');
        prova2.respostaAluno('B');
        prova2.respostaAluno('C');
        prova2.respostaAluno('A');
        prova2.respostaAluno('E');

        System.out.println("Aluno 1 - Acertos: " + prova1.acertos());
        System.out.println("Aluno 1 - Nota: " + prova1.nota());

        System.out.println("Aluno 2 - Acertos: " + prova2.acertos());
        System.out.println("Aluno 2 - Nota: " + prova2.nota());

        double maiorNota = prova1.maior(prova2);
        System.out.println("Maior nota entre os dois: " + maiorNota);
    }
}
