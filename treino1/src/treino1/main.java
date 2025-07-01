package treino1;

public class main {
	
	public static void main(String[] args) {
        Polinomio p = new Polinomio();
        p.inserir(new termo(2, 2));  // 2x^2
        p.inserir(new termo(3, 1));  // 3x^1
        p.inserir(new termo(1, 0));  // 1

        Polinomio q = new Polinomio();
        q.inserir(new termo(5, 2));   // 5x^2
        q.inserir(new termo(-3, 1));  // -3x^1

        System.out.println("P(x): " + p);
        System.out.println("Q(x): " + q);
        System.out.println("P(2) = " + p.calcula(2));
        System.out.println("Q(2) = " + q.calcula(2));

        p.fundir(q);

        System.out.println("P(x) após fusão com Q: " + p);
    }

}
