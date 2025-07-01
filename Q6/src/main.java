
public class main {

	public static void main(String[] args) {
        Polinomio p1 = new Polinomio(new Termo(3, 2));
        p1.insere(new Termo(4, 1));

        System.out.println("Polinômio P1: " + p1);
        System.out.println("P1(2) = " + p1.calcula(2));

        Polinomio p2 = new Polinomio(new Termo(5, 2));
        p2.insere(new Termo(7, 0));

        System.out.println("\nPolinômio P2: " + p2);
        System.out.println("P2(2) = " + p2.calcula(2));

        p1.fusao(p2);
        System.out.println("\nApós fusão P1 + P2: " + p1);
        System.out.println("Novo P1(2) = " + p1.calcula(2));
    }
}
