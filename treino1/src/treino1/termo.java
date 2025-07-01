package treino1;

public class termo implements ITermo{
	
	private double Expoente;
	private double Coeficiente;

	public termo(double expoente, double coeficiente) {
		Expoente = expoente;
		Coeficiente = coeficiente;
	}

	public double getExpoente() {
		return Expoente;
	}

	public double getCoeficiente() {
		return Coeficiente;
	}

	@Override
	public void substitui(ITermo outro) {
		this.Coeficiente = outro.getCoeficiente();
	    this.Expoente = outro.getExpoente();
	}

	@Override
	public String toString() {
		return "Expoente " + Expoente + ", Coeficiente = " + Coeficiente;
	}

	@Override
	public double calcula(double x) {
		return 0;
	}

	
	
	

}
