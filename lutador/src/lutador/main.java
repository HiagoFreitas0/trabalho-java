package lutador;

import java.util.ArrayList;
import java.util.Scanner;

	public class main {
		
	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        ArrayList<Lutador> lista = new ArrayList<>();
	        String pais;
	        final int MAX = 800;

	        System.out.println("Digite os dados dos lutadores (PAIS NOME ALTURA). Use 'ZZZ' para encerrar.");

	        while (lista.size() < MAX) {
	            System.out.print("País (ou 'ZZZ' para encerrar): ");
	            pais = sc.nextLine().toUpperCase();

	            if (pais.equals("ZZZ"))
	            	break;

	            System.out.print("Nome: ");
	            String nome = sc.nextLine();

	            System.out.print("Altura: ");
	            float altura = Float.parseFloat(sc.nextLine());

	            lista.add(new Lutador(pais, nome, altura));
	        }

	        float soma = 0;
	        for (Lutador l : lista) {
	            soma += l.getAltura();
	        }
	        float media = lista.size() > 0 ? soma / lista.size() : 0;
	        System.out.printf("Altura média dos atletas: %.2f\n", media);

	        System.out.println("\nLutadores do Brasil com altura ≥ média:");
	        for (Lutador l : lista) {
	            if (l.getPais().equals("BRA") && l.getAltura() >= media) {
	                System.out.println(l);
	            }
	        }
	        sc.close();
	    }
	}
