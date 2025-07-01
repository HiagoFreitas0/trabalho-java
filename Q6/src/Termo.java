
public class Termo {
	
    private double coeficiente;
    private int expoente;

    public Termo(double a, int i) {
        this.coeficiente = a;
        this.expoente = i;
    }

    public void insere(Termo outro) {
        this.coeficiente = outro.coeficiente;
        this.expoente = outro.expoente;
    }

    public double calcula(double x) {
        return coeficiente * Math.pow(x, expoente);
    }

    public double getCoeficiente() {
        return coeficiente;
    }

    public int getExpoente() {
        return expoente;
    }

    public void setCoeficiente(double coeficiente) {
        this.coeficiente = coeficiente;
    }

    @Override
    public String toString() {
        return coeficiente + "x^" + expoente;
    }
}
