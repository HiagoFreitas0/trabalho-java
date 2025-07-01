package treino1;

import java.util.ArrayList;

public class Polinomio {
	
	private ArrayList<ITermo> termos;
	
	public Polinomio() {
        termos = new ArrayList<>();
    }
	
	public void inserir(ITermo novo) {
		
		for(ITermo t : termos) {
			if(t.getExpoente() == novo.getExpoente()) {
				double soma = t.getCoeficiente() + novo.getCoeficiente();
				termo combinado = new termo(soma, t.getExpoente());
				termos.remove(t);
                termos.add(combinado);
                return;
			}
		}
		termos.add(novo);
	}
	
	public double calcula(double x) {
		
		double resultado = 0;
        for (ITermo t : termos) {
            resultado += t.calcula(x);
        }
        return resultado;
	}
	
	public void fundir(Polinomio outro) {
		for (ITermo t : outro.termos) {
            this.inserir(t);
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
        termos.sort((a, b) -> b.getExpoente() - a.getExpoente());
        for (int i = 0; i < termos.size(); i++) {
            sb.append(termos.get(i));
            if (i < termos.size() - 1) sb.append(" + ");
        }
        return sb.toString();
	}
}
