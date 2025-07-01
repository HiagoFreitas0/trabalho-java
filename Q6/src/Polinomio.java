import java.util.ArrayList;
public class Polinomio {

    private ArrayList<Termo> termos;

    public Polinomio(Termo termoInicial) {
        termos = new ArrayList<>();
        termos.add(termoInicial);
    }

    public void insere(Termo novoTermo) {
        boolean encontrado = false;
        for (Termo t : termos) {
            if (t.getExpoente() == novoTermo.getExpoente()) {
                t.setCoeficiente(t.getCoeficiente() + novoTermo.getCoeficiente());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            termos.add(novoTermo);
        }
    }

    public double calcula(double x) {
        double resultado = 0;
        for (Termo t : termos) {
            resultado += t.calcula(x);
        }
        return resultado;
    }

    public void fusao(Polinomio outro) {
        for (Termo t : outro.termos) {
            this.insere(new Termo(t.getCoeficiente(), t.getExpoente()));
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        termos.sort((a, b) -> b.getExpoente() - a.getExpoente());
        for (int i = 0; i < termos.size(); i++) {
            Termo t = termos.get(i);
            sb.append(t.toString());
            if (i != termos.size() - 1) {
                sb.append(" + ");
            }
        }
        return sb.toString();
    }
}
