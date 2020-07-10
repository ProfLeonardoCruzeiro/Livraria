package dominio;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenandoValores {

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("athur");
		
		LivroFisico fisico = new LivroFisico(autor);
		fisico.setValor(50.56);
		
		Ebook ebook = new Ebook(autor);
		ebook.setValor(22.56);
		
		MiniLivro mini = new MiniLivro(autor);
		mini.setValor(65.56);
		
		
		List<Produto> produtos = Arrays.asList(fisico, ebook, mini);
		
		Collections.sort(produtos);
		
		for(Produto produto: produtos) {
			System.out.println(produto.getValor());
		}
		

	}

}
