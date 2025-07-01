package listas_01_classes;

public class Data {
	
	    private int dia;
	    private int mes;
	    private int ano;

	    public Data(int d, int m, int a) {
	        if (verificarData(d, m, a)) {
	            dia = d;
	            mes = m;
	            ano = a;
	        } else {
	            dia = 1;
	            mes = 1;
	            ano = 1;
	        }
	    }

	    private boolean verificarData(int d, int m, int a) {
	        if (d < 1 || m < 1 || m > 12 || a < 1) {
	            return false;
	        }

	        int diasMes;
	        if (m == 2) {
	            diasMes = isBissexto() ? 29 : 28;
	        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
	            diasMes = 30;
	        } else {
	            diasMes = 31;
	        }

	        return d <= diasMes;
	    }

	    public int compara(Data outra) {
	        if (this.ano > outra.ano) return 1;
	        if (this.ano < outra.ano) return -1;

	        if (this.mes > outra.mes) return 1;
	        if (this.mes < outra.mes) return -1;

	        if (this.dia > outra.dia) return 1;
	        if (this.dia < outra.dia) return -1;

	        return 0;
	    }

	    public int getDia() {
	        return dia;
	    }

	    public int getMes() {
	        return mes;
	    }

	    public String getMesExtenso() {
	        String[] meses = {
	            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
	            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
	        };
	        return meses[mes - 1];
	    }

	    public int getAno() {
	        return ano;
	    }

	    public boolean isBissexto() {
	        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
	    }

	    public Data clone() {
	        return new Data(dia, mes, ano);
	    }

	    public String toString() {
	        return dia + "/" + mes + "/" + ano;
	    }
	}
