package listas_01_classes;

import java.util.Arrays;

public class Voo {
	
	    private int numeroVoo;
	    private Data data;
	    private boolean[] cadeiras;

	    public Voo(int numeroVoo, Data data) {
	        this.numeroVoo = numeroVoo;
	        this.data = data.clone();
	        this.cadeiras = new boolean[100]; 
	    }

	    public boolean verifica(int cadeira) {
	        if (cadeira < 0 || cadeira >= cadeiras.length) {
	            System.out.println("Número de cadeira inválido.");
	            return false;
	        }
	        return !cadeiras[cadeira];
	    }

	    public void ocupa(int cadeira) {
	        if (cadeira < 0 || cadeira >= cadeiras.length) {
	            System.out.println("Número de cadeira inválido.");
	        } else if (cadeiras[cadeira]) {
	            System.out.println("Cadeira já está ocupada.");
	        } else {
	            cadeiras[cadeira] = true;
	            System.out.println("Cadeira " + cadeira + " ocupada com sucesso.");
	        }
	    }

	    public int vagas() {
	        int contador = 0;
	        for (boolean ocupada : cadeiras) {
	            if (!ocupada) {
	                contador++;
	            }
	        }
	        return contador;
	    }

	    public int getVoo() {
	        return numeroVoo;
	    }

	    public Data getData() {
	        return data.clone();
	    }

	    public Voo clone() {
	        Voo copia = new Voo(this.numeroVoo, this.data);
	        for (int i = 0; i < cadeiras.length; i++) {
	            copia.cadeiras[i] = this.cadeiras[i];
	        }
	        return copia;
	    }

	    public String toString() {
	        return "Voo " + numeroVoo + " na data " + data.toString() + " com " + vagas() + " vagas livres.";
	    }
	}