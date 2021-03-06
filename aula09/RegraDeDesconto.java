package dominio;

public class RegraDeDesconto {

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Rodrigo");
		
		LivroFisico fisico = new LivroFisico(autor);
		fisico.setValor(39.90);
		
		if(!fisico.aplicaDescontoDe(0.3)) {
			System.out.println("Desconto no livro n�o pode ser maior do que 30%");
		}else {
			System.out.println("Valor do livro com desconto: "+fisico.getValor());
		}
		
		Ebook ebook = new Ebook(autor);
		ebook.setValor(29.90);
				
		if(!ebook.aplicaDescontoDe(0.15)) {
			System.out.println("Desconto no ebook n�o pode ser maior do que 15%");
		}else {
			System.out.println("Vaor do ebook com desconto: "+ebook.getValor());
		}
		
		

	}


}
