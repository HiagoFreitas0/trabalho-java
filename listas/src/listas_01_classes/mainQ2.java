package listas_01_classes;

public class mainQ2 {
	    public static void main(String[] args) {
	        Data data1 = new Data(15, 6, 2025);
	        Data data2 = new Data(10, 6, 2025);
	        Data data3 = data1.clone();

	        System.out.println("Data 1: " + data1);
	        System.out.println("Data 2: " + data2);
	        System.out.println("Data 3 (clone de Data 1): " + data3);

	        int resultado = data1.compara(data2);
	        if (resultado == 0) {
	            System.out.println("As datas sao iguais");
	        } else if (resultado == 1) {
	            System.out.println("Data 1 e maior que Data 2");
	        } else {
	            System.out.println("Data 2 e maior que Data 1");
	        }

	      
	        System.out.println("Mes da data 1: " + data1.getMesExtenso());

	
	        System.out.println("O ano da data 1 e bissexto? " + (data1.isBissexto() ? "sim" : "nao"));


	        Data invalida = new Data(31, 2, 2025);
	        System.out.println("Data invalida criada: " + invalida);
	    }
	}

