
public class main_PolinomioComSub {
	
	public static void main(String[] args) {
		
        Polinomio p1 = new Polinomio(new Termo(2, 2));
        p1.insere(new Termo(3, 1));

        Polinomio p2 = new Polinomio(new Termo(5, 1));
        p2.insere(new Termo(1, 0));

        PolinomioComSub pComSub = new PolinomioComSub();
        pComSub.insere(p1);
        pComSub.insere(p2);
        pComSub.insere(new Termo(4, 3));

        System.out.println("Polinômio com sub-pol: " + pComSub);
        System.out.println("Resultado P(x) em x = 2: " + pComSub.calcula(2));

        Polinomio resultado = pComSub.fundirTudo();
        System.out.println("Após fusão completa: " + resultado);
        System.out.println("Resultado da fusão em x = 2: " + resultado.calcula(2));
    }

}
