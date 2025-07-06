import java.util.ArrayList;

public class PolinomioComSub implements Calculavel {
    private ArrayList<Object> elementos;

    public PolinomioComSub() {
        elementos = new ArrayList<>();
    }

    @Override
    public void insere(Termo termo) {
        elementos.add(termo);
    }

    public void insere(Calculavel subPolinomio) {
        elementos.add(subPolinomio);
    }

    @Override
    public float calcula(double x) {
        float resultado = 0;
        for (Object obj : elementos) {
            if (obj instanceof Termo) {
                resultado += ((Termo) obj).calcula(x);
            } else if (obj instanceof Calculavel) {
                resultado += ((Calculavel) obj).calcula(x);
            }
        }
        return resultado;
    }

    public Polinomio fundirTudo() {
        Polinomio p = new Polinomio(new Termo(0, 0));
        for (Object obj : elementos) {
            if (obj instanceof Termo) {
                p.insere((Termo) obj);
            } else if (obj instanceof PolinomioComSub) {
                Polinomio sub = ((PolinomioComSub) obj).fundirTudo();
                p.fusao(sub);
            } else if (obj instanceof Polinomio) {
                p.fusao((Polinomio) obj);
            }
        }
        return p;
    }

    public void fusao(Calculavel outro) {
        this.insere(outro);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Object obj : elementos) {
            sb.append("(").append(obj.toString()).append(") + ");
        }
        if (!elementos.isEmpty()) {
            sb.setLength(sb.length() - 3);
        }
        return sb.toString();
    }
}
