package treino2;

public class main {

	public static void main(String[] args) {
		
		ProdutoSimples prego = new ProdutoSimples("Prego", 0.10);
        ProdutoSimples tabua = new ProdutoSimples("Tábua", 1.50);

        ProdutoComposto caixa = new ProdutoComposto("Caixa de Madeira");
        for (int i = 0; i < 20; i++) 
        	caixa.adicionar(prego);
        for (int i = 0; i < 10; i++) 
        	caixa.adicionar(tabua);

        System.out.println(caixa);

	}

}
