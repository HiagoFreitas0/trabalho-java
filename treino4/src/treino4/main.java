package treino4;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();

        System.out.print("Quantos alunos deseja cadastrar? ");
        int qtd = sc.nextInt();
        
        for (int i = 0; i < qtd; i++) {
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Nota: ");
            double nota = sc.nextDouble();
            alunos.add(new Aluno(nome, nota));
        }
        
        double soma = 0;
        for (Aluno a : alunos) {
            soma += a.getNota();
        }
        double media = soma / alunos.size();
        System.out.println("Média das notas: " + media);

        System.out.println("Alunos acima da média:");
        for (Aluno a : alunos) {
            if (a.getNota() > media) {
                System.out.println(a);
            }
        }

        sc.close();
	}
}
