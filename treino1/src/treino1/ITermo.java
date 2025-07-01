package treino1;

public interface ITermo {
	
	double calcula(double x); // retorna o valor do termo para um valor de x
	double getExpoente();
	double getCoeficiente();
	void substitui(ITermo outro);

}
