package dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
		carrinho.adiciona(ebook);
		carrinho.adiciona(ebook);
		carrinho.adiciona(ebook);
	
		List<String> nomes = new ArrayList<>();
		
		nomes.add("arthur");
		nomes.add("pedro");
		nomes.add("suelene");
		
		Collections.sort(nomes);
		
		System.out.println(nomes);
		
		List<Produto> produto = new ArrayList<>();
		
		produto.add(ebook);
		produto.add(fisico);
		
		Collections.sort(produto);

}


}