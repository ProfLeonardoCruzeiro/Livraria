package dominio;

public class RegistroDeVendas {

public static void main(String[] args) {
		
		
		Autor autor = new Autor();
		autor.setNome("Arthur");
		
		LivroFisico fisico = new LivroFisico(autor);
		
		fisico.setNome("teste de rotina");
		fisico.setValor(59.90);
		
		
		Ebook ebook = new Ebook(autor);
		ebook.setNome("Test de rotina");
		ebook.setValor(29.90);
		
		
		
	
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		if(fisico.aplicaDescontoDe10Porcento()) {
			System.out.println("Valor agora é "+fisico.getValor());
		}
		
		carrinho.adiciona(fisico);
		carrinho.adiciona(ebook);
		
		
		Produto [] produtos = carrinho.getProdutos();
		
		for(int i= 0 ; i < produtos.length; i++) {
			
			Produto produto = produtos[i];
			if (produto != null) {
				System.out.println(produto.getValor());
			}
		}
		
		System.out.println("Total: "+carrinho.getTotal());
		
		
			

}


}
