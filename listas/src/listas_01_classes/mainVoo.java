package listas_01_classes;

public class mainVoo {
	    public static void main(String[] args) {
	        Data dataVoo = new Data(20, 7, 2025);
	        Voo voo1 = new Voo(123, dataVoo);

	        System.out.println("Número do voo: " + voo1.getVoo());
	        System.out.println("Data do voo: " + voo1.getData());

	        System.out.println("Vagas livres: " + voo1.vagas());

	     
	        voo1.ocupa(10);
	        voo1.ocupa(20);
	        voo1.ocupa(10);  

	        System.out.println("Vagas livres agora: " + voo1.vagas());

	       
	        System.out.println("A cadeira 10 está livre? " + voo1.verifica(10));
	        System.out.println("A cadeira 30 está livre? " + voo1.verifica(30));

	  
	        Voo voo2 = voo1.clone();
	        System.out.println("Clone criado. Número do clone: " + voo2.getVoo());
	        System.out.println("Data do clone: " + voo2.getData());
	        System.out.println("Vagas livres no clone: " + voo2.vagas());
	    }
	} 
